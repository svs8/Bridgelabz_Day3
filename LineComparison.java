package com.Bridgelabz_Day3;

public class LineComparison {
static double length(int a1,int b1,int a2, int b2)
{
    System.out.println("Co-ordinates of point x ie (x1="+a1+"and x2="+a2+")");
    System.out.println("Co-ordinates of point y ie (y1="+b1+"and y2="+b2+")");

    double l= Math.pow((a2-a1),2) + Math.pow((b2-b1),2);//Math.pow(i, 3);
    return Math.sqrt(l);
}

    public static void main(String[] args) {

    System.out.println("line 1 Co-ordinates");
    double l1=length(1,1,9,9);
    System.out.println("length of the line 1 is "+l1);
    System.out.println("line 2 Co-ordinates");
    double l2=length(1,1,9,9);
    System.out.println("length of the line 2 is "+l2);

        String length1 = l1+"";
        String length2 = l2+"";
    if(length1.equals(length2))
    {
        System.out.println("Both line 1 and 2 are equal");
    }
    }
}
