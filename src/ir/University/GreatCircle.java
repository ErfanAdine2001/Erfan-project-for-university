package ir.University;

import java.util.Scanner;

public class GreatCircle {
    String latitude = "35.7036";
    String longtitude = "51.3515";
    String f;
    String s;

    public GreatCircle(String f, String s){
        this.f=f;
        this.s=s;
    }
    public  double  GreatCirclemetod() {
        double x1 = Math.toRadians(Double.parseDouble(latitude));
        double y1 = Math.toRadians(Double.parseDouble(f));
        double x2 = Math.toRadians(Double.parseDouble(s));
        double y2 = Math.toRadians(Double.parseDouble(longtitude));
//
//        /*************************************************************************
//         * Compute using law of cosines
//         *************************************************************************/
//        // great circle distance in radians
//        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
//                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
//
//        // convert back to degrees
//        angle1 = Math.toDegrees(angle1);
//
//        // each degree on a great circle of Earth is 60 nautical miles
//        double distance1 = 60 * angle1;
//
//        System.out.println(distance1 + " nautical miles");


        /*************************************************************************
         * Compute using Haversine formula
         *************************************************************************/
        double a = Math.pow(Math.sin((x2 - x1) / 2), 2)
                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);

        // great circle distance in radians
        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle2 = Math.toDegrees(angle2);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance2 = 60 * angle2;
        double distance3= distance2*1.6;
//        " nautical miles"
        return (distance3 );
    }
}
