package ui.view;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OfferedIncomeAndExpenseWindow extends IncomeAndExpenseWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel;

    @FXML
    void initialize() {
        cancel.setOnAction(e -> {
            Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
        });
    }

    public boolean rejectOfferedIncome() {
        return true;
    }

    public boolean acceptOfferedIncome() {
        return true;
    }

    public boolean rejectOfferedExpense() {
        return true;
    }

    public boolean acceptOfferedExpense() {
        return true;
    }
}

