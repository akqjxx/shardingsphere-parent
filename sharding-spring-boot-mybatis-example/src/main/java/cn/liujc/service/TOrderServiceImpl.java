package cn.liujc.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.model.TOrder;
import cn.liujc.dao.TOrderMapper;
import cn.liujc.service.impl.TOrderService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {

}

