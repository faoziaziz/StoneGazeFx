package com.herokuapp.faoziaziz.frontend;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTabbedPane;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import com.herokuapp.faoziaziz.frontend.Simulasi;
import com.herokuapp.faoziaziz.frontend.SwingFX;

public class Muka2 {


    JToolBar toolBar = new JToolBar("Toolbar Ku");
    //JTextArea msgText = new JTextArea(3,45);
    JPanel PanelKiri = new JPanel();
    JPanel PanelTengah = new JPanel();
    ImageIcon gambarIcon = new ImageIcon("./gambar/icon.png", "Ini Asik");
    JMenuBar menuBar=new JMenuBar();
    public Muka2(){
        initFrame();
    }

    public void initFrame()
    {

        //System.out.println("Frame Inisiasi");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("StoneGaze");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Kamu akan menjadi batu");
        Container contentPane = frame.getContentPane();
        //Prepare Toolbar
        prepareToolBar();
        //bagian north
        contentPane.add(toolBar, BorderLayout.NORTH);
        //bagian west alias Sidebar kiri
        JButton buttonKiri = new JButton("Sidebar Kiri");
        //Panel Kiri
        setPanelKiri();
        contentPane.add(PanelKiri, BorderLayout.WEST);
        //contentPane.add(buttonKiri, BorderLayout.WEST);

        //Bagian Bawah alisa notification bar
        JButton ButtonBawah = new JButton("Sidebar Bawah");
        contentPane.add(ButtonBawah, BorderLayout.SOUTH);
        //Bagian kanan
        JButton ButtonKanan = new JButton("Sidebar Kanan");
        contentPane.add(ButtonKanan, BorderLayout.EAST);
        //Bagian Center
        setPanelTengah();
        contentPane.add(PanelTengah, BorderLayout.CENTER);
        //contentPane.add(new JScrollPane(msgText), BorderLayout.CENTER);
        //msgText.append("Move the toolbar around using its"+"handle at the left end");
		/*
			Set Jmenu Bar
		*/
        prepareMenuBar();
        frame.setJMenuBar(menuBar);

        baca();
        // TulBar
        frame.pack();
        frame.setVisible(true);

    }
    private void setPanelTengah()
    {


        final JFXPanel fxPanel = new JFXPanel();

        initGraphics(fxPanel);
        PanelTengah.add(fxPanel);
    }
    private void setPanelKiri()
    {

        JButton TombolKiri1 = new JButton("Tombol Kiri 1");
        JButton TombolKiri2 = new JButton("Tombol Kiri 2");
        PanelKiri.add(TombolKiri1);
        PanelKiri.add(TombolKiri2);
    }

    private void prepareToolBar()
    {
        /* item toolbar */
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

        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.addSeparator();
        toolBar.add(exitButton);
        toolBar.setRollover(true);

    }
    private void prepareMenuBar()
    {
        JMenu fileMenu = getFileMenu();
        JMenu helpMenu = getHelpMenu();
        JMenu newMenu= getNewMenu();

        getFileMenu();
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(newMenu);
    }
    private void baca()
    {
        System.out.println("ASsek");

    }

    private JMenu getFileMenu()
    {
        JMenu fileMenu=new JMenu("File");
        JMenuItem openMenuItem=new JMenuItem("Open");
        JMenuItem exitMenuItem=new JMenuItem("Exit");
        //fileMenu.add(newMenu);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        return fileMenu;
    }
    private JMenu getHelpMenu()
    {
        JMenu helpMenu = new JMenu("Help");
        return helpMenu;
    }
    private JMenu getNewMenu()
    {
        JMenu newMenu = new JMenu("Tool");
        final JMenuItem simulasiMenuItem =new JMenuItem("Simulasi");
        JMenuItem claimMenuItem	= new JMenuItem("Beh");

        newMenu.add(simulasiMenuItem);
        newMenu.add(claimMenuItem);

        simulasiMenuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent simulasiDipencet)
            {
                if (simulasiDipencet.getSource()==simulasiMenuItem)
                {
                    frameSimulator();
                }
            }
        });
        return newMenu;

    }
    private void frameSimulator()
    {
        Simulasi Simulator = new Simulasi(true);
    }

    private static void initGraphics(JFXPanel fxPanel)
    {
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private static Scene createScene()
    {

        final NumberAxis xAxis= new NumberAxis();
        final NumberAxis yAxis= new NumberAxis();
        xAxis.setLabel("test");
        final LineChart<Number, Number> lineChart=new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("Stil on Wix");
        XYChart.Series series=new XYChart.Series();
        series.setName("Hasil Gue");
        // populating the series with data
        series.getData().add(new XYChart.Data(1,23));
        series.getData().add(new XYChart.Data(2,14));
        series.getData().add(new XYChart.Data(3,15));
        series.getData().add(new XYChart.Data(4,24));
        series.getData().add(new XYChart.Data(5,34));
        series.getData().add(new XYChart.Data(6,36));
        series.getData().add(new XYChart.Data(7,22));
        series.getData().add(new XYChart.Data(8,45));
        series.getData().add(new XYChart.Data(9,43));
        series.getData().add(new XYChart.Data(10,17));
        series.getData().add(new XYChart.Data(11,29));
        series.getData().add(new XYChart.Data(12,25));
        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);
        return(scene);
    }
}