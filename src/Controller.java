import java.util.ArrayList;
import java.util.List;

/**
 * Created by Катя on 10.12.2016.
 */
public class Controller {
    List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> roomRequested = new ArrayList<>();

        for (API api: apis) {
            for(Room r: api.findRooms(price,persons,city,hotel)){
                roomRequested.add(r);

            }
        }
        return roomRequested;
    }

    List<Room> check(API api1, API api2){

        List<Room> api1room = new ArrayList<>();
        api1room.addAll(api1.findRooms());
        List<Room> api2room = new ArrayList<>();
        api2room.addAll(api2.findRooms());

        List<Room> checked = new ArrayList<>();
        for (Room api1r: api1room) {

            for(Room api2r: api2room) {
                if (api1r.equals(api2r))
                {

                    checked.add(api1r);
                }
            }
        }
        return checked;
    }
}
