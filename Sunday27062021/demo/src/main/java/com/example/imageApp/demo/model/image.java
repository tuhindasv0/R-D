package com.example.imageApp.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class image {




    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer imageId;



    private String ImgName;
    private String ImgURL;
    private String ImgDetails;

    public image() {
    }
    public Integer getImageId() {
        return imageId;
    }
    public image(Integer imageId, String imgName, String imgURL, String imgDetails) {

        this.imageId = imageId;
        ImgName = imgName;
        ImgURL = imgURL;
        ImgDetails = imgDetails;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public void setImgName(String imgName) {
        ImgName = imgName;
    }
    public String getImgName() {
        return ImgName;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public String getImgDetails() {
        return ImgDetails;
    }
    public void setImgURL(String imgURL) {
        ImgURL = imgURL;
    }

    public void setImgDetails(String imgDetails) {
        ImgDetails = imgDetails;
    }
}
