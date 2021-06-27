package com.example.imageApp.demo.service;

import com.example.imageApp.demo.model.image;
import com.example.imageApp.demo.repository.imageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imageServiceImpl implements imageService{


    @Autowired
    imageRepository imageRepository;

    @Override
    public List<image> findAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public image findByname(String imageName) {
        return imageRepository.findByName(imageName);
    }

    @Override
    public image createImage(image image) {
        return imageRepository.save(image);
    }
}
