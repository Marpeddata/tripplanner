package dtos;

import entities.User;
import entities.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {
    private String username;
    private String address;
    private int phoneNumber;
    private String email;
    private int birthYear;
    private String gender;
    private List<String> trips;

    public UserDTO(User u) {
        this.username = u.getUserName();
        this.address = u.getAddress();
        this.phoneNumber = u.getPhoneNumber();
        this.email = u.getEmail();
        this.birthYear = u.getBirthYear();
        this.gender = u.getGender();

        if(u.getTrips()!= null) {
            this.trips = u.getTrips().stream().map(t -> t.getName()).collect(Collectors.toList());
        }



    }

    public static List<UserDTO> getDtos(List<User> Users) {
        return Users.stream().map(p -> new UserDTO(p)).collect(Collectors.toList());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getTrips() {
        return trips;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", birthYear=" + birthYear +
                ", gender='" + gender + '\'' +
                '}';
    }
}
