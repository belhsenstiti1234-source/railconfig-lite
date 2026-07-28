package de.belhassen.railconfig;

public class Station {

    private final String name;
    private final String city;

    public Station(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + " (" + city + ")";
    }
}
