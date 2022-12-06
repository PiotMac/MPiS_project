public class Main
{
    public static void main(String[] args)
    {
        //Creating object for each example
        RandomizerA randomA = new RandomizerA();
        RandomizerB randomB = new RandomizerB();
        RandomizerC randomC = new RandomizerC();
        PiApproximation randomPi = new PiApproximation();
        //Getting wanted values from each example
        randomA.calculate();
        randomB.calculate();
        randomC.calculate();
        randomPi.calculate();
    }
}