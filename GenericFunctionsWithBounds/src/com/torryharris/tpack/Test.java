package com.torryharris.tpack;

import java.util.List;

public class Test {
    public static Number sumOfList(List<? extends Number> nlist){
        double s=0.0;
        for (Number n:nlist){
            s+=n.doubleValue();
        }
        return s;
    }
}
