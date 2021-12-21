package com.torryharris.myDatePack;

public class MyDate {
    private int dd;
    private int mm;
    private int yy;

    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    @Override
    public boolean equals(Object o) {
            MyDate d=(MyDate)o;
        return this.dd == d.dd && this.mm == d.mm && this.yy == d.yy;

    }

    @Override
    public int hashCode() {
        return (dd^mm^yy);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "dd=" + dd +
                ", mm=" + mm +
                ", yy=" + yy +
                '}';
    }
}
