package ir.University;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Employee {
//    Univercity univercity = new Univercity();
    private int id;
    private String name;
    String gender;
    boolean isMarride;
    boolean isInvited;

    public boolean isInvited() {
        return isInvited;
    }

    public void setInvited(boolean invited) {
        isInvited = invited;
    }

    public String getGender() {
        return gender;
    }

    private int idOfHusband;
    private String nameOfHusband;
    //Location
    private String latitude;
    private String longtitude;

    //------------------------------


    public String getNameOfHusband() {
        return nameOfHusband;
    }

    public void setNameAndIdOfHusband(int idOfHusband) {
//        if (univercity.getEmployees(idOfHusband)!=null&& (univercity.getEmployees(idOfHusband).getGender().equalsIgnoreCase("W") ))
//        this.nameOfHusband = nameOfHusband;
            this.idOfHusband = idOfHusband;
//        else System.out.println("there is not this id Or this woman is not Worker of University");
    }

//---------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id % 1 == 0)
            this.id = id;
        else {
            System.out.println("pleas enter true :");
            setId(id);
        }
    }
//---------------------------------------------
    public boolean isMarrid() {
        for (int i = 1; i <= 10; i++) {
            if (this.isMarride && (this.gender.equals("M") || this.gender.equals("m"))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
//---------------------------------------------
public  double  distance(){
//    System.out.println("pleas Enter x :");
//    String x =scannerString();
//    System.out.println("pleas Enter y :");
//    String y =scannerString();
    GreatCircle greatCircle = new GreatCircle(latitude,longtitude);
    double distace= greatCircle.GreatCirclemetod();
    return distace;
//    if (distace<30) System.out.println("distance is less than 30 : "+distace);
//    else if (distace>30) System.out.println("distance is more than 30 :"+distace);
//    else System.out.println("distance is 30");

}




    //--------------------------------------

    public int getIdOfWife() {
        return idOfHusband;
    }

    public int getIdOfHusband() {
        return idOfHusband;
    }

    public void setIdOfHusband(int idOfHusband) {
        this.idOfHusband = idOfHusband;
    }

    public void setIdOfWife(int idOfWife) {
        this.idOfHusband = idOfWife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getisMarride() {
        return isMarride;
    }

    public void setisMarride(boolean marride) {
        isMarride = marride;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }
    //Calculate Location

//    public void distance() {
//
//
//    }
    public static String scannerString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static int scannerInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static boolean scannerBoolean() {
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }

}












