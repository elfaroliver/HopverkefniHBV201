package vidmot;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;


public class AlController {
    private MenuController menuController;

    public AlController(MenuController menuController) {
        this.menuController = menuController;
    }

    @FXML
    public void tilPlastButton(ActionEvent e) {
        menuController.setView("maSkilaPlast-view.fxml");
    }

    @FXML
    public void tilGlerButton(ActionEvent e) {
        menuController.setView("maSkilaGler-view.fxml");
    }
}