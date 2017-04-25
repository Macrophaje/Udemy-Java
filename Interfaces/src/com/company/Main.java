package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567890);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567890);
        timsPhone.answer();

        timsPhone = new MobilePhone(8951640);
        timsPhone.powerOn();
        timsPhone.callPhone(8951640);
        timsPhone.answer();
    }
}
