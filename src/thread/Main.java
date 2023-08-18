package thread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // get available seats each category


    }

    public List<Seat> getAvailableGoldSeats(){
        // all
        List<Seat> allSeatList = Arrays.asList(new Seat(1,"Booked","gold"));
        // gold
        List<Seat> goldSeats = allSeatList.stream()
                .filter(s -> s.getCategory().endsWith("Gold"))
                .filter(s -> s.getStatus().endsWith("Free"))
                .collect(Collectors.toList());

        return goldSeats;
    }

    public List<Seat> searchSeat(String category){
        // all
        List<Seat> allSeatList = Arrays.asList(new Seat(1,"Booked","gold"));
        // seats as per category
        List<Seat> categoryWiseSeats = allSeatList.stream()
                .filter(s -> s.getCategory().endsWith(category))
                .collect(Collectors.toList());
        return categoryWiseSeats;
    }

}
