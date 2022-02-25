package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

  @FXML
  private ListView<String> resultMsg;

  @FXML
  private TextField inputField;


  @FXML
  void initialize() {
  }


  @FXML
  public void sendMessage() {
    String message = inputField.getText();
    if (!message.isEmpty()){
      resultMsg.getItems().add(message);
    }
    inputField.clear();

  }


}