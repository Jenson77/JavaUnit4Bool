module com.example.javaunit4bool {
    requires javafx.controls;
    requires javafx.fxml;

    opens TextNumber to javafx.fxml;
    exports TextNumber;


}