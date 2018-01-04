package com.company;

/**
 * Created by duncan.macleod on 1/3/18.
 */
//Visibility?
interface Accessible { //Package-private
    int SOME_CONSTANT = 100; //public final
    public void methodA(); //public
    void methodB(); //public
    boolean methodC(); //public
}
