package com.example.folketalletpiechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class HelloController {

    @FXML
    private PieChart pie2020;

    @FXML
    private PieChart pie2030;


    public void draw2020(ActionEvent actionEvent) {

        ObservableList<PieChart.Data> pieData2020 = FXCollections.observableArrayList(
                new PieChart.Data("0-2", 1018),
                new PieChart.Data("3-5", 1103),
                new PieChart.Data("6-16", 4494),
                new PieChart.Data("17-19", 1422),
                new PieChart.Data("20-29", 3488),
                new PieChart.Data("30-45", 1584),
                new PieChart.Data("46-64", 10583),
                new PieChart.Data("65-79", 6966),
                new PieChart.Data("+80", 2306)
                );
        pie2020.setData(pieData2020);
    }

    public void draw2030(ActionEvent actionEvent) {

        ObservableList<PieChart.Data> pieData2030 = FXCollections.observableArrayList(
                new PieChart.Data("0-2", 994),
                new PieChart.Data("3-5", 1020),
                new PieChart.Data("6-16", 4052),
                new PieChart.Data("17-19", 1189),
                new PieChart.Data("20-29", 3090),
                new PieChart.Data("30-45", 5904),
                new PieChart.Data("46-64", 8619),
                new PieChart.Data("65-79", 7555),
                new PieChart.Data("+80", 3183)
        );
        pie2030.setData(pieData2030);

    }
}
