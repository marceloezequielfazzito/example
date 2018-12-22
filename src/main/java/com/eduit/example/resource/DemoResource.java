package com.eduit.example.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoResource {


    @GetMapping(path = "/names")
    public List<String> getAllNames(){
        List<String> names = new ArrayList<>();
        names.add("juan");
        names.add("pedro");
        return names;
    }


}
