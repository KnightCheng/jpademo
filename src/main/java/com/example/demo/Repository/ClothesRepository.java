package com.example.demo.Repository;

import com.example.demo.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes,Long>{
}
