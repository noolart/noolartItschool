package com.company;
import  java.lang.String;
import java.util.Scanner;

public class Main{
static Scanner in = new Scanner(System.in);
public  static void main(String[] args){

        Point p =new Point(in.nextInt(),in.nextInt(),"black");
        p.getCoordinates();
        p.setX(10);
        p.getX();
        p.setY(5);
        p.getY();
        p.setColor("green");
        p.getColor();

}
}



package com.company;

import javax.sound.midi.Soundbank;

public class Point {

    private double x;
    private double y;
    private String color;

    public Point(double x, double y, String color){
        this.x=x;
        this.y=y;
        this.color=color;

    }


    public double getX() {
        System.out.println("x="+x);
        return x;
    }

    public void setX(double x) {
        this.x = x;
        System.out.println("new x="+x);
    }

    public double getY() {
        System.out.println("y="+y);
        return y;
    }

    public void setY(double y) {
        this.y = y;
        System.out.println("new y="+y);
    }

    public String getColor() {
        System.out.println("color:"+color);
        return color;
    }

    public void setColor(String color) {
        System.out.println("new color:"+color);
        this.color = color;
    }

    public void getCoordinates(){
        System.out.println(x+" "+y);
    }
}
