package com.example.namerandomiser;

import java.util.Arrays;
import java.util.List;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {

    private static final int DELAY_MILLIS = 10;
    private static final int NAMES_ARRAY_LENGTH = 3;
    private static final int RANDOMISE_NAME_INDEX = 2;

    private List<String> names;
    private int currentIndex;
    private Timeline timeline;

    @Override
    public void start(Stage stage) throws Exception {
        names = Arrays.asList("Mia", "Cait", "James");
        currentIndex = 0;

        VBox root = new VBox();
        Label nameLabel = new Label(names.get(0));
        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 50));

        Button randomiseButton = new Button("Randomise Names");

        randomiseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline = new Timeline(
                    new KeyFrame(Duration.seconds(1), e -> {
                        Platform.runLater(() -> {
                            for (String name: names){
                                nameLabel.setText(name);
                                
                            }
                        });
                    })
                        
                );
                timeline.setCycleCount(Animation.INDEFINITE);
                // Set the interpolator to LINEAR for smoother animation
                timeline.play();
            }
        });

        root.getChildren().addAll(nameLabel, randomiseButton);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}