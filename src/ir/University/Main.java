package ir.University;

import ir.University.Employee;

import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    static Univercity univercity = new Univercity();
    static String type = " ";

    public static void main(String[] args) {
        // write your code here

        /*
         1.add employee
2.employee[id] add wife or husband?
3.employee[id] is married?
4.employee[id] is invited?
5.list invited employee
         */


        System.out.println("exit = exit from program");
        System.out.println("1 = add employee ");
        System.out.println("2 = employee[id] add wife or husband?");
        System.out.println("3 = employee[id] is married?");
        System.out.println("4 = employee[id] is invited?");
        System.out.println("5 = list invited employee");
        System.out.println();
        while (true) {
            type = input.next();
            if (type.equals("exit"))
                break;
            else if (type.equals("1"))
                addEmployee();

            else if (type.equals("2"))
                addhusbandeToId();

            else if (type.equals("3")) {
                didYouMarride();
            } else if (type.equals("4")) {
                distanceInMain();
            } else if (type.equals("5")) {

                for (Employee nameE : univercity.getLIstOfemployee2()) {
                    if (nameE != null && nameE.isInvited)
                        System.out.println(nameE.getName());
                }
            }
//                System.out.println("pleas Enter name of department :");
//                String nameDepartment = scannerString();
//                for (Doctor temp : maktab.getDepByName(nameDepartment).getDoctorList()) {
//                    System.out.println("doc name :" + temp.getName());
//                }
//            }
        }
    }


    public static void addEmployee() {
        Employee employee = new Employee();

        System.out.println("pleas Enter Id of Employee ");
        int idP = scannerInt();
        System.out.println("pleas Enter name of Employee");
        String name = scannerString();
        System.out.println("pleas Enter gender of Employee");
        String G = scannerString();
        System.out.println("Is he marride ?true/false");
        boolean isMa = scannerBoolean();


        employee.setName(name);
        employee.setId(idP);
        employee.gender = G;
        employee.isMarride = isMa;

        univercity.addEmployees(employee);
        System.out.println("-----------------------------------------------------" + type);
        type = "";
        System.out.println("-----------------------------------------------------");

    }

    public static void addhusbandeToId() {


        System.out.println("Enter id Of Person :");
        int id = scannerInt();

        if (univercity.getEmployees(id) != null && univercity.getEmployees(id).isMarrid()) {
            System.out.println("Enter his Wife's Id :");
            int ide = scannerInt();

            if (univercity.getEmployees(ide) != null && univercity.getEmployees(ide).getGender().equalsIgnoreCase("W"))
                univercity.getEmployees(id).setNameAndIdOfHusband(ide);
            else System.out.println("there is not this id Or this woman is not Worker of University");

        } else System.out.println(univercity.getEmployees(id).getName() + "don't have wife");

        System.out.println("-----------------------------------------------------" + type);
        type = " ";
        System.out.println("-----------------------------------------------------");
    }

    public static void didYouMarride() {
        System.out.println("Enter id Of Person :");
        int id = input.nextInt();

        if (univercity.getEmployees(id).isMarrid())
            System.out.println("--" + univercity.getEmployees(id).getName() + " is  'Married ' ");
        else System.out.println("--" + univercity.getEmployees(id).getName() + " is  'Single ' ");
        System.out.println("-----------------------------------------------------" + type);
        type = " ";
        System.out.println("-----------------------------------------------------");
    }

    public static void distanceInMain() {

        System.out.println("pleas enter id of person for distance :");
        int id = scannerInt();
        System.out.println("pleas Enter Latitude :");
        double lat = scannerdouble();
        System.out.println("pleas Enter Longtitude :");
        double longyit = scannerdouble();
        Employee employee = univercity.getEmployees(id);
        if (employee != null) {
            employee.setLatitude(lat);
            employee.setLongtitude(longyit);
            double dist = univercity.getEmployees(id).distance();
            if ( dist <= 30 && employee.getisMarride()) {
                System.out.println("distance is less than 30 : " + dist);
                employee.setInvited(true);
            } else if (dist > 30) System.out.println("distance is more than 30 :" + dist);
            else System.out.println("distance is 30");
        }

        System.out.println("-----------------------------------------------------" + type);
        type = "";
        System.out.println("-----------------------------------------------------");
    }


    public static String scannerString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static double scannerdouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static boolean scannerBoolean() {
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }
}
