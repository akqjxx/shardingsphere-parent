package cn.liujc.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.model.TUser;
import cn.liujc.dao.TUserMapper;
import cn.liujc.service.impl.TUserService;
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService{

}
