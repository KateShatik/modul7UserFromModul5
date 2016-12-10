/**
 * Created by Катя on 10.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println("Room requested  135,3,\"Boston\",\"KingsHouse\"");
        controller.requstRooms(135,3,"Boston","KingsHouse");
        long id1=0;
        for(Room r: controller.requstRooms(135,3,"Boston","KingsHouse") ){
            id1= r.getId();
        }
        System.out.println("Room's id"+" "+id1);

        System.out.println("Room requested  1120,2,\"LA\",\"Paradise\"");
        controller.requstRooms(120,2,"LA","Paradise");
        long id2=0;
        for(Room r: controller.requstRooms(120,2,"LA","Paradise") ){
            id2= r.getId();
        }
        System.out.println("Room's id"+" "+id2);

        System.out.println("Room requested  110,2,\"NewYork\",\"BigAppleSuit\"");
        controller.requstRooms(110,2,"NewYork","BigAppleSuit");
        long id3=0;
        for(Room r: controller.requstRooms(110,2,"NewYork","BigAppleSuit") ){
            id3= r.getId();
        }
        System.out.println("Room's id"+" "+id3);
        API api1=new BookingComAPI();
        API api2=new GoogleAPI();
        API api3=new TripAdvisorAPI();

        System.out.println("Method check,BookingComAPI and GoogleAPI ");
        System.out.println("Number of same rooms:"+" "+controller.check(api1,api2).size());
        System.out.println( controller.check(api1,api2));
        System.out.println("Method check,BookingComAPI and TripAdvisorAPI ");
        System.out.println("Number of same rooms:"+" "+controller.check(api1,api3).size());
        System.out.println( controller.check(api1,api3));
        System.out.println("Method check,GoogleAPI and TripAdvisorAPI ");
        System.out.println("Number of same rooms:"+" "+controller.check(api2,api3).size());
        System.out.println( controller.check(api2,api3));


    }


}
