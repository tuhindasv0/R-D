package com.example.imageApp.demo.repository;

import com.example.imageApp.demo.model.image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface imageRepository extends JpaRepository<image,Integer> {

    List<image> findAll();

    @Query(value="SELECT * FROM image where img_name=?1",nativeQuery=true)
    image findByName(String name);



}
