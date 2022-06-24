package mao.boot_caffeine.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mao.boot_caffeine.entity.Item;
import mao.boot_caffeine.entity.ItemStock;
import mao.boot_caffeine.entity.PageDTO;
import mao.boot_caffeine.service.IItemService;
import mao.boot_caffeine.service.IItemStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author mao
 * @since 2022-06-24
 */
@RestController
@RequestMapping("/item")
public class ItemController
{
    @Autowired
    private IItemService itemService;
    @Autowired
    private IItemStockService stockService;

    /**
     * 分页查询商品
     *
     * @param page 页号
     * @param size 页大小
     * @return PageDTO
     */
    @GetMapping("list")
    public PageDTO queryItemPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "5") Integer size)
    {
        // 分页查询商品
        Page<Item> result = itemService.query()
                .ne("status", 3)
                .page(new Page<>(page, size));

        // 查询库存
        List<Item> list = result.getRecords().stream().peek(item ->
        {
            ItemStock stock = stockService.getById(item.getId());
            item.setStock(stock.getStock());
            item.setSold(stock.getSold());
        }).collect(Collectors.toList());

        // 封装返回
        return new PageDTO(result.getTotal(), list);
    }

    /**
     * 保存商品信息
     *
     * @param item Item
     */
    @PostMapping
    public void saveItem(@RequestBody Item item)
    {
        itemService.saveItem(item);
    }

    /**
     * 更新商品信息
     *
     * @param item Item
     */
    @PutMapping
    public void updateItem(@RequestBody Item item)
    {
        itemService.updateById(item);
    }

    /**
     * 更改库存
     *
     * @param itemStock ItemStock
     */
    @PutMapping("stock")
    public void updateStock(@RequestBody ItemStock itemStock)
    {
        stockService.updateById(itemStock);
    }

    /**
     * 删除商品
     *
     * @param id 商品的id
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id)
    {
        itemService.update().set("status", 3).eq("id", id).update();
    }

    /**
     * 查找商品
     *
     * @param id 商品的id
     * @return Item
     */
    @GetMapping("/{id}")
    public Item findById(@PathVariable("id") Long id)
    {
        return itemService.query()
                .ne("status", 3).eq("id", id)
                .one();
    }

    /**
     * 根据id查询库存
     *
     * @param id id
     * @return ItemStock
     */
    @GetMapping("/stock/{id}")
    public ItemStock findStockById(@PathVariable("id") Long id)
    {
        return stockService.getById(id);
    }
}

