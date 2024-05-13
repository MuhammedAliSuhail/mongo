package com.example.mongoDB.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {

    private int userId;
    private int rating;
    private String comment;
    private String date;


}

