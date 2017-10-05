package MainGUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

/**
 * PrimaryWindow.java
 *
 * @author Isaac Hutchinson
 * @version 0.0.1
 */

public class PrimaryWindow extends Application {
    private final String DEFAULT_TEXT = "Enter File Location.....";
    private Label labelOne;
    private Label labelTwo;
    private Label labelThree;
    private Label labelFour;
    private Label labelFive;
    private Label labelSix;
    private Label labelSeven;
    private Label labelEight;
    private Label labelNine;
    private Label labelTen;
    private TextField fieldOne;
    private TextField fieldTwo;
    private TextField fieldThree;
    private TextField fieldFour;
    private TextField fieldFive;
    private TextField fieldSix;
    private TextField fieldSeven;
    private TextField fieldEight;
    private TextField fieldNine;
    private TextField fieldTen;
    private Button analyze;
    private Button fileOneChoose;
    private Button fileTwoChoose;
    private Button fileThreeChoose;
    private Button fileFourChoose;
    private Button fileFiveChoose;
    private Button fileSixChoose;
    private Button fileSevenChoose;
    private Button fileEightChoose;
    private Button fileNineChoose;
    private Button fileTenChoose;
    private GridPane gridPane;
    private FileOperator operator;
    private FileChooser fileChooser;
    private Thread threadOne;
    private Thread threadTwo;
    private Thread threadThree;
    private Thread threadFour;
    private Thread threadFive;
    private Thread threadSix;
    private Thread threadSeven;
    private Thread threadEight;
    private Thread threadNine;
    private Thread threadTen;


    /**
     * The PrimaryWindow method is the constructor for the PrimaryWindow class
     */
    public PrimaryWindow() {
        labelOne = new Label("File Input One:");
        labelTwo = new Label("File Input Two:");
        labelThree = new Label("File Input Three:");
        labelFour = new Label("File Input Four:");
        labelFive = new Label("File Input Five:");
        labelSix = new Label("File Input Six:");
        labelSeven = new Label("File Input Seven:");
        labelEight = new Label("File Input Eight:");
        labelNine = new Label("File Input Nine:");
        labelTen = new Label("File Input Ten:");
        fieldOne = new TextField("Enter File Location.....");
        fieldTwo = new TextField("Enter File Location.....");
        fieldThree = new TextField("Enter File Location.....");
        fieldFour = new TextField("Enter File Location.....");
        fieldFive = new TextField("Enter File Location.....");
        fieldSix = new TextField("Enter File Location.....");
        fieldSeven = new TextField("Enter File Location.....");
        fieldEight = new TextField("Enter File Location.....");
        fieldNine = new TextField("Enter File Location.....");
        fieldTen = new TextField("Enter File Location.....");
        analyze = new Button("Analyze Files");
        fileOneChoose = new Button("Choose File");
        fileTwoChoose = new Button("Choose File");
        fileThreeChoose = new Button("Choose File");
        fileFourChoose = new Button("Choose File");
        fileFiveChoose = new Button("Choose File");
        fileSixChoose = new Button("Choose File");
        fileSevenChoose = new Button("Choose File");
        fileEightChoose = new Button("Choose File");
        fileNineChoose = new Button("Choose File");
        fileTenChoose = new Button("Choose File");
        gridPane = new GridPane();
        operator = new FileOperator();
        fileChooser = new FileChooser();
        threadTwo = new Thread();
        threadThree = new Thread();
        threadFour = new Thread();
        threadFive = new Thread();
        threadSix = new Thread();
        threadSeven = new Thread();
        threadEight = new Thread();
        threadNine = new Thread();
        threadTen = new Thread();


    }

    /**
     * The Start method builds the main window for the application.
     *
     * @param primaryStage The Main Stage of the application.
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("File Word Letter Counter");

        gridPane.setGridLinesVisible(false);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setVgap(10);
        gridPane.setHgap(5);
        this.gridLayout();

        gridPane.getChildren().addAll(labelOne, fieldOne, labelTwo, fieldTwo, labelThree, fieldThree, labelFour, fieldFour,
                labelFive, fieldFive, labelSix, fieldSix, labelSeven, fieldSeven, labelEight, fieldEight, labelNine,
                fieldNine, labelTen, fieldTen, analyze, fileOneChoose, fileTwoChoose, fileThreeChoose, fileFourChoose,
                fileFiveChoose, fileSixChoose, fileSevenChoose, fileEightChoose, fileNineChoose, fileTenChoose);

        this.analyzeButton();
        this.fileChooseButtons();
        primaryStage.setOnHidden(event -> Platform.exit());
        primaryStage.setScene(new Scene(gridPane, 570, 500));
        primaryStage.show();
    }

    // Constructs the girdpane for the application
    private void gridLayout() {
        gridPane.setConstraints(labelOne, 0, 0);
        gridPane.setConstraints(fieldOne, 1, 0);
        gridPane.setColumnSpan(fieldOne, 70);
        gridPane.setConstraints(labelTwo, 0, 1);
        gridPane.setConstraints(fieldTwo, 1, 1);
        gridPane.setColumnSpan(fieldTwo, 70);
        gridPane.setConstraints(labelThree, 0, 2);
        gridPane.setConstraints(fieldThree, 1, 2);
        gridPane.setColumnSpan(fieldThree, 70);
        gridPane.setConstraints(labelFour, 0, 3);
        gridPane.setConstraints(fieldFour, 1, 3);
        gridPane.setColumnSpan(fieldFour, 70);
        gridPane.setConstraints(labelFive, 0, 4);
        gridPane.setConstraints(fieldFive, 1, 4);
        gridPane.setColumnSpan(fieldFive, 70);
        gridPane.setConstraints(labelSix, 0, 5);
        gridPane.setConstraints(fieldSix, 1, 5);
        gridPane.setColumnSpan(fieldSix, 70);
        gridPane.setConstraints(labelSeven, 0, 6);
        gridPane.setConstraints(fieldSeven, 1, 6);
        gridPane.setColumnSpan(fieldSeven, 70);
        gridPane.setConstraints(labelEight, 0, 7);
        gridPane.setConstraints(fieldEight, 1, 7);
        gridPane.setColumnSpan(fieldEight, 70);
        gridPane.setConstraints(labelNine, 0, 8);
        gridPane.setConstraints(fieldNine, 1, 8);
        gridPane.setColumnSpan(fieldNine, 70);
        gridPane.setConstraints(labelTen, 0, 9);
        gridPane.setConstraints(fieldTen, 1, 9);
        gridPane.setColumnSpan(fieldTen, 70);
        gridPane.setConstraints(analyze, 20, 10);
        gridPane.setColumnSpan(analyze, 40);
        gridPane.setConstraints(fileOneChoose, 73, 0);
        gridPane.setConstraints(fileTwoChoose, 73, 1);
        gridPane.setConstraints(fileThreeChoose, 73, 2);
        gridPane.setConstraints(fileFourChoose, 73, 3);
        gridPane.setConstraints(fileFiveChoose, 73, 4);
        gridPane.setConstraints(fileSixChoose, 73, 5);
        gridPane.setConstraints(fileSevenChoose, 73, 6);
        gridPane.setConstraints(fileEightChoose, 73, 7);
        gridPane.setConstraints(fileNineChoose, 73, 8);
        gridPane.setConstraints(fileTenChoose, 73, 9);
    }

    // The analyzeButton helper method helps clean up the code.
    private void analyzeButton() {
        analyze.setOnAction(event -> {
            if ((fieldOne.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldOne.getText()).exists()) {
                threadOne = new Thread(new ThreadProcessing(fieldOne.getText(), "Thread One:"));
                threadOne.start();

            } else {
                fieldOne.setText("Bad File Path!");
            }
            if ((fieldTwo.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldTwo.getText()).exists()) {
                threadTwo = new Thread(new ThreadProcessing(fieldTwo.getText(), "Thread Two:"));
                threadTwo.start();
            } else {
                fieldTwo.setText("Bad File Path!");
            }
            if ((fieldThree.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldThree.getText()).exists()) {
                threadThree = new Thread(new ThreadProcessing(fieldThree.getText(), "Thread Three:"));
                threadThree.start();
            } else {
                fieldThree.setText("Bad File Path!");
            }
            if ((fieldFour.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldFour.getText()).exists()) {
                threadFour = new Thread(new ThreadProcessing(fieldFour.getText(), "Thread Four:"));
                threadFour.start();
            } else {
                fieldFour.setText("Bad File Path!");
            }
            if ((fieldFive.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldFive.getText()).exists()) {
                threadFive = new Thread(new ThreadProcessing(fieldFive.getText(), "Thread Five:"));
                threadFive.start();
            } else {
                fieldFive.setText("Bad File Path!");
            }
            if ((fieldSix.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldSix.getText()).exists()) {
                threadSix = new Thread(new ThreadProcessing(fieldSix.getText(), "Thread Six:"));
                threadSix.start();
            } else {
                fieldSix.setText("Bad File Path!");
            }
            if ((fieldSeven.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldSeven.getText()).exists()) {
                threadSeven = new Thread(new ThreadProcessing(fieldSeven.getText(), "Thread Seven:"));
                threadSeven.start();
            } else {
                fieldSeven.setText("Bad File Path!");
            }
            if ((fieldEight.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldEight.getText()).exists()) {
                threadEight = new Thread(new ThreadProcessing(fieldEight.getText(), "Thread Eight:"));
                threadEight.start();
            } else {
                fieldEight.setText("Bad File Path!");
            }
            if ((fieldNine.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldNine.getText()).exists()) {
                threadNine = new Thread(new ThreadProcessing(fieldNine.getText(), "Thread Nine:"));
                threadNine.start();
            } else {
                fieldNine.setText("Bad File Path!");
            }
            if ((fieldTen.getText().compareTo(DEFAULT_TEXT) != 0) && new File(fieldTen.getText()).exists()) {
                threadTen = new Thread(new ThreadProcessing(fieldTen.getText(), "Thread Ten:"));
                threadTen.start();
            } else {
                fieldTen.setText("Bad File Path!");
            }
        });

    }


    //fileChooseButtons helps clean up the code
    protected void fileChooseButtons() throws Exception {
        try {
            fileOneChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldOne.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldOne.setText("Enter File Location.....");
                }
            });
            fileTwoChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldTwo.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldTwo.setText("Enter File Location.....");
                }
            });
            fileThreeChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldThree.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldThree.setText("Enter File Location.....");
                }
            });
            fileFourChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldFour.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldFour.setText("Enter File Location.....");
                }
            });
            fileFiveChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldFive.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldFive.setText("Enter File Location.....");
                }
            });
            fileSixChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldSix.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldSix.setText("Enter File Location.....");
                }
            });
            fileSevenChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldSeven.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldSeven.setText("Enter File Location.....");
                }
            });
            fileEightChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldEight.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldEight.setText("Enter File Location.....");
                }
            });
            fileNineChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldNine.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldNine.setText("Enter File Location.....");
                }
            });
            fileTenChoose.setOnAction(event -> {
                File selectedFile = fileChooser.showOpenDialog(null);
                if (selectedFile != null) {
                    fieldTen.setText(selectedFile.getAbsolutePath());
                } else {
                    fieldTen.setText("Enter File Location.....");
                }
            });
        } catch (Exception e) {


        }

    }
}
