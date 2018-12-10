/*
*   Namafile    : App.java
*   Description : Saya mengerti bahwa ini merupakan program yang sulit
*
* */

package com.herokuapp.faoziaziz;

import com.herokuapp.faoziaziz.frontend.MainInterface;
import com.herokuapp.faoziaziz.Math.KalSim;

public class App {

    public static void main(String[] args) {
        MainInterface coba = new MainInterface();
        KalSim test = new KalSim();
        test.penjumlahan(2, 8);
        System.out.println(test.zed);
    }

}
