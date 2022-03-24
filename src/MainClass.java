
import java.util.ListIterator;


public class MainClass {
    public static void main(String[] args) {
        EmployeeBean bean = new EmployeeBean(101,"Adithya",5000,"SDET");
        EmployeeBean bean2 = new EmployeeBean(102,"Doshk",1000,"AD");
        EmployeeBean bean3 = new EmployeeBean(103,"Diya",11000,"Aarav");
        EmployeeService es = new EmployeeService();
        System.out.println(es.insertEmployee(bean));
        System.out.println(es.insertEmployeeByPosition(bean2, 1));
        System.out.println(es.insertEmployeeByPosition(bean3, 2));
        System.out.println(es.fetchAllEmployees());
        System.out.println(es.deleteEmployeeByEmpID(101));
        EmployeeBean bean1 = new EmployeeBean(101,"adi",5000,"SDET");
        System.out.println(es.updateEmployeeByEmpID(bean1));
        System.out.println(es.fetchAllEmployees());
        System.out.println(es.findEmployeeByEmpID(102));
    }
}
