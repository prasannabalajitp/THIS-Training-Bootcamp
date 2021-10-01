package com.torryharris.mainpack;

import com.torryharris.emppack.Employee;
import com.torryharris.exceptionpack.InsufficientLeaveException;

public class Main {

    public static void main(String[] args) {
        Employee emp1=new Employee(100,15);
        System.out.println(emp1);

        try {
            System.out.println(emp1.applyLeave(10));
        } catch (InsufficientLeaveException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(emp1.applyLeave(10));
        } catch (InsufficientLeaveException e) {
            System.out.println(e);;
        }

        System.out.println(emp1);
    }
}
