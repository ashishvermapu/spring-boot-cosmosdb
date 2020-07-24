package com.example.demo.controller;

import com.example.demo.data.TMUserRepository;
import com.example.demo.model.TMUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TMUserController {

    protected static final Logger LOGGER = LoggerFactory.getLogger(TMUserController.class);

    @Autowired
    TMUserRepository tmUserRepository;

    @GetMapping("/tmuser/firstname/{firstName}")
    public List<TMUser> getTmUserByFirstName(@PathVariable("firstName") String firstName){
        return tmUserRepository.findByFirstName(firstName).collectList().block();
    }

    @GetMapping("/tmuser/id/{id}")
    public TMUser getTmUserById(@PathVariable("id") String id){
        return tmUserRepository.findById(id).blockOptional().get();
    }

    @PostMapping("/tmuser")
    public String addTMUser(@RequestBody TMUser tmUser){
        final Mono<TMUser> saveUserMono = tmUserRepository.save(tmUser);
        final TMUser savedTmUser = saveUserMono.block();
        LOGGER.info("Saved User : {}", savedTmUser.getFirstName());
        return "Success";
    }
}
