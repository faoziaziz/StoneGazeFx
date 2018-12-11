package com.herokuapp.faoziaziz.frontend;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

import javax.swing.*;

import static com.herokuapp.faoziaziz.frontend.Plot.createScene;

public class Muka2 {

    private static void initAndShowGUI() {
        // This method is invoked on Swing thread
        JFrame frame = new JFrame("StoneGaze");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
        });
    }

    private static void initFX(JFXPanel fxPanel) {
        // This method is invoked on JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    public Muka2() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initAndShowGUI();
            }
        });
    }
}