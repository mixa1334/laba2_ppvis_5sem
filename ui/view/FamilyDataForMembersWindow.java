package ui.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.family.Family;
import model.member.FamilyMember;

public class FamilyDataForMembersWindow {
    private FamilyMember member;

    private Family family;


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

    public void show() {

    }

    public FamilyMember getMember() {
        return member;
    }

    public void setMember(FamilyMember member) {
        this.member = member;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}

