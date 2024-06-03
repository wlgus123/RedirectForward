package hs.kr.study.RedirectForward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1() {
//        return "redirect:/list";  -> 주소가 바뀜
        return "forward:/list";
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }
}
