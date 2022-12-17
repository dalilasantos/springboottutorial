package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryIml;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerSeviceImpl implements SpeakerSevice {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryIml();
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
