package cn.liujc.service.impl;

import cn.liujc.service.TItemService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.dao.TItemMapper;
import cn.liujc.model.TItem;

@Service
public class TItemServiceImpl extends ServiceImpl<TItemMapper, TItem> implements TItemService {

}
