package dev.dxmingues.RegisterDevs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DeveloperController {
    @GetMapping("/welcome")
    public String welcome() {
        return "This is my first message";
    }
}
