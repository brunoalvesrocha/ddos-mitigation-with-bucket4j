package br.ddos.mitigation.someservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verylazy")
public class SomeServiceVeryLazy {

    @GetMapping
    public String getStock() throws Exception {

        System.out.println("Very lazy");
        Thread.sleep(1500);
        return "Very lazy...";
    }
}

