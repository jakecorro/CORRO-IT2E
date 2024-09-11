
package corro.it2e;


public class Application {
   int id;
    String name;
    double gpa;
    double annualFamilyIncome;
    int communityServiceHours;
    String scholarshipStatus;

    public Application(int id, String name, double gpa, double annualFamilyIncome, int communityServiceHours) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.annualFamilyIncome = annualFamilyIncome;
        this.communityServiceHours = communityServiceHours;
        this.scholarshipStatus = gpa >= 3.5 ? "Approved" : "Denied";
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + String.format("%.1f", gpa) + "\t" + String.format("%.2f", annualFamilyIncome) + "\t" + communityServiceHours + "\t" + scholarshipStatus;
    }
}

