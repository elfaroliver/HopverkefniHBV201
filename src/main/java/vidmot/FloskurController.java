package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import vinnsla.Floskur;

public class FloskurController /*implements Initializable*/ {
    private final Floskur floskur = new Floskur();

    private int samtalsFjoldi = 0;
    private int samtalsVirdi = 0;

    private int greidaVerd = 0;
    private int greidaFjoldi = 0;

    @FXML
    private TextField textFieldDosir;
    @FXML
    private Label dosirLabel;

    @FXML
    private TextField textFieldFloskur;
    @FXML
    private Label floskurLabel;

    @FXML
    private Label samtalsEinn;
    @FXML
    private Label samtalsTveir;

    @FXML
    private Label greidaEinn;
    @FXML
    private Label greidaTveir;

    @FXML
    public Button buttonHreinsa;

    /**
     * Handler fyrir að setja inn fjölda dósa
     * og bæta við þeim fjölda í samtals.
     *
     * @param actionEvent
     */
    @FXML
    protected void onDosir(ActionEvent actionEvent) {
        try {
            int fjoldiD = Integer.parseInt(textFieldDosir.getText());
            if (fjoldiD < 0) {
                throw new NumberFormatException();
            }
            int heildDosir = Integer.parseInt(dosirLabel.getText());

            textFieldDosir.getStyleClass().removeAll("text-field-error");
            textFieldDosir.getStyleClass().add("text-field-valid");

            int gamlaGildi = floskur.getISKDosir();

            floskur.setFjoldiDosir(fjoldiD);
            dosirLabel.setText(String.valueOf(heildDosir + fjoldiD));

            samtalsFjoldi += fjoldiD;

            int nyjaGildi = floskur.getISKDosir();
            samtalsVirdi += nyjaGildi - gamlaGildi;

            samtalsEinn.setText(samtalsVirdi + "kr");
            samtalsTveir.setText(String.valueOf(samtalsFjoldi));

            textFieldDosir.clear();
        }
        catch (Exception e) {
            textFieldDosir.getStyleClass().removeAll("text-field-valid");
            textFieldDosir.getStyleClass().add("text-field-error");
            textFieldDosir.clear();
        }
    }

    /**
     * Handler fyrir að setja inn fjölda flaska
     * og bæta við þeim fjölda í samtals.
     *
     * @param actionEvent
     */
    @FXML
    protected void onFloskur(ActionEvent actionEvent) {
        try {
            int fjoldiF = Integer.parseInt(textFieldFloskur.getText());
            if (fjoldiF < 0) {
                throw new NumberFormatException();
            }
            int heildFloskur = Integer.parseInt(floskurLabel.getText());

            textFieldFloskur.getStyleClass().removeAll("text-field-error");
            textFieldFloskur.getStyleClass().add("text-field-valid");

            int gamlaGildi = floskur.getISKFloskur();

            floskur.setFjoldiFloskur(fjoldiF);
            floskurLabel.setText(String.valueOf(heildFloskur + fjoldiF));

            samtalsFjoldi += fjoldiF;

            int nyjaGildi = floskur.getISKFloskur();
            samtalsVirdi += nyjaGildi - gamlaGildi;

            samtalsEinn.setText(samtalsVirdi + "kr");
            samtalsTveir.setText(String.valueOf(samtalsFjoldi));

            textFieldFloskur.clear();
        }
        catch (Exception e) {
            textFieldFloskur.getStyleClass().removeAll("text-field-valid");
            textFieldFloskur.getStyleClass().add("text-field-error");
            textFieldFloskur.clear();

        }
    }

    /**
     * Handler til að greiða fyrir flöskur og dósir.
     * Tekur fjölda úr "Samtals" þegar ýtt er á greiða.
     *
     * @param actionEvent
     */
    @FXML
    protected void onGreida(ActionEvent actionEvent) {
        greidaVerd += samtalsVirdi;
        greidaFjoldi += samtalsFjoldi;

        greidaEinn.setText(greidaVerd + "kr");
        greidaTveir.setText(String.valueOf(greidaFjoldi));
    }

    /**
     * Handler til að hreinsa tölur úr öllum textFields og Labels.
     * Hreinsar ekki Greiða.
     *
     * @param actionEvent
     */
    @FXML
    protected void onHreinsa(ActionEvent actionEvent) {
        floskur.hreinsa();
        textFieldDosir.clear();
        textFieldFloskur.clear();
        dosirLabel.setText("0");
        floskurLabel.setText("0");
        samtalsEinn.setText("0");
        samtalsTveir.setText("0");
        samtalsFjoldi = 0;
        samtalsVirdi = 0;
    }
}
