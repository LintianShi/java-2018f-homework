package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import java.net.URL;
import javafx.scene.*;
/*
public class Main extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception{
        try{
            World.initWord();
            System.out.println(getClass().getResource("/sample.fxml"));
            //assert (false);
            URL fxmlLocation = getClass().getResource("/sample.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(fxmlLocation);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
            Parent root = fxmlLoader.load();
            Controller controller = fxmlLoader.getController();
            controller.init();
            //Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("My Application");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/