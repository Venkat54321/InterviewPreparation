import java.util.List;

import java.util.*;
import java.util.stream.Collectors;


public class Program
{
    private String driverId;
    private boolean ignition;
    private int triggerTime;



    // Getter
    public String getDriverId() {
        return driverId;
    }



    // Setter
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }



    // Getter
    public boolean getIgnition() {
        return ignition;
    }



    // Setter
    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }



    // Getter
    public int getTriggerTime() {
        return triggerTime;
    }



    // Setter
    public void setTriggerTime(int triggerTime) {
        this.triggerTime = triggerTime;
    }





    //constructor
    public Program(String driverId, boolean ignition, int triggerTime) {
        this.driverId = driverId;
        this.ignition = ignition;
        this.triggerTime = triggerTime;
    }

    public Program(){

    }



    public static void main(String[] args) {
        System.out.println("HEllo");
        Program p1 = new Program("d1", true, 120);

        Program p2 = new Program();
       // p2.setDriverId(p1.getDriverId());
        p2.setIgnition(!(p1.getIgnition()));
        p2.setTriggerTime(p1.getTriggerTime()+1);

        System.out.println(p1.getDriverId() +" "+p1.getIgnition() + " "+ p1.getTriggerTime() +
                " " + p2.getIgnition() +" "+p2.getTriggerTime());

        Program p3 = new Program("d2", true, 130);

        Program p4 = new Program();
        p4.setIgnition(!(p3.getIgnition()));
        p4.setTriggerTime(p3.getTriggerTime()+1);

        Program p5 = new Program("d3", true, 140);

        Program p6 = new Program();
        p6.setIgnition(!(p5.getIgnition()));
        p6.setTriggerTime(p5.getTriggerTime()+1);




        System.out.println(p6.getIgnition());
        System.out.println(p4.getDriverId());
        System.out.println(p2.getTriggerTime());



        System.out.println("==============");



        List<Program> pgmList = new ArrayList<>();
        pgmList.add(p4);
        pgmList.add(p5);
        pgmList.add(p6);
        pgmList.add(p1);
        pgmList.add(p2);
        pgmList.add(p3);

        pgmList.sort(Comparator.comparing(p -> p.getTriggerTime()));

        System.out.println("Venkat");

        pgmList.forEach(p -> System.out.println(p.getTriggerTime()));

      Program filterP1 =  pgmList.stream()
                .filter(p -> p.getTriggerTime() == 120)
              .findFirst().get();
        Program filterP2 =  pgmList.stream()
                .filter(p -> p.getTriggerTime() == 121)
                .findFirst().get();

      StringBuilder sb  = new StringBuilder();
      sb.append(filterP1.getDriverId() != null ?filterP1.getDriverId():" ").append(" ").append(filterP1.getIgnition()== true?"ON":"OFF")
              .append(" ").append(filterP1.getTriggerTime()).append(" ")
              .append(filterP2.getDriverId() == null ? "OFF":"ON").append(" ").append(filterP2.getTriggerTime());
        System.out.println(sb);
    }
}
