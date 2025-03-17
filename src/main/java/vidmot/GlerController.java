package vidmot;

import javafx.event.ActionEvent;

public class GlerController {
    /**
     * Til að fara úr Gler í Plast
     * @param event
     */
    public void fxTilPlast(ActionEvent event) {
        ViewSwitcher.switchTo(View.PLAST);
        System.out.println("Þessi takki fer í plast síðuna");
    }

    /**
     * Til að fara úr Gler í Ál
     * @param event
     */
    public void fxTilAl(ActionEvent event) {
        ViewSwitcher.switchTo(View.ÁL);
        System.out.println("Þessi takki fer í ál síðuna");
    }
}
