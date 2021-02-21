package com.example;

// main string len = N, pattern string len = M
// each window match time = M.
// total windows to math = N-M+1
// time complexity = N*(N-M+1)

public class SlidingWindowAlgo {

    public void solveSubStr(String str,String pattern){

        //int start = 0;
        //int end = pattern.length();

       /* for(int start=0,end = pattern.length()-1;end< str.length();start++,end++){
            if(isMatched(str,pattern,start)){
                System.out.print(start+" ");
            }
        }
        */

        for(int i=0;i<str.length()-pattern.length();i++){
            if(isMatched(str,pattern,i)){
                System.out.println(i+" ");
            }
        }

    }

    private boolean isMatched(String str, String pattern, int start){
        //System.out.println(start+" "+str+" "+pattern+" "+pattern.length()+" "+start);
        for(int i=start,j=0;j<pattern.length();i++,j++){
           // System.out.println(str.charAt(i)+" "+pattern.charAt(j));
            if(str.charAt(i) != pattern.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
