package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("SpeakerRepository")
public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Shruthi");
        speaker.setLastName("Yadhugani");

        speakers.add(speaker);
        return  speakers;


    }


}
