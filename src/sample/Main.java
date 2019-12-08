package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("OptionBox.fxml"));
        primaryStage.setTitle("Choose");
        primaryStage.setScene(new Scene(root, 266.0, 200.0));
        primaryStage.show();
    }


}
