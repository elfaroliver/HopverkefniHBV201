package vidmot;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WebStadsetningarController {

    private void openWebView(String url) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("webView.fxml"));
        Parent root = loader.load();

        WebViewController controller = loader.getController();
        controller.loadURL(url);

        Stage stage = new Stage();
        stage.setTitle("Flöskumóttaka");
        stage.setScene(new Scene(root, 800, 650));
        stage.show();
    }

    public void openAustur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.1275426,-21.8503662,17z/data=!3m1!4b1!4m5!3m4!1s0x48d6749c41fc289f:0x954ac52b4399624c!8m2!3d64.1275403!4d-21.8481776");
    }

    public void openHofud(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.1275426,-21.8503662,17z/data=!3m1!4b1!4m5!3m4!1s0x48d6749c41fc289f:0x954ac52b4399624c!8m2!3d64.1275403!4d-21.8481776");
    }

    public void openNordur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@65.69042,-18.0947466,479m/data=!3m2!1e3!4b1!4m5!3m4!1s0x48d28f9fc1be91ad:0xc00f055227426ebc!8m2!3d65.69042!4d-18.0925579");
    }

    public void openVestur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Fj%C3%B6li%C3%B0jan/@64.3260567,-22.0633441,17z/data=!3m1!4b1!4m5!3m4!1s0x48d5ddfd2e7858cf:0xcced913ca10af352!8m2!3d64.3261757!4d-22.0609121");
    }

    public void openSudur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@65.69042,-18.0947466,479m/data=!3m2!1e3!4b1!4m5!3m4!1s0x48d28f9fc1be91ad:0xc00f055227426ebc!8m2!3d65.69042!4d-18.0925579");
    }
}