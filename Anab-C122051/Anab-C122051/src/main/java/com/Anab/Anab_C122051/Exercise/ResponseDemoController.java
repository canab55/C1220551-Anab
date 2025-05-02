package com.Anab.Anab_C122051.Exercise;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseDemoController {
    public ResponseDemoController() {
    }

    @GetMapping({"/success"})
    public ResponseEntity<String> successResponse() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Custom-Header", "SuccessHeader");
        return new ResponseEntity("Request successful!", headers, HttpStatus.OK);
    }

    @GetMapping({"/notFound"})
    public ResponseEntity<String> notFoundResponse() {
        String errorMsg = "The resource you are looking for was not found.";
        return new ResponseEntity(errorMsg, HttpStatus.NOT_FOUND);
    }

    @PostMapping({"/create"})
    public ResponseEntity<String> createResource() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/new-resource/123");
        return new ResponseEntity("Resource created successfully.", headers, HttpStatus.CREATED);
    }

}
