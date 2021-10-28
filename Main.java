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
