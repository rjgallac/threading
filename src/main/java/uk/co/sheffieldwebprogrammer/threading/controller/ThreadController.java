package uk.co.sheffieldwebprogrammer.threading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {
    @GetMapping("/test")
    public String test() {
        return "Hello from thread: " + Thread.currentThread().getName();
    }
}