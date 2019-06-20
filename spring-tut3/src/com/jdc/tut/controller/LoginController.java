package com.jdc.tut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jdc.tut.entity.User;
import com.jdc.tut.service.UserService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
@Controller
public class LoginController {

    @FXML
    private TextField name;

    @FXML
    private PasswordField passward;

    @FXML
    private Label message;
    @Autowired
    private UserService service;
    private static User user;
    
    public static User getUser() {
	return user;
}
    @FXML
    void cancel() {

    }

    @FXML
    void enter(){
    	try {
    	 user=service.findBylogin(name.getText(),passward.getText());
       MainController.showMain();
       passward.getScene().getWindow().hide();
    }catch (Exception ex) {
    	message.setText(ex.getMessage());
    }

}
}