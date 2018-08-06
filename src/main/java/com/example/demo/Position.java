package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 位置实体类
 */
@Entity
@Table(name = "position")
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    @JoinTable(name = "position_clothes",
//            joinColumns = {@JoinColumn(name = "position_id")},
//            inverseJoinColumns = {@JoinColumn(name = "clothes_id")})
    public List<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
    }

    @OneToMany
    private List<Clothes> clothes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}