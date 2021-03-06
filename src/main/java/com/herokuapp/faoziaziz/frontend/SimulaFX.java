/*
*   Nama File   : SimulaFX.java
*   Deskripsi   : Ini dipakai buat nampilin dengan javaFx
*
* */

package com.herokuapp.faoziaziz.frontend;
import com.herokuapp.faoziaziz.frontend.MainInterface;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import javax.swing.*;
import java.awt.*;

public class SimulaFX {

    public void tampilSimula(){
        MainInterface UtamaFace = new MainInterface();
        final JFXPanel fxPanel = new JFXPanel();
        JPanel PanelTengah = new JPanel();
        initGraphics(fxPanel);
        PanelTengah.add(fxPanel);
        UtamaFace.contentPane.add(PanelTengah, BorderLayout.CENTER);
    }

    public static void initGraphics(JFXPanel fxPanel){
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    public static Scene createScene()
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
