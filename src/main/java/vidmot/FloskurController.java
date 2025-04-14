package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Pair;
import vinnsla.Floskur;

import java.util.Optional;

public class FloskurController /*implements Initializable*/ {
    private final Floskur floskur = new Floskur();

    @FXML
    private Label glerLabel;
    @FXML
    private TextField textFieldGler;

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
    public Button buttonGreida;
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
    @FXML
    protected void onGler(ActionEvent event) {
        try {
            int fjoldiF = Integer.parseInt(textFieldGler.getText());
            if (fjoldiF < 0) {
                throw new NumberFormatException();
            }
            int heildGler= Integer.parseInt(glerLabel.getText());

            textFieldGler.getStyleClass().removeAll("text-field-error");
            textFieldGler.getStyleClass().add("text-field-valid");

            int gamlaGildi = floskur.getISKFloskur();

            floskur.setFjoldiFloskur(fjoldiF);
            glerLabel.setText(String.valueOf(heildGler + fjoldiF));

            samtalsFjoldi += fjoldiF;

            int nyjaGildi = floskur.getISKFloskur();
            samtalsVirdi += nyjaGildi - gamlaGildi;

            samtalsEinn.setText(samtalsVirdi + "kr");
            samtalsTveir.setText(String.valueOf(samtalsFjoldi));

            textFieldGler.clear();
        }
        catch (Exception e) {
            textFieldGler.getStyleClass().removeAll("text-field-valid");
            textFieldGler.getStyleClass().add("text-field-error");
            textFieldGler.clear();

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

        opna();
    }

    /**
     * Dialogið sem greiðslutakkinn opnar fyrir bankainfo
     * Uppsetningin er öfug miðað við útlit. Fyrst eru takkarnir settir upp og svo eru
     * textfields uppsett
     */
    public void opna() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Greiðsla");
        dialog.setHeaderText("Gefðu okkur upplýsingarnar þínar fyrir þessum " + greidaVerd + " kr");

        // Senda og Cancel takkar
        ButtonType loginButtonType = new ButtonType("Senda", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        // Textfields með ljósgráuinfo/prompti
        TextField kennitala = new TextField();
        kennitala.setPromptText("Kennitala, xxxxxx-xxxx");
        TextField banki = new TextField();
        banki.setPromptText("Bankareikningur, xxxx-xx-xxxxxx");

        // VBox af þessum tvem textfields
        dialog.getDialogPane().setContent(new VBox(10, kennitala, banki));

        // Þetta gerir svosem ekkert nema gefa sout eitthvað til að prenta
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(kennitala.getText(), banki.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();

        // Prentar bara í IntelliJ, gamla góða insanitycheck
        result.ifPresent(pair -> {
            System.out.println("Kennitala: " + pair.getKey());
            System.out.println("Bankareikningur: " + pair.getValue());
        });

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
        textFieldGler.clear();
        dosirLabel.setText("0");
        floskurLabel.setText("0");
        glerLabel.setText("0");
        samtalsEinn.setText("0");
        samtalsTveir.setText("0");
        samtalsFjoldi = 0;
        samtalsVirdi = 0;
    }

}
