package ir.University;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class GreatCircle {

    double latitude = 51.35117767;//lat1
    double longtitude = 35.70364567;//lon1
    double latitudeDouble;//lat2
    double longtitudeDouble;//lon2

//    double  = Double.parseDouble(f);//lat2
//    double  = Double.parseDouble(s);//lon2


    public GreatCircle(double f, double s) {
        this.latitudeDouble = f;
        this.longtitudeDouble = s;
    }
//    public  double  GreatCirclemetod() {
//        double x1 = Math.toRadians(Double.parseDouble(latitude));
//        double y1 = Math.toRadians(Double.parseDouble(f));
//        double x2 = Math.toRadians(Double.parseDouble(s));
//        double y2 = Math.toRadians(Double.parseDouble(longtitude));
////
////        /*************************************************************************
////         * Compute using law of cosines
////         *************************************************************************/
////        // great circle distance in radians
////        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
////                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
////
////        // convert back to degrees
////        angle1 = Math.toDegrees(angle1);
////
////        // each degree on a great circle of Earth is 60 nautical miles
////        double distance1 = 60 * angle1;
////
////        System.out.println(distance1 + " nautical miles");
//
//
//        /*************************************************************************
//         * Compute using Haversine formula
//         *************************************************************************/
//        double a = Math.pow(Math.sin((x2 - x1) / 2), 2)
//                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);
//
//        // great circle distance in radians
//        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));
//
//        // convert back to degrees
//        angle2 = Math.toDegrees(angle2);
//
//        // each degree on a great circle of Earth is 60 nautical miles
//        double distance2 = 60 * angle2;
//        double distance3= distance2*1.6;
////        " nautical miles"
//
//

    // Java program to calculate Distance Between
// Two Points on Earth


    public  double distance() {

        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        longtitude = Math.toRadians(longtitude);
        longtitudeDouble = Math.toRadians(longtitudeDouble);
        latitude = Math.toRadians(latitude);
        latitudeDouble = Math.toRadians(latitudeDouble);

        // Haversine formula
        double dlon = longtitudeDouble - longtitude;
        double dlat = latitudeDouble - latitude;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(latitude) * Math.cos(latitudeDouble)
                * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        double distance3 = (c * r);
        return distance3;
    }

//        // driver code
//        public static void main(String[] args) {
//            double lat1 = 53.32055555555556;
//            double lat2 = 53.31861111111111;
//            double lon1 = -1.7297222222222221;
//            double lon2 = -1.6997222222222223;
//            System.out.println(distance(lat1, lat2,
//                    lon1, lon2) + " K.M");
//        }


// This code is contributed by Prasad Kshirsagar


}

