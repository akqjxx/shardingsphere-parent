package cn.liujc.service.impl;

import cn.liujc.model.TItem;
import cn.liujc.model.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TOrderService extends IService<TOrder> {


    List<TItem> getItemByOrderName(String name);

    List<TItem> getItemByOrderId(Long name);
}

