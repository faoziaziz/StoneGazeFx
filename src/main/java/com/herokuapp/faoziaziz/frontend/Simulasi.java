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
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Simulasi{

    public Simulasi(boolean stats)
    {

        InisiasiFrame(stats);
    }

    public void InisiasiFrame(boolean status)
    {
        JFrame frame=new JFrame("Simulasi");
        frame.setVisible(status);
        final JFXPanel fxPanel = new JFXPanel();
        initFX(fxPanel);
        frame.add(fxPanel);
        frame.setSize(300, 200);
        frame.setVisible(status);
		/*
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ini kode gak kepake kalau dipake nanti jadi error
		*/
    }

    private static void initFX(JFXPanel fxPanel)
    {
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private static Scene createScene()
    {
        //Fungsi sinus ditaruh disini

        final NumberAxis xAxis= new NumberAxis();
        final NumberAxis yAxis= new NumberAxis();
        xAxis.setLabel("test");
        final LineChart<Number, Number> lineChart=new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle("Fluktuasi Cinta");
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
    private static void kanalFading()
    {
        //ini buat fungsi kanal fading
    }
    private static void pararelSimulating()
    {
        //ini simulasi pararel
    }


}
