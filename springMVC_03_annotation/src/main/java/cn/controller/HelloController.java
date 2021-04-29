package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @user 郑超
 * @date 2021/4/27
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")// 访问地址
    public String hello(Model model) {
        model.addAttribute("msg", "你好，Springmvc！");
        return "hello";// 会被视图解析器处理，拼接配置文件中的前后缀，找到对应的jsp文件
    }
}
