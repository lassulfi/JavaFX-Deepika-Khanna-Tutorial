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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class MenuExample12 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("Arquivos");
        MenuItem newFileMenuItem = new MenuItem("Novo");
        MenuItem saveFileMenuItem = new MenuItem("Salvar");
        MenuItem exitMenuItem = new MenuItem("Sair");
        fileMenu.getItems().addAll(newFileMenuItem, saveFileMenuItem, exitMenuItem);
        menuBar.getMenus().add(fileMenu);
        
        Menu webMenu = new Menu("Web");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        htmlMenuItem.setSelected(true);
        CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
        cssMenuItem.setSelected(true);
        webMenu.getItems().addAll(htmlMenuItem, cssMenuItem);
        menuBar.getMenus().add(webMenu);
        
        Menu sqlMenu = new Menu("SQL");
        RadioMenuItem mySqlMenuItem = new RadioMenuItem("MySQL");
        RadioMenuItem oracleMenuItem = new RadioMenuItem("Oracle");
        ToggleGroup tg = new ToggleGroup();
        mySqlMenuItem.setToggleGroup(tg);
        oracleMenuItem.setToggleGroup(tg);
        
        Menu tutorialMenu = new Menu("Tutoriais");
        MenuItem m1 = new MenuItem("Java");
        MenuItem m2 = new MenuItem("JavaFX");
        MenuItem m3 = new MenuItem("Swing");
        tutorialMenu.getItems().addAll(m1, m2, m3);
        
        sqlMenu.getItems().addAll(mySqlMenuItem, oracleMenuItem, tutorialMenu);
        menuBar.getMenus().add(sqlMenu);
        
        BorderPane bp = new BorderPane();
        bp.setTop(menuBar);
        
        Scene scene = new Scene(bp, 300, 400);
        
        primaryStage.setTitle("Exemplo de menu");
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
