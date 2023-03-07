package data;

import java.util.ArrayList;
import java.util.Arrays;

import Component.DateTime;
import employee.Certificate;
import employee.Company;
import employee.Employee;
import employee.Experience;
import employee.Fresher;
import employee.Intern;

public class dataContext {
    public dataContext() {};
    public ArrayList<Experience> addEmployExperience() {
        ArrayList<Experience> employees = new ArrayList<>();
        Experience one = new Experience(Employee.generateId,"minh","090930","minh@gmail.com", new DateTime(15, 5, 2003), new ArrayList<>(
            Arrays.asList(
                new Certificate("cer1", "university", "master"),
                new Certificate("cer2", "ISO", "master")
            )
        ), new ArrayList<>(
            Arrays.asList(
                new Company("company Print", "good", "5 start"),
                new Company("company software", "bad", "2 start")
            )
        ),123456789,0, new ArrayList<>(
            Arrays.asList(
                "Mobile",
                "Frontend"
            )
        ), "DevDepartment");

        Experience two = new Experience(Employee.generateId,"Dung","01234","Dung@gmail.com", new DateTime(20, 5, 2003), new ArrayList<>(
            Arrays.asList(
                new Certificate("cer1", "university", "master"),
                new Certificate("cer2", "Google", "master")
            )
        ), new ArrayList<>(
            Arrays.asList(
                new Company("company outSoure", "good", "5 start"),
                new Company("company software", "bad", "2 start")
            )
        ),123456789,0, new ArrayList<>(
            Arrays.asList(
                "Backend",
                "Frontend"
            )
        ), "DevDepartment");
        employees.add(one);
        employees.add(two);
        return employees;
    }

    public ArrayList<Fresher> addEmployFresher() {
        ArrayList<Fresher> employees = new ArrayList<>();
        Fresher one = new Fresher(Employee.generateId, "Tai" ,"012345789" , "taiKonNe@gmail.com", new DateTime(1,1,2003) , new ArrayList<> (
            Arrays.asList(
                new Certificate("cer1", "doubleGoogle", "hard"),
                new Certificate("cer2", "doubleTwitter", "hard")
            )
        ), new ArrayList<> (
            Arrays.asList(
                new Company("CP ACCOUNT", "Happy", "5 Start"),
                new Company("CP Twitter", "Happy", "5 Start")
            )
        ), 123456789, new DateTime(22,12,2024), "master", "TDMU","DevDepartment");
        employees.add(one);
        return employees;
    }
    
    public ArrayList<Intern> addEmployIntern() {
        ArrayList<Intern> employees = new ArrayList<>();
        Intern one = new Intern(Employee.generateId, "Hang" ,"012345789" , "hang@gmail.com", new DateTime(1,1,2003) , new ArrayList<> (
            Arrays.asList(
                new Certificate("cer1", "thirdUniversity", "hard"),
                new Certificate("cer2", "doubleTwitter", "hard")
            )
        ), new ArrayList<> (
            Arrays.asList(
                new Company("CP ACCOUNT", "Happy", "5 Start"),
                new Company("CP Twitter", "Happy", "5 Start")
            )
        ), 123456789, "CNTT", "TDMU", 5,"DevDepartment", 0);
        employees.add(one);
        return employees;
    }
}
