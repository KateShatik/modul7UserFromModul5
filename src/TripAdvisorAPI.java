import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Катя on 10.12.2016.
 */
public class TripAdvisorAPI implements API {

    List <Room> rooms= new ArrayList<>();
    public TripAdvisorAPI() {
        Date date1 = new Date (11,11,11);
        Date date2 = new Date (13,11,11);
        Date date3 = new Date (10,11,11);
        Date date4 = new Date (9,11,11);

        rooms.add(new Room(105,124,2,date4,"LuxuryLife","Chicago"));
        rooms.add(new Room(106,130,2,date1,"KingsHome","LA"));
        rooms.add(new Room(108,140,3,date3,"LittlePonny","Boston"));
        rooms.add(new Room(109,135,3,date3,"DukeHotel","Orlando"));
        rooms.add(new Room(110,120,2,date4,"BigAppleSuit","NewYork"));

    }
    @Override
    public List<Room> findRooms() {
        return  rooms;
    }//get all rooms
    @Override
    public  List<Room> findRooms(int price, int persons, String city, String hotel) {

        List<Room> roomRequested = new ArrayList<>();

        for (Room r: findRooms()) {

            if (r.getPrice() == price
                    && r.getPersons() == persons
                    && r.getCityName().equals(city)
                    ) {
                roomRequested.add(r);

            }
        }

        return roomRequested;

    }
}
