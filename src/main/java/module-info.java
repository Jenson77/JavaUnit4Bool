module com.example.javaunit4bool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaunit4bool to javafx.fxml;
    exports com.example.javaunit4bool;
}