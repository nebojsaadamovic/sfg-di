package guru.springframework.sfgdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String Hello(){
        System.out.println("Hello world");

        return "Hi Folks";
    }
}
