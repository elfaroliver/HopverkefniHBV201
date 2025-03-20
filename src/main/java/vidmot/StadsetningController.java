package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StadsetningController {

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
}
