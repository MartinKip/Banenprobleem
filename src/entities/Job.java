package entities;

import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Job entity
 * Created by Martin on 12-1-2016.
 */
public class Job implements Comparable {

    private String jobDescription;
    private List<Employee> employees;

    public Job(String jobDescription){
        this.jobDescription = jobDescription;
        this.employees = new ArrayList<>();
    }

    public String getJobDescription(){
        return this.jobDescription;
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public void setJobDescription(String jobDescription){
        this.jobDescription = jobDescription;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    public String toString(){
        return jobDescription;
    }

    @Override
    public int compareTo(Object o) {
        Job comparingJob = (Job)o;
        if (this.jobDescription.equals(comparingJob.getJobDescription())){
            return 0;
        }
        return -1;
    }
}
