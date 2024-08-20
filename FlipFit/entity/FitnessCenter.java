package FlipFit.entity;

import java.util.HashMap;
import java.util.List;

public class FitnessCenter {
    private List<String> CityName;
    private HashMap<String, List<String>> centerName;


    public List<String> getCityName() {
        return CityName;
    }

    public void setCityName(List<String> cityName) {
        CityName = cityName;
    }

    public HashMap<String, List<String>> getCenterName() {
        return centerName;
    }

    public void setCenterName(HashMap<String, List<String>> centerName) {
        this.centerName = centerName;
    }
}
