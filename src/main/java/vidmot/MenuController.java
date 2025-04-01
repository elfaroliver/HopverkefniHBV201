package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MenuController {

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
    private MenuItem faraAustur;
    @FXML
    private MenuItem faraHofud;
    @FXML
    private MenuItem faraNordur;
    @FXML
    private MenuItem faraSudur;
    @FXML
    private MenuItem faraVestur;
    @FXML
    private Button fxTilAl;
    @FXML
    private Button fxTilGler;
    @FXML
    private Button fxTilPlast;

    public void fxFaraAustur(ActionEvent event) {
        // Fara í Austur
        ViewSwitcher.switchTo(View.AUSTUR);
        System.out.println("Þessi takki fer í Austur");
    }

    public void fxFaraHofud(ActionEvent event) {
        // Fara í Höfuðborgarsvæðið
        ViewSwitcher.switchTo(View.HOFUD);
        System.out.println("Þessi takki fer í Höfuðborgarsvæðið");
    }

    public void fxFaraNordur(ActionEvent event) {
        // Fara í Norður
        ViewSwitcher.switchTo(View.NORDUR);
        System.out.println("Þessi takki fer í Norður");
    }

    public void fxFaraSudur(ActionEvent event) {
        // Fara í Suður
        ViewSwitcher.switchTo(View.SUDUR);
        System.out.println("Þessi takki fer í Suður");
    }

    public void fxFaraVestur(ActionEvent event) {
        // Fara í Vestur
        ViewSwitcher.switchTo(View.VESTUR);
        System.out.println("Þessi takki fer í Vestur");
    }

    public void fxTilAl(ActionEvent event) {
        ViewSwitcher.switchTo(View.ÁL);
        System.out.println("Þessi takki fer í ál síðuna");
    }

    public void fxTilGler(ActionEvent event) {
        ViewSwitcher.switchTo(View.GLER);
        System.out.println("Þessi takki fer í gler síðuna");
    }

    public void fxTilPlast(ActionEvent event) {
        ViewSwitcher.switchTo(View.PLAST);
        System.out.println("Þessi takki fer í plast síðuna");
    }

    public void fxTelja(ActionEvent event) {
        ViewSwitcher.switchTo(View.TELJA);
        System.out.println("Þessi takki fer í telja síðuna");
    }
}
