module com.devbam.kioskrenewal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires java.sql;
    requires static lombok;


    opens com.devbam.kioskrenewal to javafx.fxml;
    exports com.devbam.kioskrenewal;
}