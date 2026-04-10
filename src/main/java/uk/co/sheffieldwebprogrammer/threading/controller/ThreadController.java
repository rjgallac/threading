package uk.co.sheffieldwebprogrammer.threading.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(1000); // Simulate some work
        System.out.println("Handled request in thread: " + Thread.currentThread().toString());
        return "Hello from thread: " + Thread.currentThread().getName();
    }
}