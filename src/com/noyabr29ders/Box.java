package com.noyabr29ders;

public class Box <X>{
    X thing;
    Box( X thing){
        this.thing=thing;
    }

    @Override
    public String toString() {
        return thing.toString();
    }
}
