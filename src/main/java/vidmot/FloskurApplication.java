package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FloskurApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FloskurApplication.class.getResource("forsida-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setTitle("Flöskumóttaka");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Aðal klasi sem keyrir forritið.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}
