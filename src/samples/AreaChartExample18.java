/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class AreaChartExample18 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Número de funcionarios");
        
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Receita por funcionário");
        
        AreaChart areaChart = new AreaChart(xAxis, yAxis);
        XYChart.Series dataSeries1 = new XYChart.Series(); 
        dataSeries1.setName("Relatório de receita por funcionário");
        dataSeries1.getData().add(new XYChart.Data(1, 500));
        dataSeries1.getData().add(new XYChart.Data(5, 200));
        dataSeries1.getData().add(new XYChart.Data(10, 700));
        dataSeries1.getData().add(new XYChart.Data(15, 1300));
        dataSeries1.getData().add(new XYChart.Data(20, 2000));
        dataSeries1.getData().add(new XYChart.Data(25, 2500));
        areaChart.getData().add(dataSeries1);
        
        VBox vbox = new VBox(areaChart);
        
        Scene scene = new Scene(vbox, 400, 400);
        
        primaryStage.setTitle("Exemplo de gráfico de linha");
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
