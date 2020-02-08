package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main extends Application {

    Button btnStart,btnRestart,btnExit,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    // b1   b2   b3   b4   b5
    // b6   b7   b8   b9   b10
    // b11  b12  b13  b14  b15
    // b16  b17  b18  b19  b20
    // b21  b22  b23  b24  b25
    Boolean stop;
    Boolean shouldStop;
    Random random =new Random();
    int[] randomBombs = new int[12];    //random bomb array
    int[] randomDisable = new int[3];   //random disable array
    String stylesDisable =   "-fx-background-color: #1C0A09 ;" +
            "-fx-border-color: #FDEDEC;" +
            "-fx-background-radius: 5;"
            ;

    @Override
    public void start(Stage stage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Pane root =new Pane();

        Scene scene01 = new Scene(root, 400, 400);
        stage.setScene(scene01);

        stage.setTitle("MP - Products");
        stage.setHeight(400);
        stage.setWidth(400);


        //Start button
        btnStart = new Button();
        btnStart.setText("Start");
        btnStart.setLayoutY(150);
        btnStart.setLayoutX(150);
        btnStart.setMinSize(90,30);

        btnRestart = new Button();
        btnRestart.setText("Back");
        btnRestart.setLayoutY(70);
        btnRestart.setLayoutX(250);
        btnRestart.setMinSize(90,30);

        btnExit = new Button();
        btnExit.setText("Exit");
        btnExit.setLayoutY(110);
        btnExit.setLayoutX(250);
        btnExit.setMinSize(90,30);

        //Game Buttons
        String styles =
                "-fx-background-color: #F1948A ;" +
                        "-fx-border-color: #FDEDEC;" +
                        "-fx-background-radius: 5;"
                ;


        //row 1 buttons
        b1 =new Button();
        b1.setLayoutX(50);
        b1.setLayoutY(30);
        b1.setStyle(styles);

        b2 = new Button();
        b2.setLayoutX(80);
        b2.setLayoutY(30);
        b2.setStyle(styles);

        b3 =new Button();
        b3.setLayoutX(110);
        b3.setLayoutY(30);
        b3.setStyle(styles);

        b4 = new Button();
        b4.setLayoutX(140);
        b4.setLayoutY(30);
        b4.setStyle(styles);

        b5 = new Button();
        b5.setLayoutX(170);
        b5.setLayoutY(30);
        b5.setStyle(styles);

        //row 2 buttons
        b6 =new Button();
        b6.setLayoutX(50);
        b6.setLayoutY(60);
        b6.setStyle(styles);

        b7 = new Button();
        b7.setLayoutX(80);
        b7.setLayoutY(60);
        b7.setStyle(styles);

        b8 =new Button();
        b8.setLayoutX(110);
        b8.setLayoutY(60);
        b8.setStyle(styles);

        b9 = new Button();
        b9.setLayoutX(140);
        b9.setLayoutY(60);
        b9.setStyle(styles);

        b10 = new Button();
        b10.setLayoutX(170);
        b10.setLayoutY(60);
        b10.setStyle(styles);

        //row 3 buttons
        b11 =new Button();
        b11.setLayoutX(50);
        b11.setLayoutY(90);
        b11.setStyle(styles);

        b12 = new Button();
        b12.setLayoutX(80);
        b12.setLayoutY(90);
        b12.setStyle(styles);

        b13 =new Button();
        b13.setLayoutX(110);
        b13.setLayoutY(90);
        b13.setStyle(styles);

        b14 = new Button();
        b14.setLayoutX(140);
        b14.setLayoutY(90);
        b14.setStyle(styles);

        b15 = new Button();
        b15.setLayoutX(170);
        b15.setLayoutY(90);
        b15.setStyle(styles);

        //row 4 buttons
        b16 =new Button();
        b16.setLayoutX(50);
        b16.setLayoutY(120);
        b16.setStyle(styles);

        b17 = new Button();
        b17.setLayoutX(80);
        b17.setLayoutY(120);
        b17.setStyle(styles);

        b18 =new Button();
        b18.setLayoutX(110);
        b18.setLayoutY(120);
        b18.setStyle(styles);

        b19 = new Button();
        b19.setLayoutX(140);
        b19.setLayoutY(120);
        b19.setStyle(styles);

        b20 = new Button();
        b20.setLayoutX(170);
        b20.setLayoutY(120);
        b20.setStyle(styles);

        //row 5 buttons
        b21 =new Button();
        b21.setLayoutX(50);
        b21.setLayoutY(150);
        b21.setStyle(styles);

        b22 = new Button();
        b22.setLayoutX(80);
        b22.setLayoutY(150);
        b22.setStyle(styles);

        b23 =new Button();
        b23.setLayoutX(110);
        b23.setLayoutY(150);
        b23.setStyle(styles);

        b24 = new Button();
        b24.setLayoutX(140);
        b24.setLayoutY(150);
        b24.setStyle(styles);

        b25 = new Button();
        b25.setStyle(styles);
        b25.setLayoutX(170);
        b25.setLayoutY(150);

        root.getChildren().addAll(btnStart);

        Pane gameRoot = new Pane();
        gameRoot.getChildren().addAll(btnRestart,btnExit,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25);
        Scene scene02 = new Scene(gameRoot,400,400);

        btnStart.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                stage.setScene(scene02);
                for (int i = 0; i <11; i++) {
                    int randNum = random.nextInt(25);
                    if(randNum>0){
                        randomBombs[i] =randNum;// generate random numbers between 0-25
                    }
                }
                System.out.print("Random bombs "+Arrays.toString(randomBombs));
                btnStart.setDisable(true);
                btnRestart.setDisable(false);
            }
        });

        btnRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setAllButtonNotDisable();
                btnRestart.setDisable(true);
            }
        });

        //b1 button click on action
        b1.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(0);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b1.setDisable(true);
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(1);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b2.setDisable(true);
            }
        });

        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(2);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b3.setDisable(true);
            }
        });

        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(3);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b4.setDisable(true);
            }
        });

        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(4);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b5.setDisable(true);
            }
        });

        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(5);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b6.setDisable(true);
            }
        });

        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(6);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b7.setDisable(true);
            }
        });

        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(7);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }
                b8.setDisable(true);
            }
        });

        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(8);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b9.setDisable(true);
            }
        });

        b10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop= BomBME(9);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b10.setDisable(true);
            }
        });

        b11.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(10);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b11.setDisable(true);
            }
        });

        b12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(11);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b12.setDisable(true);
            }
        });

        b13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(12);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b13.setDisable(true);
                    // b3.setStyle(stylesDisable);

            }
        });

        b14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                generateRandoms();
                shouldStop=BomBME(13);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b14.setDisable(true);
                    // b3.setStyle(stylesDisable);
            }
        });

        b15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(14);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b15.setDisable(true);

            }
        });

        b16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop= BomBME(15);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b16.setDisable(true);
            }
        });

        b17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(16);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b17.setDisable(true);

            }
        });

        b18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(17);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b18.setDisable(true);

            }
        });

        b19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(18);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b19.setDisable(true);
            }
        });

        b20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(19);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b20.setDisable(true);

            }
        });

        b21.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(20);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b21.setDisable(true);
            }
        });

        b22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(21);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b22.setDisable(true);
            }
        });

        b23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(22);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b23.setDisable(true);
            }
        });

        b24.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(23);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }

                b24.setDisable(true);
            }
        });

        b25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                generateRandoms();
                shouldStop=BomBME(24);
                if(shouldStop){
                    setAllButtonNotDisable();
                    stage.setScene(scene01);
                    return;
                }
                b25.setDisable(true);
            }
        });

        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        btnRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setAllButtonNotDisable();
                stage.setScene(scene01);
            }
        });
        stage.show();

    }

    public boolean BomBME(int a){
        for (int element: randomBombs) {
            if (a == element) {
                setAllButtonNotDisable();
                alert();
                System.out.println("Is a bomb button");
                return true;

            } else {
                System.out.println("Not a bomb button");
                buttonClickAction();
                //b1.setDisable(true);

            }
        }
        return false;
    }

    public boolean checkValueIsAvailable(int tocheck){
        boolean check = false;
        for (int element: randomBombs) {
            if(tocheck==element){
                check = true;
                System.out.println(check);
            }else {
                check = false;
                System.out.println(check);
            }
        }
        return check;
    }

    public void setAllButtonNotDisable(){
        btnStart.setDisable(false);b1.setDisable(false);b2.setDisable(false);b3.setDisable(false);b4.setDisable(false);b5.setDisable(false); b6.setDisable(false); b7.setDisable(false); b8.setDisable(false); b9.setDisable(false); b10.setDisable(false); b11.setDisable(false); b12.setDisable(false); b13.setDisable(false); b14.setDisable(false); b15.setDisable(false); b16.setDisable(false); b17.setDisable(false);b18.setDisable(false); b19.setDisable(false); b20.setDisable(false); b21.setDisable(false);  b22.setDisable(false); b25.setDisable(false);
    }

    public void buttonClickAction(){
        System.out.print("Random Disable "+Arrays.toString(randomDisable));
        for (int number:randomDisable) {
            switch (number){
                case 0:
                    b1.setDisable(true);
                  //  b1.setStyle(stylesDisable);
                    break;
                case 1:
                    b2.setDisable(true);
                    //b2.setStyle(stylesDisable);
                    break;
                case 2:
                    b3.setDisable(true);
                    //b3.setStyle(stylesDisable);
                    break;
                case 3:
                    b4.setDisable(true);
                    //b4.setStyle(stylesDisable);
                    break;
                case 4:
                    b5.setDisable(true);
                    //b5.setStyle(stylesDisable);
                    break;
                case 5:
                    b6.setDisable(true);
                    //Fb6.setStyle(stylesDisable);
                    break;
                case 6:
                    b7.setDisable(true);
                  //  b7.setStyle(stylesDisable);
                    break;
                case 7:
                    b8.setDisable(true);
                    //b8.setStyle(stylesDisable);
                    break;
                case 8:
                    b9.setDisable(true);
                    //b9.setStyle(stylesDisable);
                    break;
                case 9:
                    b10.setDisable(true);
                    //b10.setStyle(stylesDisable);
                    break;
                case 10:
                    b11.setDisable(true);
                    //b11.setStyle(stylesDisable);
                    break;
                case 11:
                    b12.setDisable(true);
                    //b12.setStyle(stylesDisable);
                    break;
                case 12:
                    b13.setDisable(true);
                    //b13.setStyle(stylesDisable);
                    break;
                case 13:
                    b14.setDisable(true);
                    //b14.setStyle(stylesDisable);
                    break;
                case 14:
                    b15.setDisable(true);
                    //b15.setStyle(stylesDisable);
                    break;
                case 15:
                    b16.setDisable(true);
                    //b16.setStyle(stylesDisable);
                    break;
                case 16:
                    b17.setDisable(true);
                    //b17.setStyle(stylesDisable);
                    break;
                case 17:
                    b18.setDisable(true);
                    //b18.setStyle(stylesDisable);
                    break;
                case 18:
                    b19.setDisable(true);
                    //b19.setStyle(stylesDisable);
                    break;
                case 19:
                    b22.setDisable(true);
                    //b22.setStyle(stylesDisable);
                    break;
                case 20:
                    b21.setDisable(true);
                    //b21.setStyle(stylesDisable);
                    break;
                case 21:
                    b22.setDisable(true);
                    //b22.setStyle(stylesDisable);
                    break;
                case 22:
                    b23.setDisable(true);
                    //b23.setStyle(stylesDisable);
                    break;
                case 23:
                    b24.setDisable(true);
                    //b24.setStyle(stylesDisable);
                    break;
                case 24:
                    b25.setDisable(true);
                    //b25.setStyle(stylesDisable);
                    break;
            }
        }
    }

    public void alert(){
        System.out.println("Game Over");
        btnStart.setDisable(false);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game - Message");
        alert.setHeaderText(null);
        alert.setContentText("Game Over");
        alert.showAndWait();
        setAllButtonNotDisable();
    }

    public void generateRandoms(){
        for (int i = 0; i <2 ; i++) {
            int randomNumber = random.nextInt(25);
            if(randomNumber>0){
                randomDisable[i] =randomNumber; // generate random numbers between 0-25 to disable at a click
            }

        }
        System.out.print("Random Disable "+Arrays.toString(randomDisable));

        }


    }

