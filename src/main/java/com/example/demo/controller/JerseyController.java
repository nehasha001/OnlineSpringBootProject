package com.example.demo.controller;
import com.example.demo.models.Jersey;
import com.example.demo.services.JerseyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JerseyController {
    @Autowired
    JerseyService jerseyService;
    @RequestMapping(value = "/jersey", method= RequestMethod.GET)
    public List<Jersey> getAllJerseys(){
        return jerseyService.getAllJerseys();

    }
    @RequestMapping(value="/jersey", method=RequestMethod.POST)
    public void createJersey (@RequestBody Jersey jersey){
        jerseyService.createJersey(jersey);
    }

    @RequestMapping(value="/jersey/{id}", method=RequestMethod.DELETE)
    public void deleteJersey(@PathVariable int id) {
        jerseyService.deleteJersey(id);
    }

    @RequestMapping(value="/jersey", method=RequestMethod.PUT)
    public void updateJersey(@RequestBody Jersey jersey){
        jerseyService.updateJersey(jersey);
    }
}
