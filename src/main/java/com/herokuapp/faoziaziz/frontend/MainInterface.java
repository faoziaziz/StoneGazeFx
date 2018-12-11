/*
*   Nama        : MainInterface.java
*   Description : Ini class yang akan dipanggil sebagai user
*                 interface utama.
* */

package com.herokuapp.faoziaziz.frontend;
import com.herokuapp.faoziaziz.frontend.SimulaFX;

import javax.swing.*;
import java.awt.*;

public class MainInterface {

    JFrame frame;
    Container contentPane ;

    public void FrameUtama(){

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

        JToolBar toolBar = new JToolBar("Toolbar Ku");
        Insets zeroInset=new Insets(0,0,0,0);
        JButton newButton= new JButton("New");
        newButton.setMargin(zeroInset);
        newButton.setToolTipText("Add new policy");

        JButton openButton = new JButton("Open");
        openButton.setMargin(zeroInset);
        openButton.setToolTipText("Open a policy");

        JButton exitButton=new JButton("Exit");
        exitButton.setMargin(zeroInset);
        exitButton.setToolTipText("Exit the application");

        JPanel PanelAtas = new JPanel();
        JButton TombolAtas = new JButton("Tombol Atas 1");

        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.addSeparator();
        toolBar.add(exitButton);
        toolBar.setRollover(true);

        this.contentPane.add(toolBar, BorderLayout.NORTH);

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
        /*
        *   Ini bagian untuk Panel Kanan
        * */
        JPanel PanelKanan = new JPanel();
        JButton TombolKanan1  = new JButton("Buttton Kanan 1");
        JButton TombolKanan2 = new JButton("Button Kanan 2");
        PanelKanan.add(TombolKanan1);
        this.contentPane.add(PanelKanan, BorderLayout.EAST);
    }

    private void setPanelTengah(){
        /*
        *   Ini bagian untuk Panel Tengah
        * */
        System.out.println("kai");
    }

    private void setPanelBawah(){
        JPanel PanelBawah = new JPanel();
        JButton TombolBawah = new JButton("Tombol Bawah");
        PanelBawah.add(TombolBawah);
        this.contentPane.add(PanelBawah, BorderLayout.SOUTH);
    }

}
