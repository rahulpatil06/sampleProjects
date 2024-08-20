package FlipFit.entity;

public class User {
    private String UserName;
    private Long MobileNo;
    private String WorkoutType;
    private String city;
    private String Area;

    public User() {

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        MobileNo = mobileNo;
    }

    public String getWorkoutType() {
        return WorkoutType;
    }

    public void setWorkoutType(String workoutType) {
        WorkoutType = workoutType;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return city;
    }

    public User(String userName, Long mobileNo, String workoutType, String city, String area) {
        UserName = userName;
        MobileNo = mobileNo;
        WorkoutType = workoutType;
        this.city = city;
        Area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
