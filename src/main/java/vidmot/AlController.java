package vidmot;

import javafx.event.ActionEvent;

public class AlController {
    /**
     * Til að fara úr Ál í Gler
     * @param event
     */
    public void fxTilPlast(ActionEvent event) {
        ViewSwitcher.switchTo(View.GLER);
        System.out.println("Þessi takki fer í plast síðuna");
    }

    /**
     * Til að fara úr Ál í Plast
     * @param event
     */
    public void fxTilAl(ActionEvent event) {
        ViewSwitcher.switchTo(View.PLAST);
        System.out.println("Þessi takki fer í ál síðuna");
    }
}
