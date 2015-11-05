package read.archive;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    private String END_FILE = "src/main/java/file/file.txt";
    private String inPutReservation;
    private String clientType;
    List<String> days = new ArrayList<>();


    public void readFileReservation() {


      try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(END_FILE));
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                line = line.trim();
                stringBuilder.append(line);
                line = bufferedReader.readLine();

            }
            inPutReservation = stringBuilder.toString();

          bufferedReader.close();
          reservationInputClient();
          reservationInputDates();



        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("Error  I/O");
        }

   }


    private void reservationInputClient(){
        this.clientType = inPutReservation.substring(0, 7);

     }

    private void reservationInputDates(){
        String inputReservation = inPutReservation;

        for (int i = 0; i < inputReservation.length() - 1; i++) {

            int indexIn = inputReservation.indexOf("(");
            int indexOut = inputReservation.indexOf(")");

            String day = inputReservation.substring(indexIn + 1, indexOut);
            inputReservation = inputReservation.substring(indexOut + 1);

            days.add(day);

        }

    }

    public String getClientType() {
        return clientType;
    }

    public List<String> getDays() {
        return days;
    }
}
