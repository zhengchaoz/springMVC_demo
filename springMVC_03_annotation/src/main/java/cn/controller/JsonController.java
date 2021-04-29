package cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user 郑超
 * @date 2021/4/28
 */
@RestController
public class JsonController {

    @RequestMapping("/getJson")
    public String json() {
        return "";
    }

}
