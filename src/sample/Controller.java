package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller extends CurrencyConverter {

    @FXML Button convert = new Button();

    @FXML TextField textFieldEuro = new TextField();
    @FXML TextField textFieldYen = new TextField();

    public void doConvertion()
    {
        convert.setOnAction(e -> {
            double euro = Double.parseDouble(textFieldEuro.getText());
            textFieldYen.setText(String.valueOf(euroToYen(euro)));
        });
    }

}
