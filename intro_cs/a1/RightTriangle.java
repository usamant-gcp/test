public class RightTriangle
{
    public static void main(String[] args)
        {
            int a1 = Integer.parseInt(args[0]);
            int a2 = Integer.parseInt(args[1]);
            int a3 = Integer.parseInt(args[2]);
            boolean arePositive = (( a1 > 0 ) && ( a2 > 0 )  && ( a3 > 0));
            boolean sumSquares  = ( ( a1 * a1 == a2 * a2 + a3 * a3 ) ||
                                      ( a2 * a2 == a1 * a1 + a3 * a3 ) ||
                                      ( a3 * a3 == a1 * a1 + a2 * a2 ) );
            boolean rightTriangle = ( arePositive && sumSquares );
            System.out.println(rightTriangle);            
    }
}