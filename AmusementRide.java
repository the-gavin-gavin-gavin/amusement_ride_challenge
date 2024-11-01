// test
public class AmusementRide
{
    // instance variables
    int age;
    double height; // height in cm
    boolean healthCondition; // true for health condition present, false if no health condition

    public AmusementRide(int a, double h, boolean hC)
    {
        age = a;
        height = h;
        healthCondition = hC;
    }

    public boolean canRide()
    {
        if (age>=10) //checking for above 10 years old
        {
            if (height>=140)//checking for above 140cm
            {
                if (healthCondition == false)//checking for having no health conditions
                {
                    return true;//allowing person to attend the ride
                }
            }
        }
        return false;//if the person fails to pass any of the conditionals, returns they cannot go on the ride
    }
}