package dtos;

import entities.Trip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TripDTO {
    private Long tripId;
    private String tripName;
    private String tripDate;
    private String tripTime;
    private String tripLocation;
    private String tripDuration;
    private String tripPackingList;
    private List<UserDTO> users = new ArrayList<>();
    private String guide;

    public TripDTO() {
    }

    public TripDTO(Trip trip){
        this.tripId = trip.getId();
        this.tripName = trip.getName();
        this.tripDate = trip.getDate();
        this.tripTime = trip.getTime();
        this.tripLocation = trip.getLocation();
        this.tripDuration = trip.getDuration();
        this.tripPackingList = trip.getPackingList();
        this.guide = trip.getGuide().getName();
        if(trip.getUsers()!= null){
            this.users = trip.getUsers().stream().map(u -> new UserDTO(u)).collect(Collectors.toList());
        }
    }

    public static List<TripDTO> getDtos(List<Trip> trips){
        return trips.stream().map(t -> new TripDTO(t)).collect(Collectors.toList());
    }

    public Long getTripId() {
        return tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public String getTripDate() {
        return tripDate;
    }

    public String getTripTime() {
        return tripTime;
    }

    public String getTripLocation() {
        return tripLocation;
    }

    public String getTripDuration() {
        return tripDuration;
    }

    public String getTripPackingList() {
        return tripPackingList;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public String getGuide() {
        return guide;
    }


}
