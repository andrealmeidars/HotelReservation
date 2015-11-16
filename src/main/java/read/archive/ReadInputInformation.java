package read.archive;


import txt.endress.TxtEndressFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadInputInformation {
    private TxtEndressFile endressFile = new TxtEndressFile();
    private List<String> inputArray = new ArrayList<>();


    public List<String> readFileReservation() {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(endressFile.getEndress()));
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                this.inputArray.add(line);

            }

            bufferedReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("Error  I/O");
        }

        return inputArray;
    }


}
