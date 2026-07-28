package de.belhassen.railconfig;

public class Main {

    public static void main(String[] args) {
        Station station = new Station(
                "Hannover Hbf",
                "Hannover"
        );

        System.out.println("RailConfig Lite gestartet");
        System.out.println("Station: " + station);
    }
}