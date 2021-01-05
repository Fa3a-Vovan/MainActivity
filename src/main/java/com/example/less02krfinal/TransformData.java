package com.example.less02krfinal;

import androidx.annotation.NonNull;

public class TransformData {

    Entity stringToInts(String string) {
        Entity entity = new Entity();
        string = string.replaceAll("[abc=]", "");
        String[] arrayString = string.split(", ", 3);
        try {
            entity.setA(Integer.parseInt(arrayString[0]));
            entity.setB(Integer.parseInt(arrayString[1]));
            entity.setC(Integer.parseInt(arrayString[2]));
        }catch (ArithmeticException e){}
        return entity;
    }
}