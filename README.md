# CompanyProject
Company Project  by Java and oop
Implement Class Employee
With Attributes:
- Name text with spaces
- National ID unique value (text) for each employee
- Salary static double value of 1500 pounds
- Gender character holds f or m
- Available_vacations initially starts with 15 days
- Deduction_per_day static double value of 85.5pounds
- Available_permission_hours initially starts with 20 hours
- Deduction_per_hour static double value of 15.5pounds
- Actual_salary double value with actual salary after deductions
Methods:
- Constructor default, parameterized with name and National ID, ..
- Destructor
- Setters and Getters
- View to view Name, ID and actual salary
- View_Detailed call previous function and also shows other details (vacations - permissions - detailed deductions - … )
- Calculate_Actual_Salary calculates salary after deductions and returns it
- Free_All return all values to default
- Take_vacation this function takes number of days employee need to take as vacation,
available vacations reduced by number of days given, if available vacations became 0 salary is deduced by deduction per day set
- Take_permession this function takes hours that employee asked to take, 
reduce available permission hour by hours given, if available permission become 0 hour salary is reduced by deduction per hour
Use the class you implemented in problem one and include it in this scenario and added needed classes and attributes
A company wants to keep track of a company's employees, departments, and projects.
Create an Employee class, Department class and Project class.
Each department has a name, a number -ID-, 
and a particular employee who manages the department. We keep track of the start date when the employee become manager in the department. 
A department controls a number of projects, each of which has a unique name, and a single location.
We store each employee data as the class created in problem 1. 
An employee is assigned to one department but may work on several projects, which aren’t necessarily controlled by the same department.
