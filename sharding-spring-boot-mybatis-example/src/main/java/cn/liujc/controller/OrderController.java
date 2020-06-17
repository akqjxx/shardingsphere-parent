package cn.liujc.controller;

import cn.liujc.model.TItem;
import cn.liujc.model.TOrder;
import cn.liujc.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
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
public class OrderController {

    @Autowired
    private TOrderService orderService;


    @GetMapping("/select")
    public List<TOrder> select(TOrder order) {
        return orderService.lambdaQuery()
                .eq(
                        !StringUtils.isEmpty(order.getId()),
                        TOrder::getId,
                        order.getId())
                .list();
    }


    @GetMapping("/insert")
    public Boolean insert(TOrder order) {
        return orderService.save(order);
    }

    @GetMapping("/item")
    public List<TItem> select(String name) {
        return orderService.getItemByOrderName(name);
    }

    @GetMapping("/itemId")
    public List<TItem> selectId(Long id) {
        return orderService.getItemByOrderId(id);
    }
}
