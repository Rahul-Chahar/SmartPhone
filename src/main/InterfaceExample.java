/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/02/2022
 */

package main;

import smartphone.SmartPhone;

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        {
            sp.call();
            sp.sms();
            sp.VideoCall();
            sp.click();
            sp.record();
            sp.play();
            sp.stop();

        }
    }
}