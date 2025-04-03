package vidmot;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ForsidaController {
    @FXML
    private BorderPane rootBorderPane;

    @FXML
    private VBox centerVBox;

    @FXML
    protected void onTelja() {
        rootBorderPane.setCenter(centerVBox);
    }
}
