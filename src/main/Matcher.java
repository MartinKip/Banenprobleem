package main;

import entities.Employee;
import entities.Job;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Matcher class that matches employees with jobs
 * Created by Martin on 12-1-2016.
 */
public class Matcher {
    private DataCenter dataCenter;

    public Matcher(DataCenter dataCenter){
        this.dataCenter = dataCenter;
    }

    public void match(){
        System.out.println(dataCenter.getAllEmployees().size());
        Map<Job, Employee> matches = this.findMatches(dataCenter.getAllEmployees(), dataCenter.getAllJobs());
        for (Map.Entry<Job, Employee> entry : matches.entrySet()){
            System.out.println(entry.getKey().getJobDescription() + " matched to: " + entry.getValue().getName());
        }
    }

    private Map<Job, Employee> findMatches(List<Employee> employees, List<Job> jobs){
        Map<Job, Employee> matchesFound = new TreeMap<Job, Employee>();
        List<Employee> employeesWithoutMatch = new LinkedList<Employee>();
        employeesWithoutMatch.addAll(employees);
        while(!employeesWithoutMatch.isEmpty()){
            Employee employee = employeesWithoutMatch.remove(0); // get first employee of the list
            List<Job> employeePreferences = employee.getJobs();
            for (Job job : employeePreferences){
                Employee currentEmployee = matchesFound.get(job);
                if (currentEmployee == null){
                    matchesFound.put(job, employee);
                    break;
                } else {
                    List<Employee> jobPreferences = job.getEmployees();
                    if (jobPreferences.indexOf(employee) < jobPreferences.indexOf(currentEmployee)){
                        matchesFound.put(job, employee);
                        employeesWithoutMatch.add(currentEmployee);
                        break;
                    }
                }
            }
        }

        return matchesFound;
    }
}
