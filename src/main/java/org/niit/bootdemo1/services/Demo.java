package org.niit.bootdemo1.services;

import org.springframework.stereotype.Service;

@Service
public class Demo {

    public String greet(){
        return "Hello";
    }

    public void message(){
        System.out.println("world" );
    }

}
