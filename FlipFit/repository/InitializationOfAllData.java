package FlipFit.repository;

import FlipFit.entity.FitnessCenter;
import FlipFit.entity.User;
import FlipFit.entity.WorkOutVariation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InitializationOfAllData {
    public static List<FitnessCenter> fitnessCentersList = new ArrayList<>();
    public static List<User> UsersList = new ArrayList<>() ;
    public static List<WorkOutVariation> slotsList = new ArrayList<>() ;
    public void initializeWorkOutVariation() {
        WorkOutVariation workOutVariation = new WorkOutVariation();
        List<String> workOutList = Arrays.asList("Weights"," Cardio","Yoga", "Swimming","Badminton","Meditation");
        workOutVariation.setWorkOutTypes(workOutList);
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Weights",10);hmap.put("Swimming",15);
        hmap.put("Cardio",10);hmap.put("Badminton",6);
        hmap.put("Yoga",10);hmap.put("Meditation",20);
        workOutVariation.setSeatsAvailable(hmap);
        HashMap<String,HashMap<String,Integer>> slots = new HashMap<>();
        slots.put("6:00AM",hmap);slots.put("7:00AM",hmap);slots.put("8:00AM",hmap);
        slots.put("6:00PM",hmap);slots.put("7:00PM",hmap);slots.put("8:00PM",hmap);
        workOutVariation.setSlots(slots);
        slotsList.add(workOutVariation);
    }

    public void initializeUsers(String name,String city,Long mobile,String area,String type) {
        User user = new User();
        user.setUserName(name);
        user.setCity(city);
        user.setMobileNo(mobile);
        user.setArea(area);
        user.setWorkoutType(type);
        UsersList.add(user);
        System.out.println("User Register SuccessFull...!!!");
    }

    public void initializeFitnessCenters() {
        FitnessCenter fitnessCenter = new FitnessCenter();
        List<String> cityList = Arrays.asList("Banglore","Delhi","Mumbai" ,"Pune","Chennai");
        fitnessCenter.setCityName(cityList);
        List<String> bangloreBranches = Arrays.asList("Bellandur","Kormanagala","Electronic_City");
        List<String> mumbaiBranches = Arrays.asList("Navi Mumbai","Mumbai Central","South Mumbai");
        List<String> puneBranches = Arrays.asList("Hinjewadi","Sargate");
        List<String> chennaiBranches = Arrays.asList("Sholinganallur","Myalpore");
        HashMap<String,List<String>> centerName = new HashMap<>();
        centerName.put("Banglore",bangloreBranches); centerName.put("Mumbai",mumbaiBranches);
        centerName.put("Chennai" ,chennaiBranches); centerName.put("Pune",puneBranches);
        fitnessCenter.setCenterName(centerName);
        fitnessCentersList.add(fitnessCenter);
    }
}
