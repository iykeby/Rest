package com.example.RestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

private static final String template = "Hello, %s!";
private final AtomicLong counter = new AtomicLong();

@GetMapping("/greeting")
 public Greeting greeting(@RequestParam(value = "name", defaultValue = "Wolrd") String name)
{


     return new Greeting(counter.getAndIncrement(), String.format(template,name));

 }

}



