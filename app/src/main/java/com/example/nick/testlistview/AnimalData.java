package com.example.nick.testlistview;

import java.util.ArrayList;

/**
 * Created by Nick on 4/11/2560.
 */

public class AnimalData {
    private static AnimalData sInstant;

    public ArrayList<Animal> animalList ;//ที่เหลือคือโครง

    public static AnimalData getsInstant(){
        if (sInstant == null){
            sInstant = new AnimalData();
        }
        return sInstant;
    }
}
