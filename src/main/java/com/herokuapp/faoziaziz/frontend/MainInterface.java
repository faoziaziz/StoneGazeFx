package com.herokuapp.faoziaziz.frontend;

import javax.swing.*;

public class MainInterface{
    JToolBar barAlat= new JToolBar("ALat KU");
    JPanel PanelKiri = new JPanel();
    JPanel PanelTengah = new JPanel();
    ImageIcon gambarIcon = new ImageIcon("./gambar/icon", "ini asik");
    JMenuBar menuBar=new JMenuBar();


    public MainInterface() {
        initFrame();

    }

    public void initFrame(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame myWindow = new JFrame();
        myWindow.setTitle("Jendela Program");
        myWindow.setSize(400, 200);
        myWindow.setVisible(true);
    }

}
