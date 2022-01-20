package com.solvd.onlineshop.utils.streamhomework;

import com.solvd.onlineshop.enums.Jobs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAdded {

    private String name;
    private Jobs job;
    private String nameOfDepartment;
    private int age;
    private float salary;
    private LocalDate hireDate;
    private String mobile;
    private String email;
    private Long id;

    private static final Logger LOGGER = LogManager.getLogger(EmployeeAdded.class);


    public EmployeeAdded() {

    }

    public EmployeeAdded(String name, Jobs job, String nameOfDepartment, int age, float salary, LocalDate hireDate, String mobile, String email, Long id) {
        this.name = name;
        this.job = job;
        this.nameOfDepartment = nameOfDepartment;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.mobile = mobile;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public static LocalDate hireDates(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }


    private static List<EmployeeAdded> getEmployees() {

        return List.of(
           new EmployeeAdded("Harold", Jobs.SOFTWARE_DEVELOPER, "IT Department", 27, 50000.00f, hireDates(2017,5,23), "7324580987", "harold1@gmail.com", 5435679L),
           new EmployeeAdded("Garry", Jobs.FINANCIAL_MANAGER, "Finance Department", 45, 110000.00f, hireDates(2019,4,2), "5356737259", "garry1@gmail.com", 4684090L),
           new EmployeeAdded("Felicia", Jobs.FRONT_END_WEB_DEVELOPER, "IT Department", 23, 60000.00f, hireDates(2021, 1, 1), "4649490749","felicia1@gmail.com", 7143287L),
           new EmployeeAdded("Vanessa", Jobs.USER_EXPERIENCE_DESIGNER, "IT Department", 37, 125000.00f, hireDates(2009, 7, 27), "8147385670","vanessa1@hotmail.com", 3563284L),
           new EmployeeAdded("Catherine", Jobs.CUSTOMER_SERVICE_REPRESENTATIVE, "Customer Service", 20, 35000.00f, hireDates(2001, 9, 30), "8159166103", "catherine1@hotmail.com", 1271938L),
           new EmployeeAdded("Victor",Jobs.MARKETING_SPECIALIST, "Marketing", 58, 112000.00f, hireDates(2012, 12, 12), "9343938444", "victor1@hotmail.com", 5468285L)
        );
    }

    private static CharSequence infoTechWorkers(List<EmployeeAdded> employees) {
        List<EmployeeAdded> itDepartment = employees.stream()
                                                    .filter(employeeDepartment -> employeeDepartment.getNameOfDepartment().equals("IT Department"))
                                                    .collect(Collectors.toList());

        itDepartment.forEach(System.out::println);
        return null;
    }

    private static CharSequence ascendingAge(List<EmployeeAdded> employees) {
        List<EmployeeAdded> sortedByAge = employees.stream()
                                                   .sorted(Comparator.comparing(EmployeeAdded::getAge))
                                                   .collect(Collectors.toList());

        sortedByAge.forEach(System.out::println);
        return null;
    }

    private static CharSequence ageEligibilityCheck(List<EmployeeAdded> employees) {
        boolean olderThanEighteen = employees.stream()
                                             .anyMatch(employeeAge -> employeeAge.getAge() > 18);
        System.out.println(olderThanEighteen);
        return null;
    }

    private static CharSequence anyEmployeesReadyToRetire(List<EmployeeAdded> employees) {
        boolean olderEmployees = employees.stream()
                                          .anyMatch(employeeAge -> employeeAge.getAge() > 50);
        System.out.println(olderEmployees);
        return null;
    }

    private static CharSequence liveableWagePaid(List<EmployeeAdded> employees) {
        boolean fairWage = employees.stream()
                                    .noneMatch(employeeSalary -> employeeSalary.getSalary() < 35000.00f);
        System.out.println(fairWage);
        return null;
    }

    private static CharSequence mostRecentHire(List<EmployeeAdded> employees) {
        Optional<EmployeeAdded> max = employees.stream()
                                               .max(Comparator.comparing(EmployeeAdded::getHireDate));
        System.out.println(max);
        return null;
    }

    private static CharSequence longestAtCompany(List<EmployeeAdded> employees) {
        Optional<EmployeeAdded> min = employees.stream()
                                               .min(Comparator.comparing(EmployeeAdded::getHireDate));

        System.out.println(min);
        return null;
    }

    private static CharSequence employeesByDepartment(List<EmployeeAdded> employees) {
        Map<String, List<EmployeeAdded>> groupByDepartment = employees.stream()
                                                                      .collect(Collectors.groupingBy(EmployeeAdded::getNameOfDepartment));

        groupByDepartment.forEach((nameOfDepartment, employeesInDepartment) -> {
            System.out.println(nameOfDepartment);
            employeesInDepartment.forEach(System.out::println);
        });
        return null;
    }


    /*public static void main(String[] args) {
        List<EmployeeAdded> employees = getEmployees();
        //LOGGER.info(infoTechWorkers(employees));
        //LOGGER.info(ascendingAge(employees));
        //LOGGER.info(ageEligibilityCheck(employees));
        //LOGGER.info(anyEmployeesReadyToRetire(employees));
        //LOGGER.info(liveableWagePaid(employees));
        //LOGGER.info(mostRecentHire(employees));
        //LOGGER.info(longestAtCompany(employees));
        //LOGGER.info(employeesByDepartment(employees));
    }

     */


    @Override
    public String toString() {
        return "EmployeeAdded{" +
                "name='" + name + '\'' +
                ", job=" + job +
                ", nameOfDepartment='" + nameOfDepartment + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
