package br.ddos.mitigation.someservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/someservice")
public class SomeServiceVeryLazy {

    @GetMapping("/verylazy")
    public String getStock() throws Exception {

        System.out.println("Very lazy");
        Thread.sleep(9000);
        return "Very lazy...";
    }
}

