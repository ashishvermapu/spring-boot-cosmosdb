package com.example.demo.data;

import com.example.demo.model.TMUser;
import org.springframework.stereotype.Repository;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import reactor.core.publisher.Flux;

@Repository
public interface TMUserRepository extends ReactiveCosmosRepository<TMUser, String> {
  Flux<TMUser> findByFirstName(String firstName);
}