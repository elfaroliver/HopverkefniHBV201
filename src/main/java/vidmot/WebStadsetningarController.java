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

    /**
     * Fjórar staðsetningar fyrir Austurland
     * @param event
     * @throws IOException
     */
    public void openAustur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/S%C3%A6braut,+780+H%C3%B6fn+%C3%AD+Hornafir%C3%B0i/@64.252797,-15.2014671,416m/" +
                "data=!3m2!1e3!4b1!4m10!1m2!2m1!1zU8OmYnJhdXQgMSw3ODAgSMO2Zm4gw60gSG9ybmFmaXLDsGk!3m6!1s0x48cfac594e9bb879:0xc0933b59c8e27389!" +
                "8m2!3d64.2527948!4d-15.1966016!15sCiNTw6ZicmF1dCAxLDc4MCBIw7ZmbiDDrSBIb3JuYWZpcsOwaZIBBXJvdXRl4AEA!16s%2Fg%2F11w7g2rt0s?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openAustur1(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/64%C2%B039'28.6%22N+14%C2%B016'40.4%22W/@64.6579444,-14.2778889,410m/" +
                "data=!3m2!1e3!4b1!4m4!3m3!8m2!3d64.6579444!4d-14.2778889?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openAustur2(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Fjar%C3%B0arbraut+40,+755+St%C3%B6%C3%B0varfj%C3%B6r%C3%B0ur/@64.8334417,-13.8789574,407m/" +
                "data=!3m1!1e3!4m10!1m2!2m1!1zTGFuZGF0YW5naSBlaGYgLSBGamFyw7BhcmJyYXV0IDQwYSwgNzU1IFN0w7bDsHZhcmZqw7Zyw7B1cg!3m6!1s0x48ceb560a75c9671:" +
                "0xc9cb2cfd5a94b320!8m2!3d64.8336083!4d-13.8766561!15sCjpMYW5kYXRhbmdpIGVoZiAtIEZqYXLDsGFyYnJhdXQgNDBhLCA3NTUgU3TDtsOwdmFyZmrDtnLDsHVykgEQZ2VvY29kZWRfYWRkcmVzc-ABAA!16s%2Fg%2F11ld_myvh4?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openAustur3(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Frystih%C3%BAsi%C3%B0+-+Brei%C3%B0dalsv%C3%ADk/@64.791968,-14.0114597,408m/" +
                "data=!3m1!1e3!4m10!1m2!2m1!1zRmVsbGkgLSBIbGHDsGFuLCAsIDc2MSBCcmVpw7BkYWxzdsOtaw!3m6!1s0x48cec93a95508db9:0xa0082dadab9cc4e1!" +
                "8m2!3d64.791968!4d-14.007568!15sCiVGZWxsaSAtIEhsYcOwYW4sICwgNzYxIEJyZWnDsGRhbHN2w61rkgEMY29uY2VydF9oYWxs4AEA!16s%2Fg%2F11l31y9q36?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }

    /**
     * Fjórar staðsetningar fyrir Höfuðborgarsvæðið
     * @param event
     * @throws IOException
     */
    public void openHofud(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.1275426,-21.8503662,17z/data=!3m1!4b1!4m5!3m4!1s0x48d6749c41fc289f:0x954ac52b4399624c!8m2!3d64.1275403!4d-21.8481776");
    }
    public void openHofud1(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.15192,-21.8721737,104m/" +
                "data=!3m1!1e3!4m6!3m5!1s0x48d675bd9dc3773f:0x95d006d7f197a14e!8m2!3d64.1520267!4d-21.8718613!16s%2Fg%2F11l5k80r4f?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openHofud2(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.1170337,-21.8739337,3346m/" +
                "data=!3m1!1e3!4m6!3m5!1s0x48d67345474c24fd:0x52a6c3044fd41db9!8m2!3d64.1062459!4d-21.8654225!16s%2Fg%2F11c2ptgy24?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openHofud3(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@64.0800823,-21.9368707,419m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48d60d1496a72d4f:0xca596ebbd25403a5!8m2!3d64.0800823!4d-21.9368707!16s%2Fg%2F11h1fznymv?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }

    /**
     * Fjórar staðsetningar fyrir Norðurland
     * @param event
     * @throws IOException
     */
    public void openNordur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+fl%C3%B6skum%C3%B3ttaka/@65.69042,-18.0947466,479m/data=!3m2!1e3!4b1!4m5!3m4!1s0x48d28f9fc1be91ad:0xc00f055227426ebc!8m2!3d65.69042!4d-18.0925579");
    }
    public void openNordur1(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/H%C3%B6f%C3%B0abraut+1,+530+Hvammstangi/@65.39609,-20.9438187,399m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48d49b7217eaeb77:0xe9505d7223f73e88!8m2!3d65.39609!4d-20.9438187!16s%2Fg%2F11l5cyx314?" +
                "entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openNordur2(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Helluhraun+2,+660+Reykjahl%C3%AD%C3%B0/@65.6419675,-16.9101611,395m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48cd9e5d06712cc5:0x85566fb33f2eb5c!8m2!3d65.6419653!4d-16.9075808!16s%2Fg%2F11fx16wv72?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openNordur3(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/%C3%8Dsfell+verslun+-+H%C3%BAsav%C3%ADk/@66.0446475,-17.3440877,389m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48cd43375e2c2673:0x60ea87faaaf163e8!8m2!3d66.0446475!4d-17.3440877!16s%2Fg%2F11h1ltbnnz?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }

    /**
     * Fjórar staðsetningar fyrir Suðurland
     * @param event
     * @throws IOException
     */
    public void openSudur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+Selfoss/@63.9395504,-20.9741257,1683m/" +
                "data=!3m1!1e3!4m6!3m5!1s0x48d65f6472b1ef7f:0x9b04038b4050e07e!8m2!3d63.9395504!4d-20.9741257!16s%2Fg%2F11ryb07_9j?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openSudur1(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Endurvinnslan+Fl%C3%B6skum%C3%B3ttaka+Eyjar/@63.4405258,-20.2819162,857m/" +
                "data=!3m1!1e3!4m15!1m8!3m7!1s0x48d708c12cc34465:0x85e1cba71f359df5!2sFaxast%C3%ADgur+46,+900+Vestmannaeyjab%C3%A6r!3b1!8m2!3d63.4408014!4d-20.281047!16s%2Fg%2F11ldj1c84v!3m5!1s0x48d7097015635707:0xe2a22afbb3a6a3a0!8m2!3d63.440798!4d-20.2806775!16s%2Fg%2F11rtyc7kcx?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openSudur2(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Ormsv%C3%B6llur+2,+860+Hvolsv%C3%B6llur/@63.7477491,-20.2281024,424m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48d6e3a01887c699:0x19a8a27265dd249e!8m2!3d63.7477491!4d-20.2281024!16s%2Fg%2F11y3lh70xy?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openSudur3(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Hafnarskei%C3%B0,+815+%C3%9Eorl%C3%A1ksh%C3%B6fn/@63.8629821,-21.382214,422m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48d6424f549be657:0x8cee8cca07916d3f!8m2!3d63.8629798!4d-21.3796337!16s%2Fg%2F1tq8j3ym?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }

    /**
     * Fjórar staðsetningar fyrir Vesturland
     * @param event
     * @throws IOException
     */
    public void openVestur(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Fj%C3%B6li%C3%B0jan/@64.3260567,-22.0633441,17z/data=!3m1!4b1!4m5!3m4!1s0x48d5ddfd2e7858cf:0xcced913ca10af352!8m2!3d64.3261757!4d-22.0609121");
    }
    public void openVestur1(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/466R%2B22R,+Vesturbraut+20,+370+B%C3%BA%C3%B0ardalur/@65.1103018,-21.7600489,403m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x48d4f9a287845443:0x2eab39b09a460136!8m2!3d65.1103018!4d-21.7600489!16s%2Fg%2F11y7jm0rwm?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openVestur2(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/S%C3%B3lvellir+7,+350+Grundarfj%C3%B6r%C3%B0ur/@64.9260451,-23.2757366,3248m/" +
                "data=!3m1!1e3!4m15!1m8!3m7!1s0x48d57a40d304f147:0xe18be106e311cc6!2zU8OzbHZlbGxpciA3LCAzNTAgR3J1bmRhcmZqw7Zyw7B1cg!3b1!8m2!3d64.9260451!4d-23.2582271!" +
                "16s%2Fg%2F11nn4576nz!3m5!1s0x48d57a40d304f147:0xe18be106e311cc6!8m2!3d64.9260451!4d-23.2582271!16s%2Fg%2F11nn4576nz?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
    public void openVestur3(ActionEvent event) throws IOException {
        openWebView("https://www.google.com/maps/place/Snoppuvegur+1,+355+%C3%93lafsv%C3%ADk/@64.8979677,-23.7109142,406m/" +
                "data=!3m2!1e3!4b1!4m6!3m5!1s0x492a831f77ef75e5:0x9661e6b35712c258!8m2!3d64.8979654!4d-23.7083339!16s%2Fg%2F11c88_j0k4?entry=ttu&g_ep=EgoyMDI1MDQwOC4wIKXMDSoASAFQAw%3D%3D");
    }
}