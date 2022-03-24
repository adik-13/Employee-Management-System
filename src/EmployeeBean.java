public class EmployeeBean {
    private int empID;
    private String name;
    private float salary;
    private String designation;
    public EmployeeBean(int empID, String name, float salary, String designation) {
        super();
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
