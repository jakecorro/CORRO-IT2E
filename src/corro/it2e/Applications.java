
package corro.it2e;


public class Applications {
     private final int id;
    private final String name;
    private final double gpa;
    private final double annualFamilyIncome;
    private final int communityServiceHours;
    private final String scholarshipStatus;

    public Applications(int id, String name, double gpa, double annualFamilyIncome, int communityServiceHours) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.annualFamilyIncome = annualFamilyIncome;
        this.communityServiceHours = communityServiceHours;
        this.scholarshipStatus = determineScholarshipStatus();
    }

    private String determineScholarshipStatus() {
        if (gpa >= 3.5) {
            return "Approved";
        } else {
            return "Denied";
        }
    }
}

