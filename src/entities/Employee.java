package entities;

import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee wrapper class. Employee exists of a name and an (ordered) list of preferred jobs
 * Created by Martin on 12-1-2016.
 */
public class Employee implements Comparable{

    private String name;
    /**
     * Jobs is an ordered array of preferred jobs.
     * So jobs[0] is the best preferred job and jobs[MAX] is the least preferred
     */
    private List<Job> jobs;

    public Employee(String name){
        this.name = name;
        this.jobs = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List<Job> getJobs(){
        return this.jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String result = name + ":";
        for(int i = 0; i < jobs.size(); i++){
            result += "\n" + (i + 1) + ": " + jobs.get(i).getJobDescription();
        }
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Employee comparingEmployee = (Employee)o;
        if (this.name.equals(comparingEmployee.getName())){
            return 0;
        }
        return -1;
    }
}
