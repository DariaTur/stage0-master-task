package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String num = Integer.toString(number);
        String res = "";
        for (int i = num.length()-1; i>=0; i--){
            res += num.charAt(i);
        }
        number = Integer.valueOf(res);
        System.out.println(number);
    }


}
