package com.spboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired // check if component of Laptop is present and assign it to lap
    // by this we dont need to create object
    Laptop lap;

    public void code() {
        lap.compile();
    }
}
