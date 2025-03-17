package vidmot;

public enum View {

    PLAST("vidmot/maSkilaPlast-view.fxml"),

    GLER("vidmot/maSkilaGler-view.fxml"),

    ÁL("vidmot/maSkilaAl-view.fxml");

    private final String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
