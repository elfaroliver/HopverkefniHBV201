module vidmot {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens vidmot to javafx.fxml;
    exports vidmot;
}