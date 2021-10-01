package com.torryharris;

public class customer {
    private int custId;
    private String custName;
    private int unitConsumed;
    private int unitPrice;

    public customer(int custId, String custName, int unitConsumed, int unitPrice) {
        this.custId = custId;
        this.custName = custName;
        this.unitConsumed = unitConsumed;
        this.unitPrice = unitPrice;
    }

    private int custBillAmt(int unitConsumed, int unitPrice){
        return unitConsumed*unitPrice;
    }

    @Override
    public String toString() {
        return "customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", unitConsumed=" + unitConsumed +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
