

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeService {
    private List<EmployeeBean> listEmp = new ArrayList<>();

    public boolean insertEmployee(EmployeeBean bean) {
        listEmp.add(bean);
        return listEmp != null;

    }
    public String insertEmployeeByPosition(EmployeeBean bean,int position) {
        listEmp.add(position, bean);
        return "Inserted employee at position : "+position;

    }
    public List<EmployeeBean> fetchAllEmployees(){
        ListIterator<EmployeeBean> li = listEmp.listIterator();
        if(listEmp!=null) {
            while(li.hasNext())
                return listEmp;
        }else
            return null;
        return listEmp;
    }

    public boolean deleteEmployeeByEmpID( int empID) {
        int flag=0;
        ListIterator<EmployeeBean> li = listEmp.listIterator();
        while(li.hasNext()) {
            if(li.next().getEmpID()==empID) {
                li.remove();
                flag=1;
            }
        }
        return flag == 1;

    }
    public boolean updateEmployeeByEmpID(EmployeeBean bean) {
        int flag=0;
        ListIterator<EmployeeBean> li = listEmp.listIterator();
        while(li.hasNext()) {
            if(li.next().getEmpID()==bean.getEmpID()) {
                li.set(bean);
                flag=1;
            }
        }
        return flag == 1;

    }
    public EmployeeBean findEmployeeByEmpID(int empID) {
        for(EmployeeBean bean : listEmp) {
            if(bean.getEmpID() == empID ) {
                return bean;
            }
        }
        return null;

    }}

