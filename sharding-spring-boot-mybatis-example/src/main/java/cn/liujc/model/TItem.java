package cn.liujc.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "t_item")
public class TItem implements Serializable {
    @TableId(value = "id")
    private Long id;

    @TableField(value = "order_id")
    private Long orderId;

    @TableField(value = "item_name")
    private String itemName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_ITEM_NAME = "item_name";
}