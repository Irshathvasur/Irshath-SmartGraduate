package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SENTINAL=-1;

        final int SALARY_CEILING = 6000; 
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2; 
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17; 
        final double EMPLOYEE_RATE_55_TO_60 = 0.13; 
        final double EMPLOYER_RATE_55_TO_60 = 0.13; 
        final double EMPLOYEE_RATE_60_TO_65 = 0.075; 
        final double EMPLOYER_RATE_60_TO_65 = 0.09; 
        final double EMPLOYEE_RATE_65_ABOVE = 0.05; 
        final double EMPLOYER_RATE_65_ABOVE = 0.075; 

        int salary,age;
        int contributable_salary;
        double employee_contribution=0,employer_contribution=0,total_contribution=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the salary");
        salary=scan.nextInt();
        System.out.println("Enter the age of the employee");
        age=scan.nextInt();

        while(salary!=SENTINAL){
            if(salary>SALARY_CEILING){
                contributable_salary=6000;
            }
            else{
                contributable_salary=salary;
            }

            if(age>65){
                employee_contribution=contributable_salary*EMPLOYEE_RATE_65_ABOVE;
                employer_contribution=contributable_salary*EMPLOYER_RATE_65_ABOVE;
                total_contribution=employee_contribution+employer_contribution;
            }
            else if(age>=60){
                employee_contribution=contributable_salary*EMPLOYEE_RATE_60_TO_65;
                employer_contribution=contributable_salary*EMPLOYER_RATE_60_TO_65;
                total_contribution=employee_contribution+employer_contribution;
            }
            else if(age>=55){
                employee_contribution=contributable_salary*EMPLOYEE_RATE_55_TO_60;
                employer_contribution=contributable_salary*EMPLOYER_RATE_55_TO_60;
                total_contribution=employee_contribution+employer_contribution;
            }
            else{
                employee_contribution=contributable_salary*EMPLOYEE_RATE_55_AND_BELOW;
                employer_contribution=contributable_salary*EMPLOYER_RATE_55_AND_BELOW;
                total_contribution=employee_contribution+employer_contribution;
            }

            System.out.printf("Employee's contribution is %.2f\n",employee_contribution);
            System.out.printf("Employer's contribution is %.2f\n",employer_contribution);
            System.out.printf("The total contribution is %.2f\n",total_contribution);

            System.out.println("\n\nEnter the salary(or enter -1 to exit)");
            salary=scan.nextInt();
            if(salary!=SENTINAL){
                System.out.println("Enter the age");
                age=scan.nextInt();
            }
        }
        System.out.println("Bye");
        scan.close();
    }
}
