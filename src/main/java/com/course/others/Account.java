package com.course.others;

import com.course.others.Interfaces.AccountableInterface;

public class Account <T> implements AccountableInterface {

//    The most commonly used type parameter names are:
//
//    E - Element (used extensively by the Java Collections Framework)
//    K - Key
//    N - Number
//    T - Type
//    V - Value
//    S,U,V etc. - 2nd, 3rd, 4th types


    //
    private  T id;

    //private String id;

    public Account(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }


    @Override
    public String getValue() {
        return null;
    }
}
