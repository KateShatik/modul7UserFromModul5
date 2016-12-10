import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Катя on 10.12.2016.
 */
public class BookingComAPI implements API {
   List <Room> rooms= new ArrayList<>();
    public BookingComAPI() {
        Date date1 = new Date (11,11,11);
        Date date2 = new Date (13,11,11);
        Date date3 = new Date (10,11,11);
        Date date4 = new Date (9,11,11);


        rooms.add(new Room(100,120,2,date1,"Paradise","LA"));
        rooms.add(new Room(101,130,2,date2,"LionCastle","SanFrancisco"));
        rooms.add(new Room(102,120,3,date3,"FamilySuits","Chicago"));
        rooms.add(new Room(103,135,3,date4,"KingsHouse","Boston"));
        rooms.add(new Room(104,110,2,date1,"LordsSuits","NewYork"));

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
