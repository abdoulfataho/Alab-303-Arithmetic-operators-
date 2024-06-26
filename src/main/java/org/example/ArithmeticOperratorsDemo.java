package org.example;

public class ArithmeticOperratorsDemo {
    public static void main (String[] args){
//        ToDo Auto_generated method stub
        int x,y =10 , z =5;
        x=y+z;
        System.out.println("+ operator resulted in" +x);
        x=y-z;
        System.out.println("- operator resulted in"+x);
        x=y* z ;
        System.out.println("* operator resulted in"+x);
        x = y/z;
        System.out.println("/ operator resulted in"+x);
        x= y % z;
        System.out.println("% operator resulted in"+x);
        x= y ++;
        System.out.println("postfix ++ operator resulted in "+x);
        x= ++z;
        System.out.println(" prefix ++ operator resulted in"+x);
        x= -y;
        System.out.println("Unary operator resulted in"+x);
//        Some examples of specials cases
        int tooBig = Integer.MAX_VALUE +1;
        int tooSmall = Integer.MIN_VALUE -1;
        System.out.println("tooBig becomes" + tooBig);
        System.out.println("tooSmall becomes"+ tooSmall);



    }
}
