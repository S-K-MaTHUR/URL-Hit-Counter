package com.geekster.URLHitCounter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userName;
    private int urlHitCount;

}
