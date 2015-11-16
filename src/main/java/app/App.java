package app;



import parse.SearchCheapestHotel;
import read.archive.ReadInputInformation;

public class App {


    public static void main(String[] args) {

        ReadInputInformation readInputInformation = new ReadInputInformation();
        SearchCheapestHotel searchCheapestHotel = new SearchCheapestHotel();
        searchCheapestHotel.searchHotel(readInputInformation.readFileReservation());

    }

}
