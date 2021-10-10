package com.example.demo2

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import javafx.scene.input.KeyCombination


class HelloController {
    @FXML
    private lateinit var inputField: TextField

    @FXML
    private lateinit var outputField: TextArea


    @FXML
    private fun handleButtonSend(event: ActionEvent) {
        outputField.appendText(inputField.getText())
        System.out.println(inputField.getText())
        inputField.clear()
        inputField.requestFocus()
    }

    @FXML
    private fun handleButtonClear(event: ActionEvent) {
        outputField.clear()
        inputField.requestFocus()
    }

}

