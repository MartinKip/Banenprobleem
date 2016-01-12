package entities;

import util.Constants;

/**
 * Employee wrapper class. Employee exists of a name and an (ordered) list of preferred jobs
 * Created by Martin on 12-1-2016.
 */
public class Employee {

    private String name;
    /**
     * Jobs is an ordered array of preferred jobs.
     * So jobs[0] is the best preferred job and jobs[MAX] is the least preferred
     */
    private Job[] jobs;

    public Employee(String name){
        this.name = name;
        this.jobs = new Job[Constants.AMOUNT_OF_JOBS];
    }

    public String getName(){
        return this.name;
    }

    public Job[] getJobs(){
        return this.jobs;
    }

    public void setJobs(Job[] jobs){
        this.jobs = jobs;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String result = name + ":";
        for(int i = 0; i < jobs.length; i++){
            result += "\n" + (i + 1) + ": " + jobs[i].getJobDescription();
        }
        return result;
    }
}
