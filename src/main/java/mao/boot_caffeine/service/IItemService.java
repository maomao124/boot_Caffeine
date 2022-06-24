package mao.boot_caffeine.service;

import mao.boot_caffeine.entity.Item;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品表 服务类
 * </p>
 *
 * @author mao
 * @since 2022-06-24
 */
public interface IItemService extends IService<Item>
{

    void saveItem(Item item);


    Item findById(Long id);
}
