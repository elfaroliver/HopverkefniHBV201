package vidmot;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;


public class GlerController {
    private MenuController menuController;

    public void setMenuController (MenuController menuController) {
        this.menuController = menuController;
    }

    @FXML
    public void tilPlastButton(ActionEvent e) {
        menuController.setView("maSkilaPlast-view.fxml");
    }

    @FXML
    public void tilAlButton(ActionEvent e) {
        menuController.setView("maSkilaAl-view.fxml");
    }
}