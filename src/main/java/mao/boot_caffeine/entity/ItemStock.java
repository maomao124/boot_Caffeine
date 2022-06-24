package mao.boot_caffeine.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 *
 * </p>
 *
 * @author mao
 * @since 2022 -06-24
 */


@TableName("tb_item_stock")
@ApiModel(value = "ItemStock对象", description = "")
public class ItemStock implements Serializable
{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品id，关联tb_item表")
    private Long itemId;

    @ApiModelProperty("商品库存")
    private Integer stock;

    @ApiModelProperty("商品销量")
    private Integer sold;


    /**
     * Gets item id.
     *
     * @return the item id
     */
    public Long getItemId()
    {
        return itemId;
    }

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(Long itemId)
    {
        this.itemId = itemId;
    }

    /**
     * Gets stock.
     *
     * @return the stock
     */
    public Integer getStock()
    {
        return stock;
    }

    /**
     * Sets stock.
     *
     * @param stock the stock
     */
    public void setStock(Integer stock)
    {
        this.stock = stock;
    }

    /**
     * Gets sold.
     *
     * @return the sold
     */
    public Integer getSold()
    {
        return sold;
    }

    /**
     * Sets sold.
     *
     * @param sold the sold
     */
    public void setSold(Integer sold)
    {
        this.sold = sold;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("itemId：").append(itemId).append('\n');
        stringbuilder.append("stock：").append(stock).append('\n');
        stringbuilder.append("sold：").append(sold).append('\n');
        return stringbuilder.toString();
    }
}
