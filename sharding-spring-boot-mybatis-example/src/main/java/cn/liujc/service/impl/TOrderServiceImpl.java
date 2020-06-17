package cn.liujc.service.impl;

import cn.liujc.dao.TItemMapper;
import cn.liujc.model.TItem;
import cn.liujc.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.model.TOrder;
import cn.liujc.dao.TOrderMapper;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {

    @Autowired
    private TItemMapper itemMapper;

    @Override
    public List<TItem> getItemByOrderName(String name) {
        return itemMapper.getItemByOrderName(name);
    }

    @Override
    public List<TItem> getItemByOrderId(Long id) {
        return itemMapper.getItemByOrderId(id);
    }
}

