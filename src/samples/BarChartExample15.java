/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class BarChartExample15 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Aparelhos");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visitas");
        
        BarChart barChart = new BarChart(xAxis, yAxis);
        
        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName("2018");
        XYChart.Data d1 = new XYChart.Data("Desktop", 500);
        XYChart.Data d2 = new XYChart.Data("Telefone", 100);
        XYChart.Data d3 = new XYChart.Data("Tablet", 250);
        dataSeries.getData().addAll(d1, d2, d3);
        
        barChart.getData().add(dataSeries);
        
        VBox vbox = new VBox(barChart);
        
        Scene scene = new Scene(vbox, 400, 400);
        
        primaryStage.setTitle("Exemplo de gráfico de Pizza");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
