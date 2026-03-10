package org.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class MainController {
    @FXML private TableView<Contract> tableContracts;
    @FXML private TextField txtAmount, txtRate;
    @FXML private Label lblPremium;
    @FXML private DatePicker datePicker;
    @FXML private ComboBox<Branch> comboBranch;
    @FXML private ComboBox<InsuranceType> comboType;

    @FXML
    private void handleCalculatePremium() {
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            double rate = Double.parseDouble(txtRate.getText());

            if (amount <= 0) throw new Exception();

            double premium = (amount * rate) / 100;
            lblPremium.setText(String.format("%.2f", premium));
        } catch (Exception e) {
            lblPremium.setText("Помилка даних");
        }
    }

    @FXML
    private void handleSaveContract() {
        LocalDate selectedDate = datePicker.getValue();
        if (selectedDate.isAfter(LocalDate.now())) {
            System.out.println("Дата не може бути з майбутнього!");
            return;
        }
     }
}
