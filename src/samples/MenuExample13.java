/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class MenuExample13 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MenuBar menuBar = new MenuBar();
        Menu mainMenu = new Menu("Menu Principal");
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        SeparatorMenuItem separator = new SeparatorMenuItem();
        MenuItem item3 = new MenuItem("Item 3");
        CustomMenuItem item4 = new CustomMenuItem(new Slider());
        mainMenu.getItems().addAll(item1, item2, separator, item3, item4);
        menuBar.getMenus().add(mainMenu);
        
        BorderPane bp = new BorderPane();
        bp.setTop(menuBar);
        
        Scene scene = new Scene(bp, 300, 500);
        
        primaryStage.setTitle("Menu customizável");
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
