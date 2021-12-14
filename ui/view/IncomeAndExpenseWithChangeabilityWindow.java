

package ui.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class IncomeAndExpenseWithChangeabilityWindow extends IncomeAndExpenseWindow {

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

    public boolean deleteIncome() {
        return true;
    }

    public boolean addIncome() {
        return true;
    }

    public boolean updateIncome() {
        return true;
    }

    public boolean deleteExpense() {
        return true;
    }

    public boolean addExpense() {
        return true;
    }

    public boolean updateExpense() {
        return true;
    }
}

