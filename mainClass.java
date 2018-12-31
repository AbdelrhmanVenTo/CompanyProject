/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyProject;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AbdelRhman
 */
public class mainClass {
    
    static ArrayList<Project> allProjects ;
    static ArrayList<Employee> allEmployees;
    static ArrayList<Department> allDepartments;
    static Scanner input;
    
    static void showAllEmployees (){
        for(int i =0;i<allEmployees.size();i++){
            allEmployees.get(i).ViewDetailed();
            System.out.println("*******************************");
        }
    }
    static void showAllProject (){
        for(int i =0;i<allProjects.size();i++){
            allProjects.get(i).viewProject();
            System.out.println("*******************************");
        }
    }
    static void showAllDepartment (){
        for(int i =0;i<allDepartments.size();i++){
            allDepartments.get(i).viewDepartment();
            System.out.println("*******************************");
        }
    }
    //static int departmentNumber_ID = input.nextInt();
    
    // two function use them in addEmployees () function 
    static Department addNewDepartment(){
         input.nextLine();
         System.out.println("Enter Name Departmet");
         String nameDepartment = input.nextLine();
         System.out.println("Enter Number_ID");
         int departmentNumber_ID = input.nextInt();
         Department department =  new Department(nameDepartment, departmentNumber_ID);
             
        return department;
    }
    static Project addNewProject(){
         input.nextLine();
         System.out.println("Enter Name Project");
         String nameProject = input.nextLine();
         System.out.println("Enter Location Project");
         String locationProject = input.nextLine();
         Project project = new Project(nameProject, locationProject);
        return project;
    }
    static void addEmployees (){
        input.nextLine();
        System.out.println("Enter Employess Name");
        String nameEmployees = input.nextLine();
        System.out.println("Enter Employess ID");
        String employeesID = input.nextLine();
        System.out.println("Enter Employess Gender");
        String genderEmployees = input.nextLine();
        Employee employee = new Employee(nameEmployees, employeesID,genderEmployees);
        System.out.println("1 - Connect Employee wirh exists Department and project");
        System.out.println("2 - Connect Employee wirh new Department and project");
        int choose = input.nextInt();
         switch (choose){
            case 1 :
                System.out.println("enter department id");
                int departmentNumber_ID = input.nextInt();
                input.nextLine();
                System.out.println("enter project name");
                String nameProject = input.nextLine();
       
                for(int i=0;i<allDepartments.size();i++){
                   if(departmentNumber_ID==allDepartments.get(i).getNumber_ID()){
                         employee.setDepartment(allDepartments.get(i));
                      //  allDepartments.get(i).setManger(employee);
            }  
        }
                for(int i=0;i<allProjects.size();i++){
                if(nameProject.equals(allProjects.get(i).getNameProject())){
                 employee.setProject(allProjects.get(i));
                 allProjects.get(i).setEmployee(employee);
            }  
        }
                
                allEmployees.add(employee);
                System.out.println("Employee Created Successfully");
                break;
            case 2 :        
               //
                            Department department= addNewDepartment();
                            Project project = addNewProject();
                            employee.setProject(project);
                            project.setEmployee(employee);
                            department.setManger(employee);
                            employee.setDepartment(department);
                            department.setProject(project);
                            project.setDepartment(department);
             
                            allEmployees.add(employee);
                            allProjects.add(project);
                            allDepartments.add(department);
                            System.out.println("Employee Created Successfully");
                            break;
            
    }
        
    }
    static void addDepartment (){
        System.out.println("Enter Name Departmet");
        String nameDepartment = input.nextLine();
        System.out.println("Enter Number_ID");
        int number_ID = input.nextInt();
        Department department =  new Department(nameDepartment, number_ID);
        allDepartments.add(department);
        System.out.println("Department Created Successfully");
    }
    
    static void addProject (){
        System.out.println("Enter Name Project");
        String nameProject = input.nextLine();
        System.out.println("Enter Location Project");
        String locationProject = input.nextLine();
        Project project = new Project(nameProject, locationProject);
        allProjects.add(project);
        System.out.println("Project Created Successfully");
    }
    
    
    static Employee searchUseForsearchForEmployees (String employeesID){
        for(int i=0;i<allEmployees.size();i++){
            if(employeesID.equals(allEmployees.get(i).getNId())){
                return allEmployees.get(i);
            }
        }
        return null;
    }
    
    static Project searchUseForsearchForProject(String nameProject){
        for(int i=0;i<allEmployees.size();i++){
           if(nameProject.equals(allProjects.get(i).getNameProject())){
                return allProjects.get(i);
            }
        }
        return null;
    }
    
    static Department searchUseForsearchForDepartment(int departmentNumber_ID){
        for(int i=0;i<allDepartments.size();i++){
            if(departmentNumber_ID==allDepartments.get(i).getNumber_ID()){
                return allDepartments.get(i);
            }
        }
        return null;
    }
    
    static void searchForEmployees(){
        System.out.println("Enter Employess ID");
        String employess_ID = input.nextLine();
        Employee employee = searchUseForsearchForEmployees(employess_ID);
        if(employess_ID==null){
            System.err.println("Employee Not Found");
            return;
        }
        employee.ViewDetailed();
    }
    
    static void searchForProject(){
        System.out.println("Enter Name Project");
        String nameProject = input.nextLine();
        Project project = searchUseForsearchForProject(nameProject);
        if(nameProject==null){
            System.err.println("Project Not Found");
            return;
        }
        project.viewProjectForSearch();
    }
    
    static void searchForDepartment(){
        System.out.println("Enter Department ID");
        int departmentNumber_ID = input.nextInt();
        Department department = searchUseForsearchForDepartment(departmentNumber_ID);
        if(String.valueOf(departmentNumber_ID)==null){
            System.err.println("Department Not Found");
            return;
        }
        department.viewDepartmentForSearch();
    }
    static void removeEmployees(){
        System.out.println("Enter Employess ID");
        String employess_ID = input.nextLine();
        Employee employee = searchUseForsearchForEmployees(employess_ID);
        if(employess_ID==null){
            System.err.println("Employee Not Found");
            return;
        }
        allEmployees.remove(employee);
        System.out.println("Employee Remove Successfully");
       
    }
    
    static void removeProjects(){
        System.out.println("Enter Name Project");
        String nameProject = input.nextLine();
        Project project = searchUseForsearchForProject(nameProject);
        if(nameProject==null){
            System.err.println("Employee Not Found");
            return;
        }
        allProjects.remove(project);
        System.out.println("Project Remove Successfully");
       
    }
    
    static void removeDepartments(){
        System.out.println("Enter Department ID");
        int departmentNumber_ID = input.nextInt();
        Department department = searchUseForsearchForDepartment(departmentNumber_ID);
        if(String.valueOf(departmentNumber_ID) == null){
            System.err.println("Department Not Found");
            return;
        }
        allDepartments.remove(department);
        System.out.println("Department Remove Successfully");
       
    }
    
    
    
    public static void main(String[] args) {
//        Employee e = new Employee("yehia", "123345", 'm');
//        Employee e3 = new Employee("Mohgamed ", "xyz");
//        Employee e2 = new Employee();
//        e2.setName("Mohamed");
//        e.ViewDetailed();
//        e.TakeVacation(10);
//        e.ViewDetailed();
//        e.TakeVacation(6);
//        e.ViewDetailed();

            allProjects = new ArrayList<>();
            allEmployees = new ArrayList<>();
            allDepartments = new ArrayList<>();
            input = new Scanner(System.in);
            addTestData();
            
            while (true)
        {
            System.out.println("1- Add Employee");
            System.out.println("2- Add Project");
            System.out.println("3- Add Department");
            System.out.println("4- List All Employee");
            System.out.println("5- List All Project");
            System.out.println("6- List All Department");
            System.out.println("7- Search For Employee");
            System.out.println("8- Search For Project");
            System.out.println("9- Search For Department");
            System.out.println("10- Remove Employee");
            System.out.println("11- Remove Project");
            System.out.println("12- Remove Department");
            System.out.println("13- exit");
            int option = input.nextInt();
        
            switch (option) {
                case 1: addEmployees();
                break;
                
                case 2: addProject();
                break;
                
                case 3: addDepartment();
                break;
                
                case 4: showAllEmployees();
                break;
                
                case 5: showAllProject();
                break;
                
                case 6: showAllDepartment();
                break;
                
                case 7: searchForEmployees();
                break;
                
                case 8: searchForProject();
                break;
                
                case 9: searchForDepartment();
                break;
                
                case 10: removeEmployees();
                break;
                
                case 11: removeProjects();
                break;
                
                case 12: removeDepartments();
                break;
                
                case 13: 
                break;
            }
        
        }

            
    }
    
    static void addTestData(){
         for(int i=0;i<5;i++){
             Employee employee = new Employee("name" + i, "nId" + i, "gender");
             Project project = new Project("nameProject" + i, "location"+i);
             Department department = new Department("nameDepartmet"+i, 1000+i);
             employee.setProject(project);
             project.setEmployee(employee);
             department.setManger(employee);
             employee.setDepartment(department);
             department.setProject(project);
             project.setDepartment(department);
             
             
             allEmployees.add(employee);
             allProjects.add(project);
             allDepartments.add(department);
         }
         
         
    }
 
    
}
