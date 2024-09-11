
package corro.it2e;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CORROIT2E {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Applications: ");
        int numApplications = scanner.nextInt();
        List<Application> applications = new ArrayList<>();

        for (int i = 1; i <= numApplications; i++) {
            System.out.println("Enter details of application " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            System.out.print("Annual Family Income: ");
            double annualFamilyIncome = scanner.nextDouble();
            System.out.print("Community Service Hours: ");
            int communityServiceHours = scanner.nextInt();
            Application application = new Application(id, name, gpa, annualFamilyIncome, communityServiceHours);
            applications.add(application);
        }

        System.out.println("\nID\tName\tGPA\tAnnual Family Income\tCommunity Service Hours\tScholarship Status");
        for (Application application : applications) {
            System.out.println(application.toString());
        }
    }
}
    
    

