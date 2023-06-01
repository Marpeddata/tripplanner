package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "trip_name")
    private String name;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "location")
    private String location;
    @Column(name = "duration")
    private String duration;
    @Column(name = "PackingList")
    private String PackingList;

    @ManyToMany(mappedBy = "trips")
    private List<User> users;

    @ManyToOne
    @JoinColumn(name = "guide_id", referencedColumnName = "id")
    private Guide guide;

    public Trip() {
    }

    public Trip(String name, String date, String time, String location, String duration, String packingList) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.duration = duration;
        PackingList = packingList;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPackingList() {
        return PackingList;
    }

    public void setPackingList(String packingList) {
        PackingList = packingList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public Guide getGuide() {
        return guide;
    }

    public void addGuide(Guide guide) {
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'' +
                ", PackingList='" + PackingList + '\'' +
                ", users=" + users +
                ", guide=" + guide +
                '}';
    }
}
