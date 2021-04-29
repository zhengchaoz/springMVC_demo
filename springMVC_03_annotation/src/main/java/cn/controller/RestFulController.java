package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @user 郑超
 * @date 2021/4/27
 */
@Controller
public class RestFulController {

//    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.DELETE)
//    @DeleteMapping("/add/{a}/{b}")// 与上面等价
//    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")// 与上面等价
    public String testGet(@PathVariable int a, @PathVariable int b, Model model) {
        int i = a + b;
        model.addAttribute("msg", "get" + i);
        return "testGet";
    }

}
