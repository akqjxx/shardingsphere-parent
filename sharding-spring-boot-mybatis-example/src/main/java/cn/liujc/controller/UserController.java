package cn.liujc.controller;

import cn.liujc.model.TOrder;
import cn.liujc.model.TUser;
import cn.liujc.service.impl.TOrderService;
import cn.liujc.service.impl.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//
//                            _ooOoo_
//                           o8888888o
//                           88" . "88
//                           (| -_- |)
//                           O\  =  /O
//                        ____/`---'\____
//                      .'  \\|     |//  `.
//                     /  \\|||  :  |||//  \
//                    /  _||||| -:- |||||-  \
//                    |   | \\\  -  /// |   |
//                    | \_|  ''\---/''  |   |
//                    \  .-\__  `-`  ___/-. /
//                  ___`. .'  /--.--\  `. . __
//               ."" '<  `.___\_<|>_/___.'  >'"".
//              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
//              \  \ `-.   \_ __\ /__ _/   .-` /  /
//         ======`-.____`-.___\_____/___.-`____.-'======
//                            `=---='
//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//                      佛祖保佑       永无BUG
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TUserService userService;


    @GetMapping("/select")
    public List<TUser> select(TUser user) {
        return userService.lambdaQuery()
                .eq(
                        !StringUtils.isEmpty(user.getId()),
                        TUser::getId,
                        user.getId())
                .list();
    }


    @GetMapping("/insert")
    public Boolean insert(TUser user) {
        return userService.save(user);
    }
}
