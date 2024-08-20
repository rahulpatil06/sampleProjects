package FlipFit.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WorkOutVariation {
    private List<String> workOutTypes;
    private HashMap<String,Integer> seatsAvailable;
    private HashMap<String,HashMap<String,Integer>> slots;

    public List<String> getWorkOutTypes() {
        return workOutTypes;
    }

    public void setWorkOutTypes(List<String> workOutTypes) {
        this.workOutTypes = workOutTypes;
    }

    public HashMap<String, Integer> getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(HashMap<String, Integer> seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public HashMap<String, HashMap<String, Integer>> getSlots() {
        return slots;
    }

    public void setSlots(HashMap<String, HashMap<String, Integer>> slots) {
        this.slots = slots;
    }
}
