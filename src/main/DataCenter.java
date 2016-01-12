package main;

import entities.Employee;
import entities.Job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Data center containing data structure for the program
 * Created by Martin on 12-1-2016.
 */
public class DataCenter {
    private List<Employee> allEmployees;
    private List<Job> allJobs;

    public DataCenter(){
        allEmployees = new ArrayList<>();
        allJobs = new ArrayList<>();
    }

    public void GenerateEmployees(){
        this.generateEmployees();
        this.generateJobs();
        this.randomizeEmployeePreferences();
        this.randomizeJobPreferences();
    }

    private void randomizeEmployeePreferences() {
        for(Employee employee : allEmployees){
            List<Job> allJobsCopy = new ArrayList<>(allJobs);
            Collections.shuffle(allJobsCopy);
            employee.setJobs(allJobsCopy);
        }

        /*
        for(Employee employee: allEmployees){
            System.out.println(employee.toString());
        }
        */
    }

    private void randomizeJobPreferences(){
        for (Job job : allJobs){
            List<Employee> allEmployeesCopy = new ArrayList<>(allEmployees);
            Collections.shuffle(allEmployeesCopy);
            job.setEmployees(allEmployeesCopy);
        }

        /*
        for (Job job : allJobs){
            System.out.println(job.toString());
        }
        */
    }

    private void generateJobs() {
        Job job0 = new Job("Afwasser");
        Job job1 = new Job("Bus chauffeur");
        Job job2 = new Job("Culinair persoon");
        Job job3 = new Job("Dierenarts");
        allJobs.add(job0);
        allJobs.add(job1);
        allJobs.add(job2);
        allJobs.add(job3);
    }

    private void generateEmployees() {
        Employee employee0 = new Employee("Ad");
        Employee employee1 = new Employee("Bert");
        Employee employee2 = new Employee("Coen");
        Employee employee3 = new Employee("Dirk");
        allEmployees.add(employee0);
        allEmployees.add(employee1);
        allEmployees.add(employee2);
        allEmployees.add(employee3);
    }

    public List<Employee> getAllEmployees(){
        return this.allEmployees;
    }

    public List<Job> getAllJobs(){
        return this.allJobs;
    }
}
