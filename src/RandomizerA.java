import java.awt.geom.Point2D;
import java.util.Random;
import java.lang.Math;
public class RandomizerA
{
    private static final Random random = new Random();
    Point2D.Double point;
    int counter = 0;
    double average = 0.0;
    double approx = 0.0;
    public RandomizerA() {}
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
                    //First coordinate: 0 <= x <= 8. Second coordinate: 0 <= y <= 2.
                    //Max y = 2 because max(f(x)) = f(8) = 2.
                    point.setLocation(random.nextDouble(0.0,8.0), random.nextDouble(0.0,2.0));
                    //y <= f(x)=x^(1/3)
                    if(point.getY() <= Math.pow(point.getX(), 1.0/3.0))
                    {
                        //Counting how many points are "under" the chart.
                        counter++;
                    }
                    j++;
                }
                //(b-a)M = (8 - 0) * 2 = 16
                approx = ((double) counter / n) * 16.0;
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
