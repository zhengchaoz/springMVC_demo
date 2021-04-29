package cn.controller;

import cn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @user 郑超
 * @date 2021/4/28
 */
@Controller
public class ParamController {

    @RequestMapping("/test")
    public String test(@RequestParam("username") String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }

    @RequestMapping("/user")
    public String testUser(User user, Model model) {
        model.addAttribute("msg", user);
        return "hello";
    }

}
