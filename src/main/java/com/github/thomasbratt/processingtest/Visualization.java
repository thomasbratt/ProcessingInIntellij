package com.github.thomasbratt.processingtest;

import processing.core.PApplet;

/**
 * The purpose of this type is to
 */
public class Visualization extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.github.thomasbratt.processingtest.Visualization");
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        fill(120,50,240);
    }

    @Override
    public void draw(){
        ellipse(width/2,height/2,second(),second());
    }
}