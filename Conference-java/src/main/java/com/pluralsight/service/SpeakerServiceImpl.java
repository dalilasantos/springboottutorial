package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
       System.out.println("SpeakServiceIml no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("SpeakServiceIml repository constructor");
        repository = speakerRepository;
    }
    public List<Speaker> findAll(){
        return repository.findAll();
    }
    @Autowired
    //injetará automaticamente esse bean SpeakerRepository nesse setter.
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceIml setter");
        this.repository = repository;
    }
}
