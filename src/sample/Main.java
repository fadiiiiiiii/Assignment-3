package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.*;

import java.awt.*;
import java.security.PrivateKey;

public class Main extends Application {
    private Label username;
    private Label password;
    private TextField Username;
    private TextField Password;
    private VBox;
    private VBox;


    private Button Signin;
    @Override
    public void start(Stage primaryStage) throws Exception{
    username=new Label("UserName");
    password=new Label("Password");
    Username=new TextField();
    Password=new TextField();
    VBox
        primaryStage.setTitle("Hello World");

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
