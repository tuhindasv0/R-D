package com.example.imageApp.demo.controller;


import com.example.imageApp.demo.model.image;
import com.example.imageApp.demo.service.imageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/image")
public class ImageController {

    @Autowired
    imageService imageService;


    @GetMapping
    @CrossOrigin
    public ResponseEntity<?> getall (){
        return new ResponseEntity<List<image>>(imageService.findAllImage(), HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/show/{imagename}")
    public ResponseEntity<?> getByImagename (@PathVariable("imagename") final String imagename){
        return new ResponseEntity<image>(imageService.findByname(imagename), HttpStatus.ACCEPTED);
    }


    @PostMapping
    public ResponseEntity<?> addnewImage(@RequestBody final image image) {

            final image imageRes = imageService.createImage(image);
            return new ResponseEntity<image>(imageRes, HttpStatus.CREATED);

    }
}
