package designpattern.structure.facade;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie();
    }
}
