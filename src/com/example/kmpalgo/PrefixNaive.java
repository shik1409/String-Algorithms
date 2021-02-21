package com.example.kmpalgo;

public class PrefixNaive {

    public int[] solve(String str){
        int len = str.length();
        int[] prefixArr = new int[len];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){

                //pattern is the prefix
                String pattern = str.substring(0,j);

                //now prefix compared with teh suffix.
                if(pattern.equals(str.substring(i-j+1,j))){
                    prefixArr[i] = j;
                }
            }
        }

        return prefixArr;
    }

}
