package hotel;


import tiny.types.Fares;

import java.util.ArrayList;
import java.util.List;

public class HotelList implements HotelResource {

    @Override
    public List<Hotel> getAll() {
        List<Hotel> hotels = new ArrayList<>();

        Hotel Lakewood = new Hotel("Lakewood", 3,
                new Fares(110, 90), new Fares(80, 80));

        Hotel Bridgewood = new Hotel("Bridgewood", 4,
                new Fares(160, 60), new Fares(110, 50));

        Hotel Ridgewood = new Hotel("Ridgewood", 5,
                new Fares(220, 150), new Fares(100, 40));


        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);

        return hotels;
    }

}
