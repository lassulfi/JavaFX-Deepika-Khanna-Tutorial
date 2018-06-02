/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class LoginPage10 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lblEmail = new Label("E-mail: ");
        Label lblSenha = new Label("Senha: ");
        
        TextField txtEmail = new TextField();
        PasswordField txtPassword = new PasswordField();
        
        Button btnLogar = new Button("Logar");
        Button btnLimpar = new Button("Limpar");
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(15));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.add(lblEmail, 0, 0);
        gridPane.add(txtEmail, 1, 0);
        gridPane.add(lblSenha, 0, 1);
        gridPane.add(txtPassword, 1, 1);
        gridPane.add(btnLogar, 0, 2);
        gridPane.add(btnLimpar, 1, 2);
        gridPane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(gridPane, 400, 300);
        
        primaryStage.setTitle("Login");
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
