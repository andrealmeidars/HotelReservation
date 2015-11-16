package parse;


import calculate.daily.HostingHotelCalculate;
import client.type.ClientType;
import printer.Printer;


import java.util.ArrayList;
import java.util.List;

public class SearchCheapestHotel {
    private HostingHotelCalculate hostingHotelCalculate = new HostingHotelCalculate();
    private List<String> days = new ArrayList<>();
    private Printer print = new Printer();



    public void searchHotel(List<String> arrayOfInput){

        for (int i = 0; i < arrayOfInput.size() - 1; i++){

            String inputArrayAtIndex = arrayOfInput.get(i);

            ClientType clientType = getClientTypeFromInput(inputArrayAtIndex);
            List<String> requestedDays = getDatesFromInput(inputArrayAtIndex);

            print.printer(hostingHotelCalculate.findCheapestHotelToClient(clientType, requestedDays));
            removeAllDatesForArray();


       }

    }


    private ClientType getClientTypeFromInput(String inputArrayAtIndex) {

            int indexOut = inputArrayAtIndex.indexOf(":");
            String clientInput = inputArrayAtIndex.substring(0, indexOut);

            return  ClientType.getByType(clientInput);
    }


    private List<String> getDatesFromInput(String inputArrayAtIndex) {

            for (int i = 0; i < inputArrayAtIndex.length() - 1; i++) {

                int indexIn = inputArrayAtIndex.indexOf("(");
                int indexOut = inputArrayAtIndex.indexOf(")");

                String day = inputArrayAtIndex.substring(indexIn + 1, indexOut);
                inputArrayAtIndex = inputArrayAtIndex.substring(indexOut + 1);

                days.add(day);

            }
     return days;

    }


    private void removeAllDatesForArray(){
        this.days.clear();
    }


}




