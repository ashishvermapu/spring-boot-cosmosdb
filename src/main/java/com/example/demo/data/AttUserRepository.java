package com.example.demo.data;

import com.example.demo.model.AttUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface AttUserRepository extends JpaRepository<AttUser, String> {
    ArrayList<AttUser> findByLastName(String lastName);
    AttUser findByAttuid(String attuid);
}
