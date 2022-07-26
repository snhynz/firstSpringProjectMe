package com.example.firstSpringProjectMe.rest;

import com.example.firstSpringProjectMe.District;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethodExampleOne {
    private District district;

    public GetMethodExampleOne(District district) {
        this.district = district;

    }

    @GetMapping("/test1")

    public District test(){
        return this.district;
    }
}
