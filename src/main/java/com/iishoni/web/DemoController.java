package com.iishoni.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name;
    }

    @PostMapping
    public String save() {
        return "保存成功！";
    }

    @PutMapping
    public String update() {
        return "更新成功！";
    }

    @DeleteMapping
    public String delete() {
        return "删除成功！";
    }
}
