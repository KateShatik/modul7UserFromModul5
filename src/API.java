import java.util.List;

/**
 * Created by Катя on 10.12.2016.
 */
public interface API {
    public List<Room> findRooms(int price, int persons, String city, String hotel);
    public List<Room>  findRooms() ;

}
