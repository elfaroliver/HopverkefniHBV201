module vidmot {
    requires javafx.fxml;
    requires javafx.web;

    opens vidmot to javafx.fxml;
    exports vidmot;
}