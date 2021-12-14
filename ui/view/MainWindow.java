package ui.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainWindow {
    private AuthorizationWindow authorizationWindow;

    private RegistrationWindow registrationWindow;

    private UserDataWindow userDataWindow;

    private CreateFamilyWindow createFamilyWindow;

    private FamilyDataForMembersWindow familyDataForUSerWindow;

    private FamilyDataForHeadOfFamily dataOfUsersForHeadOfFamilyWindow;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createAccount;

    @FXML
    private Button createFamily;

    @FXML
    private Button exit;

    @FXML
    private Button familyData;

    @FXML
    private Button loginAccount;

    @FXML
    private Button userData;

    @FXML
    void initialize() {
        createFamily.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/create_family.fxml"));
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

        loginAccount.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/authorization.fxml"));
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
        createAccount.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/registration.fxml"));
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
            loader.setLocation(getClass().getResource("/ui/sample/user_data.fxml"));
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
        exit.setOnAction(e -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });
        familyData.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ui/sample/family_data_for_members.fxml"));
            try {
                loader.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/ui/sample/family_data_for_head_of_family.fxml"));
            try {
                loader2.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Parent root2 = loader2.getRoot();
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(root2));
            stage2.showAndWait();
        });
    }

    public void show() {

    }

    public void createAuthorizationWindow() {

    }

    public void createRegistrationWindow() {

    }

    public void createUserDataWindow() {

    }

    public void createUserAndFamilyDataWindow() {

    }

    public void createDataOfUsersForHeadOfFamilyWindow() {

    }

    public AuthorizationWindow getAuthorizationWindow() {
        return authorizationWindow;
    }

    public void setAuthorizationWindow(AuthorizationWindow authorizationWindow) {
        this.authorizationWindow = authorizationWindow;
    }

    public RegistrationWindow getRegistrationWindow() {
        return registrationWindow;
    }

    public void setRegistrationWindow(RegistrationWindow registrationWindow) {
        this.registrationWindow = registrationWindow;
    }

    public UserDataWindow getUserDataWindow() {
        return userDataWindow;
    }

    public void setUserDataWindow(UserDataWindow userDataWindow) {
        this.userDataWindow = userDataWindow;
    }

    public CreateFamilyWindow getCreateFamilyWindow() {
        return createFamilyWindow;
    }

    public void setCreateFamilyWindow(CreateFamilyWindow createFamilyWindow) {
        this.createFamilyWindow = createFamilyWindow;
    }
}