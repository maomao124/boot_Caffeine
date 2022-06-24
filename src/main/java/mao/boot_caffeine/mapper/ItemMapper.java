package mao.boot_caffeine.mapper;

import mao.boot_caffeine.entity.Item;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author mao
 * @since 2022-06-24
 */

@Mapper
public interface ItemMapper extends BaseMapper<Item>
{

}
