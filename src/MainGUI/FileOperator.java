package MainGUI;

import java.io.*;

/**
 * FileOperator.java
 *
 * @author Isaac Hutchinson
 * @version 0.0.1
 */
public class FileOperator {
    private String fileData;
    private String[] words;
    private char[] letters;
    private StringBuffer original;
    private StringBuffer stringBuffer;
    private File file;


    /**
     * The FileOperator method is the constructor for the FileOperator class
     */
    public FileOperator() {
        original = new StringBuffer();
        stringBuffer = new StringBuffer();
        file = new File("results.txt");
    }

    /**
     * The fileOperate method reads in the file data and processes out the not letter characters.
     *
     * @param fileLocation an absolute file path.
     */
    public void fileOperate(String fileLocation) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {

            String hold;

            while ((hold = br.readLine()) != null) {
                System.out.println(hold);
                original.append(hold + "\n");
            }

            this.setFileData(this.stringScalpel(original.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * The writeOutput method writes the thread results to a file as they complete.
     *
     * @param threadOut The thread results to be written to a file.
     */
    public void writeOutput(String threadOut) {
        try {


            if (!(file.exists())) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsolutePath(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(threadOut + "\n");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (Exception e) {

        }
    }

    /**
     * The wordCount method splits the processed fileData and stores it into a array.
     * Once the array is populated is the length is found and returned.
     *
     * @return length of the words array.
     */
    public int wordCount() {
        words = fileData.split("\\s+");
        return words.length;


    }

    private String stringScalpel(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLetter(ch)) {
                stringBuffer.append(ch);
            } else {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    /**
     * The letterCount method trims the fileData and then converts it to a char Array.
     * After the creation of the array the length of the letter array is found and returned.
     *
     * @return the length of the letters array
     */
    public int letterCount() {
        String fileDataTrimmed = fileData.replaceAll("[^a-zA-Z]", "").trim();
        letters = fileDataTrimmed.toCharArray();

        return letters.length;
    }

    /**
     * The getFileData method is a getter method that returns the value of fileData
     *
     * @return the current fileData.
     */
    public String getFileData() {
        return fileData;
    }

    /**
     * The setFileData method is a setter method that sets the value of fileData to a
     * new value.
     *
     * @param fileData the new file data.
     */
    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    /**
     * The getOriginal method is a getter method that returns the original file data.
     *
     * @return The original file data.
     */
    public String getOriginal() {
        return original.toString();
    }


}
