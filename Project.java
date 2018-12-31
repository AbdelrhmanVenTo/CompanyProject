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
public class Project {
    
    protected String nameProject;
    protected String location;
    protected Employee employee;
    protected Department department;

    public Project(String nameProject, String location) {
        this.nameProject = nameProject;
        this.location = location;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee e) {
        this.employee = e;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
    
    public void viewProject(){
        System.out.println("Name Project : "+nameProject);
        System.out.println("Location : "+location);
        
        
    }
    
    public void viewProjectForSearch(){
        System.out.println("Name Project : "+nameProject);
        System.out.println("Location : "+location);
        System.out.println("Name Employee : "+employee.getName());
        System.out.println("Name Department : "+department.getNameDepartmet());
        
    }
    
    
    
    
}
