import java.awt.geom.Point2D;
import java.util.Random;
import java.lang.Math;
public class RandomizerB
{
    private static final Random random = new Random();
    Point2D.Double point;
    int counter = 0;
    double average = 0.0;
    double approx = 0.0;
    public RandomizerB() {}
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
                    //First coordinate: 0 <= x <= PI. Second coordinate: 0 <= y <= 1.
                    //Max y = 1 because max(f(x)) = f(PI/2) = 1.
                    point.setLocation(random.nextDouble(0.0,Math.PI), random.nextDouble(0.0,1.0));
                    //y <= f(x)=sin(x)
                    if(point.getY() <= Math.sin(point.getX()))
                    {
                        //Counting how many points are "under" the chart.
                        counter++;
                    }
                    j++;
                }
                //(b-a)M = (PI - 0) * 1 = PI
                approx = ((double) counter / n) * Math.PI;
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
