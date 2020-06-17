package cn.liujc.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.dao.TItemMapper;
import cn.liujc.model.TItem;
import cn.liujc.service.impl.TItemService;
@Service
public class TItemServiceImpl extends ServiceImpl<TItemMapper, TItem> implements TItemService{

}
