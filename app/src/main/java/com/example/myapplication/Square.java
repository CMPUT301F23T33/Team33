package com.example.myapplication;

public class Square extends Shape {

    public Square(int side) {
        super(side,side);

    }

    public int perimeter(){
        return (4*getX());
    }

    public int area(){
        return(getX()*getX());
    }
}
