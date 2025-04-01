package vidmot;

public enum View {

    PLAST("vidmot/maSkilaPlast-view.fxml"),

    GLER("vidmot/maSkilaGler-view.fxml"),

    ÁL("vidmot/maSkilaAl-view.fxml"),

    AUSTUR("vidmot/hvertAustur-view.fxml"),

    HOFUD("vidmot/hvertHofud-view.fxml"),

    NORDUR("vidmot/hvertNordur-view.fxml"),

    SUDUR("vidmot/hvertSudur-view.fxml"),

    TELJA("vidmot/floskur-view.fxml"),

    VESTUR("vidmot/hvertVestur-view.fxml");

    private final String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
