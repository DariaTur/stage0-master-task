package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String res="";
        for(int i = 0; i < cathetusLength; i++){
            res+="*";
            System.out.printf("%"+cathetusLength+"s\n", res);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
