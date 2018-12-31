/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyProject;


import java.util.Date;

/**
 *
 * @author AbdelRhman
 */
public class Department {
    
    protected String nameDepartmet;
    protected int number_ID;
    protected Project project ;
    protected Employee manger;
    protected Date date = new Date();

    public Department(String nameDepartmet, int number_ID) {
        this.nameDepartmet = nameDepartmet;
        this.number_ID = number_ID;
        
    }

    public String getNameDepartmet() {
        return nameDepartmet;
    }

    public void setNameDepartmet(String nameDepartmet) {
        this.nameDepartmet = nameDepartmet;
    }

    public int getNumber_ID() {
        return number_ID;
    }

    public void setNumber_ID(int number_ID) {
        this.number_ID = number_ID;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getManger() {
        return manger;
    }

    public void setManger(Employee manger) {
        this.manger = manger;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public void viewDepartment(){
        System.out.println("Name Departmet : "+nameDepartmet);
        System.out.println("Number_ID : "+number_ID);
        
    }
    
    public void viewDepartmentForSearch(){
        System.out.println("Name Departmet : "+nameDepartmet);
        System.out.println("Number_ID : "+number_ID);
        System.out.println("Name Employee : "+manger.getName());
        System.out.println("Name Project : "+project.getNameProject());
        
    }
    
    
    
}
