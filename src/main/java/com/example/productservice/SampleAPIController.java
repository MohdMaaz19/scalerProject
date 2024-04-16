package com.example.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class SampleAPIController {

    @GetMapping("/")
    public String sayHey() {
        return "Products";
    }

    @GetMapping("/{name}/{num}")
    public String sayProductName(@PathVariable("name") String name, @PathVariable("num") int number) {
        return "Product name is "+ name+" "+number;
    }
}
