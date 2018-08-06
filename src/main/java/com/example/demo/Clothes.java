package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clothes")
public class Clothes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  long number;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
