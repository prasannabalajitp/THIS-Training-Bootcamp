package com.torryharris.playerpack;
import java.util.*;

public class Dice {
    private int fValue;

    public int roll(){
        Random rand=new Random();
        fValue=(rand.nextInt(5) +1);
        return fValue;
    }

    public int getfValue() {
        return fValue;
    }
}
