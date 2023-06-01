package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "guides")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String Gender;
    @Column(name = "birth_year")
    private int birthYear;
    @Column(name = "profile")
    private String profile;
    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "guide")
    private List<Trip> trips = new ArrayList<>();


    public Guide() {
    }

    public Guide(String name, String gender, int birthYear, String profile, String imageUrl) {
        this.name = name;
        Gender = gender;
        this.birthYear = birthYear;
        this.profile = profile;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
        trip.addGuide(this);
    }

    @Override
    public String toString() {
        return "Guide{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", birthYear=" + birthYear +
                ", profile='" + profile + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", trips=" + trips +
                '}';
    }
}
