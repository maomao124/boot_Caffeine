package mao.boot_caffeine.entity;

import java.util.List;

/**
 * Project name(项目名称)：boot_Caffeine
 * Package(包名): mao.boot_caffeine.entity
 * Class(类名): PageDTO
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/6/24
 * Time(创建时间)： 17:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class PageDTO
{
    private Long total;
    private List<Item> list;

    /**
     * Instantiates a new Page dto.
     */
    public PageDTO()
    {
    }

    /**
     * Instantiates a new Page dto.
     *
     * @param total the total
     * @param list  the list
     */
    public PageDTO(Long total, List<Item> list)
    {
        this.total = total;
        this.list = list;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public Long getTotal()
    {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Long total)
    {
        this.total = total;
    }

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<Item> getList()
    {
        return list;
    }

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<Item> list)
    {
        this.list = list;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("total：").append(total).append('\n');
        stringbuilder.append("list：").append(list).append('\n');
        return stringbuilder.toString();
    }
}
