module org.clinic.clinic {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.persistence;
    requires java.sql;

    opens org.clinic to javafx.fxml;
    exports org.clinic;
    exports org.clinic.gui;
    opens org.clinic.gui to javafx.fxml;
}