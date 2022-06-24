package mao.boot_caffeine.service.impl;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import mao.boot_caffeine.entity.Item;
import mao.boot_caffeine.entity.ItemStock;
import mao.boot_caffeine.mapper.ItemMapper;
import mao.boot_caffeine.service.IItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mao.boot_caffeine.service.IItemStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.function.Function;

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

    Cache<Long, Item> cache = Caffeine.newBuilder().expireAfterWrite(Duration.ofSeconds(60)).build();

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

    @Override
    public Item findById(Long id)
    {
        Item item = cache.get(id, new Function<Long, Item>()
        {
            @Override
            public Item apply(Long aLong)
            {
                return query()
                        .ne("status", 3).eq("id", id)
                        .one();
            }
        });
        return item;
    }

}
