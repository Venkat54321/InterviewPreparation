package designpattern.structure.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;

    private Projector projector;

    public HomeTheaterFacade(){
        amplifier = new Amplifier();
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
    }

    public void watchMovie(){
        amplifier.on();;
        dvdPlayer.on();
        projector.on();
        projector.input();

        amplifier.off();
    }
}
