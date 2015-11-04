package app;


import read.archive.ReadFile;

import java.util.List;

public class App {



    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.readFileReservation();
        String client = readFile.getClientType();
        List<String> days = readFile.getDays();
        



//        ClientType clientType = new ClientType();
//        Days days = new Days();
//        HostingHotelCalculate hostingHotelCalculate = new HostingHotelCalculate();
//        Printer print = new Printer();
//
//        String clientChoose = clientType.returnTypeClient();
//
//
//        String dayChoose1 = days.returnDayHosting();
//        String dayChoose2 = days.returnDayHosting();
//        String dayChoose3 = days.returnDayHosting();
//
//        String[] daysChoose = {dayChoose1,dayChoose2,dayChoose3};
//
//        String hotelName = hostingHotelCalculate.calculateHotels(clientChoose, daysChoose);
//        print.printer(hotelName);














    }

}
