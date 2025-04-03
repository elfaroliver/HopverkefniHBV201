package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;

import java.io.IOException;

public class MenuController {

    @FXML
    private StackPane stackPaneCenter;
    @FXML
    private BorderPane rootBorderPane;
    @FXML
    private VBox centerVBox;

    @FXML
    private Button buttonAustur;
    @FXML
    private Button buttonHofud;
    @FXML
    private Button buttonNordur;
    @FXML
    private Button buttonSudur;
    @FXML
    private Button buttonVestur;
    @FXML
    private Button fxTilAl;
    @FXML
    private Button fxTilGler;
    @FXML
    private Button fxTilPlast;

    @FXML
    public void initialize() {
        // Load default view on app start
        setView("velkominn-view.fxml");
    }

    private void setView(String fxmlFile) {
        try {
            Node view = FXMLLoader.load(getClass().getResource(fxmlFile));
            stackPaneCenter.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fxFaraAustur(ActionEvent event) {
        // Fara í Austur
        setView("hvertAustur-view.fxml");
        System.out.println("Þessi takki fer í Austur");
    }

    public void fxFaraHofud(ActionEvent event) {
        // Fara í Höfuðborgarsvæðið
        setView("hvertHofud-view.fxml");
        System.out.println("Þessi takki fer í Höfuðborgarsvæðið");
    }

    public void fxFaraNordur(ActionEvent event) {
        // Fara í Norður
        setView("hvertNordur-view.fxml");
        System.out.println("Þessi takki fer í Norður");
    }

    public void fxFaraSudur(ActionEvent event) {
        // Fara í Suður
        setView("hvertSudur-view.fxml");
        System.out.println("Þessi takki fer í Suður");
    }

    public void fxFaraVestur(ActionEvent event) {
        // Fara í Vestur
        setView("hvertVestur-view.fxml");
        System.out.println("Þessi takki fer í Vestur");
    }

    public void fxTilAl(ActionEvent event) {
        setView("maSkilaAl-view.fxml");
        System.out.println("Þessi takki fer í ál síðuna");
    }

    public void fxTilGler(ActionEvent event) {
        setView("maSkilaGler-view.fxml");
        System.out.println("Þessi takki fer í gler síðuna");
    }

    public void fxTilPlast(ActionEvent event) {
        setView("maSkilaPlast-view.fxml");
        System.out.println("Þessi takki fer í plast síðuna");
    }

    public void fxTelja(ActionEvent event) {
        setView("floskur-view.fxml");
        System.out.println("Þessi takki fer í telja síðuna");
    }
}
