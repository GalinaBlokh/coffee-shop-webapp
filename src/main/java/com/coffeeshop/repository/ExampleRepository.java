package com.coffeeshop.repository;

import com.coffeeshop.model.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
    @Override
    List<Example> findAll();

}
