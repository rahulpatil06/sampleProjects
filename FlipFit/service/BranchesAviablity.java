package FlipFit.service;

import FlipFit.entity.FitnessCenter;
import FlipFit.entity.WorkOutVariation;
import FlipFit.repository.InitializationOfAllData;

import java.util.List;

public class BranchesAviablity {

    public void getAllAvailableBranchList(String cityName) {
        List<FitnessCenter> list =  InitializationOfAllData.fitnessCentersList;
        list.forEach(l -> {
            l.getCenterName().forEach((k,v)-> {
                if(k.equals(cityName)){
                    v.forEach(name -> System.out.println(name));
                }
            });
        });
    }

    public void getSlotsAvaible(String cityName, String branches) {
        List<WorkOutVariation> list =  InitializationOfAllData.slotsList;
        list.forEach( l -> {
            l.getSlots().forEach((k,v) -> {
                if(k.equals(branches)){
                    System.out.println(v);
                }
            });
        });
    }
}
