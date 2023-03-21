package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String res = "";
        for(int i = 0; i<cathetusLength; i++){
            res = (i+1==1) ? res+(i+1) : (i+1)+res+(i+1) ;
            System.out.printf("%"+(cathetusLength+i)+"s\n", res);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
