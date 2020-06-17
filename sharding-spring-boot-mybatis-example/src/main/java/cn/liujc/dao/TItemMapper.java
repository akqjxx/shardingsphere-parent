package cn.liujc.dao;

import cn.liujc.model.TItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface TItemMapper extends BaseMapper<TItem> {
    public List<TItem> getItemByOrderName(String name);
    public List<TItem> getItemByOrderId(Long id);
}