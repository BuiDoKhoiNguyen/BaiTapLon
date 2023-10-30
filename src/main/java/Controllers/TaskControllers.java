package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TaskControllers extends Controllers {
    @FXML
    protected Label searchLabel;
    @FXML
    protected Label translateLabel;
    @FXML
    protected Label favouriteLabel;
    @FXML
    protected Label editLabel;
    @FXML
    protected Label gameLabel;
    @FXML
    protected Label logoutLabel;

    private void bindLabel(Label label, Button button) {
        label.visibleProperty().bind(button.hoverProperty());
        label.backgroundProperty().bind(button.backgroundProperty());
    }

    public void load(Button searchButton, Button translateButton,
                     Button favouriteButton, Button editButton,
                     Button gameButton, Button logoutButton) {
        this.searchButton = searchButton;
        this.translateButton = translateButton;
        this.favouriteButton = favouriteButton;
        this.editButton = editButton;
        this.gameButton = gameButton;
        this.logoutButton = logoutButton;

        bindLabel(searchLabel, searchButton);
        bindLabel(translateLabel, translateButton);
        bindLabel(favouriteLabel, favouriteButton);
        bindLabel(editLabel, editButton);
        bindLabel(gameLabel, gameButton);
    }
}
