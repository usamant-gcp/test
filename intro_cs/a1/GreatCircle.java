public class GreatCircle
{
    public static void main(String[] args)
    {
        // Input x1 y1 x2 y2 
        //  (x1, y1) = (Latitude, Longitude) in degrees of place1
        //  (x2, y2) = (Latitude, Longitude) in degrees of place2
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // Distance is calculated using the Haversine formula
        // https://en.wikipedia.org/wiki/Haversine_formula

        double p1 = Math.sin( (x2 - x1) / 2);
        double p2 = Math.sin( (y2 - y1) / 2);
        double p3 = Math.cos(x1);
        double p4 = Math.cos(x2);
        double RADIUS_EARTH = 6371.0; // kms
        double p5 = Math.sqrt( p1 * p1  + p3 * p4 * p2 * p2 );
        double distance = 2 * RADIUS_EARTH * Math.asin(p5);

        System.out.println(distance + " kilometers");
    }
}