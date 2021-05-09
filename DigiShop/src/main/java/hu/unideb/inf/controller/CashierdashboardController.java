/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author amirs
 */
public class CashierdashboardController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private Button Dashboard;
    @FXML
    private Button Products;
    @FXML
    private Button Signout;
    @FXML
    private BarChart<String, Number> Chart;
    @FXML 
    void handleButtonAction(ActionEvent event) throws IOException{
     FXMLLoader loader = new FXMLLoader(LoginPageController.class.getResource("/fxml/Cashierproductspage.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
   
        stage.setTitle("LoginPage");
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb  */
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        XYChart.Series<String, Number> Series = new XYChart.Series<>();
        Series.setName("Best seller");
        Series.getData().add(new XYChart.Data<>("Iphone12",150));
        Series.getData().add(new XYChart.Data<>("Sony playstation 5",100));
        Series.getData().add(new XYChart.Data<>("Galaxy s21",70));
        
        Chart.getData().add(Series);
    }    
    
}
