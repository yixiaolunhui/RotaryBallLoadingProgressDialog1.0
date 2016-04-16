package com.dalong.rotaryballview;

import android.support.annotation.Keep;

/**
 * 球对象
 */
public class Ball {
    @Keep
    private float radius;//半径
    private float centerX;//圆心
    private int color;//颜色

    @Keep
    public float getRadius() {
        return radius;
    }

    @Keep
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public void setCenterX(float centerX) {
        this.centerX = centerX;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
