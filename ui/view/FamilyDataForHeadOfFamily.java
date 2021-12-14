package ui.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.family.ChangeableFamily;
import model.member.FamilyMember;

public class FamilyDataForHeadOfFamily {
    private FamilyMember familyMember;

    private ChangeableFamily family;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel;

    @FXML
    private Button offers;

    @FXML
    private Button userData;

    @FXML
    void initialize() {
        offers.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/offered_income_and_expense.fxml"));
            try {
                loader.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        userData.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/member_data.fxml"));
            try {
                loader.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        cancel.setOnAction(e -> {
            Stage stage = (Stage) cancel.getScene().getWindow();
            stage.close();
        });
    }

    public void show() {

    }

    public boolean addFamilyMember() {
        return true;
    }

    public boolean removeFamilyMember() {
        return true;
    }

    public boolean watchFamilyMemberData() {
        return true;
    }

    public BigDecimal watchMoneyBalance() {
        return null;
    }

    public FamilyMember getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {
        this.familyMember = familyMember;
    }

    public ChangeableFamily getFamily() {
        return family;
    }

    public void setFamily(ChangeableFamily family) {
        this.family = family;
    }
}
