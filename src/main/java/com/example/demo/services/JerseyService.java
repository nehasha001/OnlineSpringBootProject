package com.example.demo.services;
import com.example.demo.models.Jersey;
import com.example.demo.repositories.JerseyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class JerseyService {
    @Autowired
    JerseyRepository jerseyRepository;

    public Jersey createJersey(Jersey jersey){
        return jerseyRepository.save(jersey);
    }
    public Jersey updateJersey(Jersey jersey){
        return jerseyRepository.save(jersey);
    }
    public void deleteJersey(int id){
        jerseyRepository.deleteById(id);

    }

    public List<Jersey> getAllJerseys(){
        List<Jersey> list = new ArrayList<>();
        jerseyRepository.findAll().forEach(new Consumer<Jersey>() {
            @Override
            public void accept(Jersey jersey) {
                list.add(jersey);
            }
        });
        return list;
    }
}
