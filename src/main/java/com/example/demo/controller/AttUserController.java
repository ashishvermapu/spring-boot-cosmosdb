package com.example.demo.controller;

import com.example.demo.data.AttUserRepository;
import com.example.demo.model.AttUser;
import com.example.demo.model.SleepTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;

@RestController
public class AttUserController {

  protected static final Logger LOGGER = LoggerFactory.getLogger(AttUserController.class);

  @Autowired
  AttUserRepository attUserRepository;

  @GetMapping(value = "/sleep/{sleepTime}")
  public SleepTime service1(ModelMap map, @PathVariable("sleepTime") int sleep) throws InterruptedException {
    LOGGER.info("Sleep Time Passed -> ");
    for (int i = 0; i < sleep; i++) {
      LOGGER.info("Sleep Counter -> {} ", sleep - i);
      Thread.sleep(1000);
    }

    LOGGER.info("Returned response after sleeping for {} seconds.", sleep);
    return new SleepTime(sleep, "Sleep Time");
  }

  @GetMapping(value = "/users")
  public ArrayList<AttUser> getUsers() {
    ArrayList<AttUser> userArrayList = new ArrayList<AttUser>();
    return attUserRepository.findAll();
  }

  @GetMapping(value = "/user/{attuid}")
  public AttUser getUserByAttuid(@PathVariable("attuid") String attuid) {
    return attUserRepository.findByAttuid(attuid);
  }

  @PostMapping("/user")
  public ResponseEntity<Void> addUser(@RequestBody AttUser attUser){
    AttUser createdAttUser = attUserRepository.save(attUser);
    URI uri = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{attuid}")
            .buildAndExpand(createdAttUser.getAttuid())
            .toUri();
    return ResponseEntity.created(uri).build();
  }

}