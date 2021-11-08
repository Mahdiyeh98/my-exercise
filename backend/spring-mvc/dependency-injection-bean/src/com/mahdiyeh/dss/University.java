package com.mahdiyeh.dss;

import org.springframework.stereotype.Component;

@Component
public class University {
    private String nameOfUni;
    private String city;

    public String getNameOfUni() {
        return nameOfUni;
    }

    public void setNameOfUni(String nameOfUni) {
        this.nameOfUni = nameOfUni;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
