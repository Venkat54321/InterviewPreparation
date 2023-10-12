package lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<String, List<Movie>> cityWiseMovies;
    List<Movie> movieList;

    public MovieController(){
        cityWiseMovies = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public void addCityWiseMovies(String city,String movie){

    }

    public String getMovies(String city){
        return "";
    }
}
