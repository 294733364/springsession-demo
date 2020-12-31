package com.offcn.demo.controller;

import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SixThymeleafController {

    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index3.html
     * @param model
     * @return
     */
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index6.html
     * @param model
     * @return
     */
    @GetMapping("/six")
    public String indexPage(Model model) {
        return "index6";
    }
}

