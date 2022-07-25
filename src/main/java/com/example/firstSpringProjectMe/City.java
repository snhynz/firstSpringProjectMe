package com.example.firstSpringProjectMe;
//district ve city adında class city component olsun
// district inject edilsin
// dstrict classı pojo olsun -> name , population
// dıstrict class ının bean kullanarak instancwını oluşturun

import org.springframework.stereotype.Component;

@Component
public class City {
    private District district;

    public City(District district) {
        this.district = district;
        System.out.println(this.district);
    }

    public String getDistricName(){
        return district.getName();
    }
}
