package com.example.observer.something;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    private final Map<String, SomeThing> someBean;

    public Controller(Map<String,SomeThing> someBean) {
        this.someBean = someBean;
    }

    @GetMapping
    String hello() {
        return someBean.get("1").foo();
    }
}
