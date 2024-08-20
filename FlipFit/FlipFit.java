package FlipFit;

import FlipFit.repository.InitializationOfAllData;
import FlipFit.service.BranchesAviablity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipFit {
    public static void main(String args[]) throws IOException {
        InitializationOfAllData initialization = new InitializationOfAllData();
        initialization.initializeWorkOutVariation();
        initialization.initializeUsers("Rahul Patil","Banglore",8095499113L,"Koramalaga","Yoga");
        initialization.initializeFitnessCenters();
        int option = 5;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (option != 0){
            System.out.println("Please Enter the Below Option :");
            System.out.println("Option 1 : To Register the Users");
            System.out.println("Option 2 : To Check the available Details");
            System.out.println("Option 3 : To Check the slots and availability");
            String str = bufferedReader.readLine();
           option = Integer.parseInt(str);
            switch (Integer.parseInt(str)){
                case 1: {
                    System.out.println("Hi..WelComeTo FlipFit Center ....!!!");
                    System.out.println("Please Enter Your Name");
                    String userName = bufferedReader.readLine();
                    System.out.println("Please Enter cityName");
                    String cityName = bufferedReader.readLine();
                    System.out.println("Please Enter Your Mobile Number");
                    Long mobileNumber = Long.parseLong(bufferedReader.readLine());
                    System.out.println("Please Enter Your Area");
                    String areaName = bufferedReader.readLine();
                    System.out.println("Please Enter Your Work Out Type");
                    String workOut = bufferedReader.readLine();
                    initialization.initializeUsers(userName,cityName,mobileNumber,areaName,workOut);
                    continue;
                }
                case 2 : {
                        System.out.println("Please Enter the City Name to check the available branches");
                        String cityName = bufferedReader.readLine();
                     BranchesAviablity branchesAviablity = new BranchesAviablity();
                     branchesAviablity.getAllAvailableBranchList(cityName);
                }
                case 3 : {
                    System.out.println("Please Enter the City Name Branch to check the available slots");
                    String cityName = bufferedReader.readLine();
                    String branches = bufferedReader.readLine();
                    BranchesAviablity branchesAviablity = new BranchesAviablity();
                    branchesAviablity.getSlotsAvaible(cityName,branches);
                }
            }

        }
    }
}
