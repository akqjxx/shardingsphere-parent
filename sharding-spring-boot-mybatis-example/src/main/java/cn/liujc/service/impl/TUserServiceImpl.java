package cn.liujc.service.impl;

import cn.liujc.service.TUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.liujc.model.TUser;
import cn.liujc.dao.TUserMapper;

@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
