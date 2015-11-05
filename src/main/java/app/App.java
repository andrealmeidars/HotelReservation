package app;


import calculate.daily.HostingHotelCalculate;
import client.type.ClientType;
import printer.Printer;
import read.archive.ReadFile;
import java.util.List;

public class App {



    public static void main(String[] args) {


        HostingHotelCalculate hostingHotelCalculate = new HostingHotelCalculate();
        ReadFile readFile = new ReadFile();
        ClientType customer = new ClientType();


        readFile.readFileReservation();
        String client = readFile.getClientType();
        List<String> days = readFile.getDays();

        customer.insertTypeClient(client);


        Printer print = new Printer();

        String hotelName = hostingHotelCalculate.calculateHotels(customer.returnCustomer(), days);
        print.printer(hotelName);














    }

}
