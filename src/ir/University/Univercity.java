package ir.University;

import java.util.Locale;

public class Univercity {

    private String name;
    int count = 0;
    Employee[] employees = new Employee[10];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //add Employee , get Employee

    public Employee getEmployees(int id) {
        for (int i = 0; i < 10; i++) {

            if (employees[i]!=null && employees[i].getId()==id)
                return employees[i];

        }
        return null;
    }
    public Employee getLIstOfemployee(){
        for (int i = 0; i < 10; i++) {
            if (employees[i].getGender().equals("M") && employees[i].isMarride && employees[i].distance()<30)
                return employees[i];

        }
        return  null;
    }
    //-----



//------
    public Employee[] getLIstOfemployee2() {

        return employees;

    }





    public void addEmployees (Employee employees){
            this.employees[count++] = employees;
        }
    }

