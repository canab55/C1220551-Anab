package com.Anab.Anab_C122051.Exercise;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Staff {
    private Long id;
    private String name;
    private String position;

    public Staff() {
    }

    public Staff(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



}
