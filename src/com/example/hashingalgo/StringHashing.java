package com.example.hashingalgo;

// string comparison can be done in o(1) time complexity.
public class StringHashing {

    private int p = 31;

    // as the probability of 2 string collision is inversely proportional to m
    //better have m as a very large number.
    private int m = (int)(1e9+9);

    public  long getRollingHash(String str){

        long power_of_p = 1 ; // power of p for the initial character.
        long hashValue=0;
        for(int i=0;i<str.length();i++){
            hashValue = (hashValue+
                    (str.charAt(i)-'a'+1) * power_of_p) % m;

            //raise power of p by the number of digits encountered so far.
            //why again modulo is required:
            power_of_p = power_of_p * p % m;
        }
        return hashValue;
    }

    public long[] hashPrefixArray(String mainStr){
        long[] hashPrefixArr  = new long[mainStr.length()];

        long power_of_p = 1;
        long hashValue = 0;

        for(int i=0;i<mainStr.length();i++){
            hashValue = (hashValue+
                    (mainStr.charAt(i)-'a'+1)*power_of_p) % m;

            hashPrefixArr[i] = hashValue;
            power_of_p = power_of_p * p % m;
        }

        return hashPrefixArr;

    }

}
