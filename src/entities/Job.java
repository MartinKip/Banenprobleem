package entities;

import util.Constants;

/**
 * Job entity
 * Created by Martin on 12-1-2016.
 */
public class Job {

    private String jobDescription;
    private Employee[] employees;

    public Job(String jobDescription){
        this.jobDescription = jobDescription;
        this.employees = new Employee[Constants.AMOUNT_OF_EMPLOYEES];
    }

    public String getJobDescription(){
        return this.jobDescription;
    }

    public Employee[] getEmployees(){
        return this.employees;
    }

    public void setJobDescription(String jobDescription){
        this.jobDescription = jobDescription;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    public String toString(){
        String result = jobDescription + ":";
        for(int i = 0; i < employees.length; i++){
            result += "\n" + (i + 1) + ": " + employees[i].getName();
        }
        return result;
    }

}
