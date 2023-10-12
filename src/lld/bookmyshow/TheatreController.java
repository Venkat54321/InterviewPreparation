package lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    Map<String, List<Theatre>> cityWiseTheatre;
    List<Theatre> theatreList;

    public TheatreController(){
        cityWiseTheatre = new HashMap<>();
        theatreList = new ArrayList<>();
    }

    public void addTheatre(String city,String theater){

    }

    public List<Theatre> getWiseTheater(String city){
        return new ArrayList<>();
    }


}
