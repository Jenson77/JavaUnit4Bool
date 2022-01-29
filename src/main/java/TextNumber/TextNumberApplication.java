package TextNumber;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class TextNumberApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (TextNumberApplication.class.getResource("textnumber-view.fxml"));
        Scene scene = new Scene (fxmlLoader.load(), 400, 500);
        primaryStage.setTitle("Text Number");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

