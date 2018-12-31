/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyProject;

/**
 *
 * @author AbdelRhman
 */
public class Employee
{
    protected String name;
    protected String NId;
    protected String gender;
    protected static double Salary = 1500;
    protected int AvailableVacations ;
    protected int AvailablePermessionHours;
    protected static double deductionPerDay = 85.5;
    protected static double deductionPerHour= 15.5;
    protected double ActualSalary;
    protected Department department;
    protected Project project;
    
    //default constructor
    public Employee(){
        name = "";
        NId = "";
        gender = "";
        AvailablePermessionHours = 20;
        AvailableVacations =15;
        ActualSalary = Salary;
        
    }
    //parameterized constructor
    public Employee(String name,String nId,String gender){
        this.name=name;
        this.NId= nId;
        this.gender = gender;
        AvailableVacations = 15;
        AvailablePermessionHours = 20;
        ActualSalary = Salary;
    }
    public Employee(String name ,String Nid){
        this.name = name;
        this.NId = Nid;
    }
    
    public void setName (String name){
        this.name = name;
    }
   
    public String getName(){
        return name;
    }

    public String getNId()
    {
        return NId;
    }

    public void setNId(String NId)
    {
        this.NId = NId;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    
    
    
 
    public void View(){
        System.out.println("name : "+name);
        System.out.println("NId : "+NId);
        System.out.println("Actual Salary : "+ActualSalary);
    }
    
    public void ViewDetailed(){
        this.View();
        System.out.println("vacations : "+AvailableVacations);
        System.out.println("permession hours : "+AvailablePermessionHours);
        department.viewDepartment();
        project.viewProject();
    }
    public void TakeVacation(int numOfDays){
        AvailableVacations-=numOfDays;
        if(AvailableVacations<0)
            CalaulateActualSalary();
    }
    public void TakePermessionHours(int numOfHours){
        AvailablePermessionHours-=numOfHours;
        if(AvailablePermessionHours<0)
            CalaulateActualSalary();
    }

    public double CalaulateActualSalary()
    {
        ActualSalary = Salary;
        if(AvailableVacations<0){
            ActualSalary += (deductionPerDay * AvailableVacations);
        }
        if(AvailablePermessionHours<0){
            ActualSalary += (deductionPerHour*AvailablePermessionHours);
        }
        
        return ActualSalary;
        
        
    }
    
    public void FreeAll(){
        ActualSalary= Salary;
        AvailablePermessionHours = 20;
        AvailableVacations=15;
    }
}
