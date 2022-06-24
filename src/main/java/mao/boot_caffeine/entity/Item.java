package mao.boot_caffeine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 商品表
 * </p>
 *
 * @author mao
 * @since 2022 -06-24
 */


@TableName("tb_item")
@ApiModel(value = "Item对象", description = "商品表")
public class Item implements Serializable
{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商品标题")
    private String title;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("价格（分）")
    private Long price;

    @ApiModelProperty("商品图片")
    private String image;

    @ApiModelProperty("类目名称")
    private String category;

    @ApiModelProperty("品牌名称")
    private String brand;

    @ApiModelProperty("规格")
    private String spec;

    @ApiModelProperty("商品状态 1-正常，2-下架，3-删除")
    private Integer status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @TableField(exist = false)
    private Integer stock;
    @TableField(exist = false)
    private Integer sold;


    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Long getPrice()
    {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Long price)
    {
        this.price = price;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage()
    {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image)
    {
        this.image = image;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category)
    {
        this.category = category;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand()
    {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    /**
     * Gets spec.
     *
     * @return the spec
     */
    public String getSpec()
    {
        return spec;
    }

    /**
     * Sets spec.
     *
     * @param spec the spec
     */
    public void setSpec(String spec)
    {
        this.spec = spec;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Integer getStatus()
    {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public LocalDateTime getCreateTime()
    {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(LocalDateTime createTime)
    {
        this.createTime = createTime;
    }

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public LocalDateTime getUpdateTime()
    {
        return updateTime;
    }

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(LocalDateTime updateTime)
    {
        this.updateTime = updateTime;
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
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("title：").append(title).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("price：").append(price).append('\n');
        stringbuilder.append("image：").append(image).append('\n');
        stringbuilder.append("category：").append(category).append('\n');
        stringbuilder.append("brand：").append(brand).append('\n');
        stringbuilder.append("spec：").append(spec).append('\n');
        stringbuilder.append("status：").append(status).append('\n');
        stringbuilder.append("createTime：").append(createTime).append('\n');
        stringbuilder.append("updateTime：").append(updateTime).append('\n');
        return stringbuilder.toString();
    }
}
