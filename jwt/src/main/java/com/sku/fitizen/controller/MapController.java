package com.sku.fitizen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kakao")
public class MapController {
    @GetMapping("/map")  // m으로 URL 요청
    // @GetMapping("/map")  // map으로 URL 요청
    public String map() {
        return "map";
    }
}
