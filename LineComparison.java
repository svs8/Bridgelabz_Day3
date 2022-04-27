package com.Bridgelabz_Day3;

public class LineComparison {
static double length(int a1,int b1,int a2, int b2)
{
    double l= Math.pow((a2-a1),2) + Math.pow((b2-b1),2);//Math.pow(i, 3);
    return l;
}

    public static void main(String[] args) {

    int x1=1;
    int y1=1;
    int x2=9;
    int y2=9;
        System.out.println("Co-ordinates of point x ie (x1="+x1+"and x2="+x2+")");
        System.out.println("Co-ordinates of point y ie (y1="+y1+"and y2="+y2+")");

    double l=length(x1,y1,x2,y2);

    System.out.println("length of the line 1 is "+Math.sqrt(l));

    }
}
