/*
*   Nama        : MainInterface.java
*   Description : Ini class yang akan dipanggil sebagai user
*                 interface utama.
* */
package com.herokuapp.faoziaziz.frontend;

import javax.swing.*;
import java.awt.*;

public class MainInterface {

    JFrame frame;
    Container contentPane ;

    public MainInterface() {
        FrameUtama();

    }

    private void FrameUtama(){

        /*
        *   Settingan awal frame Utama
        *
        * */

        JFrame.setDefaultLookAndFeelDecorated(true);
        this.frame=new JFrame("StoneGaze");
        this.contentPane = this.frame.getContentPane();
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(400, 300);
        this.setPanelAtas();
        this.setPanelKiri(); //untuk settingan panel kiri
        this.setPanelKanan();
        this.setPanelBawah();
        this.setPanelTengah();
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void setPanelAtas(){
        JPanel PanelAtas = new JPanel();
        JButton TombolAtas = new JButton("Tombol Atas 1");
        PanelAtas.add(TombolAtas);
        this.contentPane.add(PanelAtas, BorderLayout.NORTH);

    }

    private void setPanelKiri(){
        /*
        *   Settingan untuk panel kiri
        *
        * */

        JPanel PanelKiri = new JPanel();
        JButton TombolKiri1 = new JButton("Button 1");
        JButton TombolKiri2 = new JButton("Button 2");
        PanelKiri.add(TombolKiri1);
        PanelKiri.add(TombolKiri2);

        this.contentPane.add(PanelKiri, BorderLayout.WEST);
    }

    private void setPanelKanan(){
        JPanel PanelKanan = new JPanel();
        JButton TombolKanan1  = new JButton("Buttton Kanan 1");
        JButton TombolKanan2 = new JButton("Button Kanan 2");
        PanelKanan.add(TombolKanan1);
        this.contentPane.add(PanelKanan, BorderLayout.EAST);
    }

    private void setPanelTengah(){
        JPanel PanelTengah = new JPanel();
        JButton TombolTengah = new JButton("Tombol Tengah");
        PanelTengah.add(TombolTengah);
        this.contentPane.add(PanelTengah, BorderLayout.CENTER);

    }

    private void setPanelBawah(){
        JPanel PanelBawah = new JPanel();
        JButton TombolBawah = new JButton("Tombol Bawah");
        PanelBawah.add(TombolBawah);
        this.contentPane.add(PanelBawah, BorderLayout.SOUTH);

    }

}
