package com.example.imageApp.demo.service;

import com.example.imageApp.demo.model.image;

import java.util.List;

public interface imageService {

    public List<image> findAllImage();

    public image findByname(String imageName);

    public image createImage(image image);
}
