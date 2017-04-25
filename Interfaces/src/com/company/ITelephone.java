package com.company;

/**
 * Created by duncan.macleod on 4/25/17.
 */
public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
