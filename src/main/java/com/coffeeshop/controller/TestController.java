package com.coffeeshop.controller;

import com.coffeeshop.model.entity.Example;
import com.coffeeshop.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    ExampleRepository exampleRepository;

    @GetMapping("/example")
    public List<Example> getExamples() {
        return exampleRepository.findAll();
    }
}
