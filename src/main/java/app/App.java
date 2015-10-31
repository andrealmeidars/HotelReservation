package app;


import calculate.daily.HostingHotelCalculate;
import client.type.ClientType;
import days.Days;
import printer.Printer;

public class App {



    public static void main(String[] args) {

        ClientType clientType = new ClientType();
        Days days = new Days();
        HostingHotelCalculate hostingHotelCalculate = new HostingHotelCalculate();
        Printer print = new Printer();

        String clientChoose = clientType.returnTypeClient();


        String dayChoose1 = days.returnDayHosting();
        String dayChoose2 = days.returnDayHosting();
        String dayChoose3 = days.returnDayHosting();

        String[] daysChoose = {dayChoose1,dayChoose2,dayChoose3};

        String hotelName = hostingHotelCalculate.calculateHotels(clientChoose, daysChoose);

        print.printer(hotelName);














    }

}
