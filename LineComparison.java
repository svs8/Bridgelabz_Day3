package com.Bridgelabz_Day3;
import java.util.Scanner;

public class LineComparison {
    static double length(int a1,int b1,int a2, int b2)
    {
        System.out.println("co-ordinate of point 1 of Line 1 ie (x1="+a1+"and y1="+b1+")");
        System.out.println("Co-ordinates of point y ie (x2="+a2+"and y2="+b2+")");

        double l= Math.pow((a2-a1),2) + Math.pow((b2-b1),2);//Math.pow(i, 3);
        return Math.sqrt(l);
    }

    public static void main(String[] args) {


        System.out.println("enter the first co-ordinate of point 1 of Line 1");
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 1 of Line 1");
        int y1=sc.nextInt();
        System.out.println("enter the first co-ordinate of point 2 of Line 1");
        int x2=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 2 of Line 1");
        int y2=sc.nextInt();
        System.out.println("line 1 Co-ordinates");
        double l1=length(x1,y1,x2,y2);
        System.out.println("length of the line 1 is "+l1);

        System.out.println("line 2 Co-ordinates");
        System.out.println("enter the first co-ordinate of point 1 of Line 2");
        int x3=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 1 of Line 2");
        int y3=sc.nextInt();
        System.out.println("enter the first co-ordinate of point 2 of Line 2");
        int x4=sc.nextInt();
        System.out.println("enter the second co-ordinate of point 2 of Line 2");
        int y4=sc.nextInt();
        System.out.println("line 1 Co-ordinates");
        double l2=length(x3,y3,x4,y4);
        System.out.println("length of the line 2 is "+l2);


        String length1 = l1+"";
        String length2 = l2+"";

	 int res=length1.compareTo(length2);

	if(res>0)
    {
        System.out.println("line 1 is longer than line 2");
    } else if (res<0) {
        System.out.println("line 1 is smaller than line 2");
    }else{
        System.out.println("line 1 and line 2 are equal in length");
    }
    }
}
