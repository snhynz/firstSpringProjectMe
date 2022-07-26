package com.example.firstSpringProjectMe.rest;

import com.example.firstSpringProjectMe.District;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostMethodExampleOne {

    private District district;

    public PostMethodExampleOne(District district) {
        this.district = district;
    }
    @GetMapping("/getDistrict")
    public District getDistrict(){
        return this.district;
    }
    @PostMapping("/addDistrict")
    public void addDistrict(@RequestBody District dst){
        System.out.println(dst.toString());
    }
    @PutMapping("/updateDistrict/{id}")
    public void updateDistrict(@RequestBody District dst,
                               @PathVariable(name ="id") String id){
        System.out.println(dst.toString());
        System.out.println(id);
    }
    @DeleteMapping("/deleteDistrict/{id}")
    public void deleteDistrict(@PathVariable(name = "id")String id){
        System.out.println(id);
    }

}
