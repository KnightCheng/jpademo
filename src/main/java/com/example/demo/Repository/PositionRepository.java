package com.example.demo.Repository;

import com.example.demo.Position;
import com.example.demo.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionRepository extends JpaRepository<Position,Long>{
    public Position findPositionByName(String name);
}
