package com.jdc.tut.controller;


import org.springframework.stereotype.Controller;

import com.jdc.tut.Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
@Controller
public class MainController{

    @FXML
    private HBox Header;
    
    @FXML
    private StackPane Content;
    
    public static void showMain() {
    	try {
    	FXMLLoader Loader=new FXMLLoader (MainController.class.getResource("view/Main.fxml"));
    	Loader.setControllerFactory(Main::getController);
    	Stage  st= new Stage();
		st.setScene(new Scene(Loader.load()));
		st.show();
    }catch(Exception ex) {
    	ex.printStackTrace();
    }

}
    }

