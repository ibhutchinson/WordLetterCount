package MainGUI;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * ThreadProcessing.java
 *
 * @author Isaac Hutchinson
 * @version 0.0.1
 */
public class ThreadProcessing implements Runnable {
    private final int MAX_CONTENT = 3353786;
    private String threadName;
    private String fileName;
    private FileOperator operator;
    private String threadOut;
    private Label words;
    private Label letters;
    private TextField wordsCount;
    private TextField letterCount;
    private TextArea fileData;
    private int numberOfLetters;


    /**
     * The method ThreadProcessing is the constructor for the ThreadProcessing class
     *
     * @param fileName   The absolute file path of a file.
     * @param threadName The name of the thread.
     */
    public ThreadProcessing(String fileName, String threadName) {
        this.threadName = threadName;
        this.fileName = fileName;
        this.operator = new FileOperator();
        words = new Label("Number of Words:");
        letters = new Label("Number of Letters:");
        fileData = new TextArea("");
        fileData.setEditable(false);
        wordsCount = new TextField("");
        wordsCount.setEditable(false);
        letterCount = new TextField("");
        letterCount.setEditable(false);

        this.display(threadName);
    }

    /**
     * The display method builds the thread GUI window
     *
     * @param _windowName The name of the thread running that window.
     */
    public void display(String _windowName) {
        Stage window = new Stage();
        GridPane layout = new GridPane();
        layout.setVgap(5);
        layout.setHgap(5);
        layout.setConstraints(words, 0, 0);
        layout.setConstraints(letters, 0, 1);
        layout.setConstraints(wordsCount, 1, 0);
        layout.setConstraints(letterCount, 1, 1);
        layout.setConstraints(fileData, 0, 2);
        layout.setColumnSpan(fileData, 2);
        layout.getChildren().addAll(words, letters, wordsCount, letterCount, fileData);
        Scene scene = new Scene(layout, 538, 268);
        window.setTitle(_windowName);
        window.setScene(scene);
        window.show();
    }

    /**
     * The run method runs the contained content in the calling thread.
     */
    @Override
    public void run() {

        operator.fileOperate(fileName);
        wordsCount.setText(String.valueOf(operator.wordCount()));
        numberOfLetters = operator.letterCount();
        letterCount.setText(String.valueOf(numberOfLetters));
        if (numberOfLetters <= MAX_CONTENT) {
            fileData.setText(operator.getOriginal());
        } else {
            fileData.setText("File Data is to large..... Solution coming soon.");
        }
        operator.writeOutput(new String(threadName + " the file " + "\"" + fileName + "\"" + " has " + wordsCount.getText() + " words and " +
                letterCount.getText() + " letters"));

    }


}
