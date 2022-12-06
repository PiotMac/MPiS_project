import java.awt.geom.Point2D;
import java.util.Random;
import java.lang.Math;
public class PiApproximation
{
    private static final Random random = new Random();
    Point2D.Double point;
    int counter = 0;
    double average = 0.0;
    double approx = 0.0;
    public PiApproximation() {}
    public void calculate()
    {
        //CHOOSING n
        for(int n = 50; n <= 5000; n = n + 50)
        {
            //FOR EACH n DOING 50 TESTS
            for(int k = 1; k <= 50; k++)
            {
                int j = 1;
                //CREATING n POINTS
                while(j <= n)
                {
                    point = new Point2D.Double();
                    //First coordinate: 0 <= x <= 2. Second coordinate: 0 <= y <= 2.
                    //We are creating a circle with the radius r = 1 and the center in the point (1,1).
                    point.setLocation(random.nextDouble(0.0,2.0), random.nextDouble(0.0,2.0));
                    //(x - 1)^2 + (y - 1)^2 <= 1  - circle equation
                    if(Math.pow(point.getX() - 1.0, 2.0) + Math.pow(point.getY() - 1.0, 2.0) <= 1.0)
                    {
                        //Counting how many points are "in" the circle.
                        counter++;
                    }
                    j++;
                }
                //(b-a)M = (2 - 0) * 2 = 4
                approx = ((double) counter / n) * 4.0;
                //Printing 50 approximations
                System.out.println(approx);
                average += approx;
                counter = 0;
            }
            //Counting the average value of 50 approximations.
            average = average / 50.0;
            //The 51st value is the average approximation.
            System.out.println(average);
            average = 0.0;
        }
    }
}
