package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String index() {
        return "Hello World with Quang Quy!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello World with admin!";
    }

    @GetMapping("/users")
    public String userPage() {
        return "Hello World with user";
    }
}
