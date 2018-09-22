package com.example.demo.repositories;
import com.example.demo.models.Jersey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JerseyRepository extends JpaRepository<Jersey, Integer> {
}