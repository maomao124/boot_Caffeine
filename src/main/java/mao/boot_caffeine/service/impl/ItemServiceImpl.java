package mao.boot_caffeine.service.impl;

import mao.boot_caffeine.entity.Item;
import mao.boot_caffeine.entity.ItemStock;
import mao.boot_caffeine.mapper.ItemMapper;
import mao.boot_caffeine.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mao.boot_caffeine.service.IItemStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-06-24
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService
{

    @Autowired
    private IItemStockService stockService;

    @Override
    public void saveItem(Item item)
    {
        // 新增商品
        save(item);
        // 新增库存
        ItemStock stock = new ItemStock();
        stock.setItemId(item.getId());
        stock.setStock(item.getStock());
        stockService.save(stock);
    }
}
