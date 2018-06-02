/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author LuisDaniel
 */
public class RegistrationForm11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lblName = new Label("Nome: ");
        TextField txtName = new TextField();
        
        Label lblBirthDate = new Label("Data de nascimento: ");
        DatePicker dtBirthDate = new DatePicker();
        
        Label lblGender = new Label("Sexo: ");
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Masculino");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("Feminino");
        femaleRadio.setToggleGroup(groupGender);
        
        Label lblTechKnown = new Label("Conhecimentos técnicos: ");
        CheckBox cbJava = new CheckBox("Java");
        CheckBox cbDotNet = new CheckBox("DotNet");
        
        Label lblEducQual = new Label("Formação: ");
        ListView lvEducationItems = new ListView();
        lvEducationItems.getItems().add("Ensino Fundamental");        
        lvEducationItems.getItems().add("Ensino Médio");        
        lvEducationItems.getItems().add("Ensino Superior");
        lvEducationItems.getItems().add("Tecnólogo");
        lvEducationItems.getItems().add("Pós-graduação");        
        lvEducationItems.getItems().add("MBA");        
        lvEducationItems.getItems().add("Mestrado");        
        lvEducationItems.getItems().add("Doutorado");        
        lvEducationItems.getItems().add("Phd"); 
        
        Label lbLocation = new Label("País de origem: ");
        ChoiceBox cbLocation = new ChoiceBox();
        cbLocation.getItems().addAll("Brasil", "Estados Unidos", "Inglaterra", "Argentina", "Índia");
        
        Button btnSubmit = new Button("Cadastrar");
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 15, 15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.add(lblName, 0, 0);
        gridPane.add(txtName, 1, 0);
        gridPane.add(lblBirthDate, 0, 1);
        gridPane.add(dtBirthDate, 1, 1);
        gridPane.add(lblGender, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(lblTechKnown, 0, 3);
        gridPane.add(cbJava, 1, 3);
        gridPane.add(cbDotNet, 2, 3);
        gridPane.add(lblEducQual, 0, 4);
        gridPane.add(lvEducationItems, 1, 4);
        gridPane.add(lbLocation, 0, 5);
        gridPane.add(cbLocation, 1, 5);
        gridPane.add(btnSubmit, 2, 6);
        
        Scene scene = new Scene(gridPane, 600, 600);
        
        primaryStage.setTitle("Cadastro de Alunos");
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
