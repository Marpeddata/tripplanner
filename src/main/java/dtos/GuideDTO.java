package dtos;

import entities.Guide;

import java.util.List;
import java.util.stream.Collectors;

public class GuideDTO {
    private Long guideId;
    private String guideName;
    private String guideGender;
    private int guideBirthYear;
    private String guideProfile;
    private String guideImgUrl;

    private List<TripDTO> trips;

    public GuideDTO(Guide guide) {
        this.guideId = guide.getId();
        this.guideName = guide.getName();
        this.guideGender = guide.getGender();
        this.guideBirthYear = guide.getBirthYear();
        this.guideProfile = guide.getProfile();
        this.guideImgUrl = guide.getImageUrl();
        if(guide.getTrips()!= null) {
            this.trips = guide.getTrips().stream().map(trip -> new TripDTO(trip)).collect(Collectors.toList());
        }
    }

    public static List<GuideDTO> getDtos(List<Guide> guides) {
        return guides.stream().map(GuideDTO::new).collect(Collectors.toList());
    }

    public String getGuideName() {
        return guideName;
    }

    public String getGuideGender() {
        return guideGender;
    }

    public int getGuideBirthYear() {
        return guideBirthYear;
    }

    public String getGuideProfile() {
        return guideProfile;
    }

    public String getGuideImgUrl() {
        return guideImgUrl;
    }

    public List<TripDTO> getTrips() {
        return trips;
    }
}
