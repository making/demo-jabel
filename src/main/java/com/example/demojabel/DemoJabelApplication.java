package com.example.demojabel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJabelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJabelApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return """
        <html>
            <body>
                <p>Hello Jabel!!</p>
            </body>
        </html>
        """;
    }
}
