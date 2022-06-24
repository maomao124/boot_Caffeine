package mao.boot_caffeine.service.impl;

import mao.boot_caffeine.entity.ItemStock;
import mao.boot_caffeine.mapper.ItemStockMapper;
import mao.boot_caffeine.service.IItemStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-06-24
 */
@Service
public class ItemStockServiceImpl extends ServiceImpl<ItemStockMapper, ItemStock> implements IItemStockService
{

}
