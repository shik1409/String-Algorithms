package com.example;

import com.example.hashingalgo.StringHashing;

public class Main {

    public static void main(String[] args) {
        windowDemo();
        hashDemo();
    }

    private static void windowDemo(){
        SlidingWindowAlgo swa = new SlidingWindowAlgo();
        swa.solveSubStr("CodingSolveCoding","Co");
    }

    private static void hashDemo(){
        StringHashing sh = new StringHashing();

        System.out.println(sh.getRollingHash("abcd"));
    }
}
