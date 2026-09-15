package com.gdgku.study.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
<<<<<<< HEAD
        return "Hello, Server!";
    }
}
=======
        return "Hello, Spring!";
    }
}
>>>>>>> cec7efb (feat: add backend study implementation)
