package vidmot;

import javafx.event.ActionEvent;

public class PlastController {
    /**
     * Til að fara úr Plast í Gler
     * @param event
     */
    public void fxTilGler(ActionEvent event) {
        ViewSwitcher.switchTo(View.GLER);
        System.out.println("Þessi takki fer í gler síðuna");
    }

    /**
     * Til að fara úr Plast í Ál
     * @param event
     */
    public void fxTilAl(ActionEvent event) {
        ViewSwitcher.switchTo(View.ÁL);
        System.out.println("Þessi takki fer í ál síðuna");
    }
}
