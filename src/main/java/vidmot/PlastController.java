package vidmot;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;


public class PlastController {
    private MenuController menuController;

    public void setMenuController (MenuController menuController) {
        this.menuController = menuController;
    }

    @FXML
    public void tilGlerButton(ActionEvent e) {
        menuController.setView("maSkilaGler-view.fxml");
    }

    @FXML
    public void tilAlButton(ActionEvent e) {
        menuController.setView("maSkilaAl-view.fxml");
    }
}