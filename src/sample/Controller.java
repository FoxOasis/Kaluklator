package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    Matma matma = new Matma();

    @FXML
    private void cyfry(ActionEvent event) {
        if (event.getSource() == jeden) {
            display.setText(display.getText() + 1);
        } else if (event.getSource() == dwa) {
            display.setText(display.getText() + 2);
        } else if (event.getSource() == trzy) {
            display.setText(display.getText() + 3);
        } else if (event.getSource() == cztery) {
            display.setText(display.getText() + 4);
        } else if (event.getSource() == piec) {
            display.setText(display.getText() + 5);
        } else if (event.getSource() == szesc) {
            display.setText(display.getText() + 6);
        } else if (event.getSource() == siedem) {
            display.setText(display.getText() + 7);
        } else if (event.getSource() == osiem) {
            display.setText(display.getText() + 8);
        } else if (event.getSource() == dziewiec) {
            display.setText(display.getText() + 9);
        } else if (event.getSource() == zero) {
            display.setText(display.getText() +0);
        } else if (event.getSource() == kasuj) {
            display.setText("");
        }


    }

    @FXML
    private void dzialanie(ActionEvent event) {
        matma.addDane(display.getText());
        if (event.getSource() == plus) {
            matma.addDane("+");

        } else if (event.getSource() == minus) {
            matma.addDane("-");

        } else if (event.getSource() == dziel) {
            matma.addDane("/");

        } else if (event.getSource() == mnoz) {
            matma.addDane("*");

        }
        display.setText("");
    }


    @FXML
    private void oblicz(ActionEvent event) {
        matma.addDane(display.getText());
        display.setText(matma.oblicz());
    }

    @FXML
    Button zero;
    @FXML
    Button jeden;
    @FXML
    Button dwa;
    @FXML
    Button trzy;
    @FXML
    Button cztery;
    @FXML
    Button piec;
    @FXML
    Button szesc;
    @FXML
    Button siedem;
    @FXML
    Button osiem;
    @FXML
    Button dziewiec;
    @FXML
    Button plus;
    @FXML
    Button minus;
    @FXML
    Button mnoz;
    @FXML
    Button dziel;
    @FXML
    Button rownaSIe;
    @FXML
    Button kasuj;
    @FXML
    TextField display;

}
