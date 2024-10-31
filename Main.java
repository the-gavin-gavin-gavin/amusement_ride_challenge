/*
DO NOT CHANGE ANYTHING OTHER THAN THE CONTENTS
OF THIS METHOD.  DO NOT CHANGE ANY CODE IN THE MAIN
METHOD.  IF YOU GET ALL PASSES (THERE ARE 8 TESTS),
         YOU WILL GET A PERFECT SCORE.  NO USE OF AI FOR THIS
         PROJECT.
*/

public class Main
{
    public static void main (String [] args)
    {
        AmusementRide [] ar = {new AmusementRide(9, 135.0, true),
                                new AmusementRide(8, 138.5, false),
                                new AmusementRide(9, 145.0, true),
                                new AmusementRide(8, 148.0, false),
                                new AmusementRide(10, 135.5, true),
                                new AmusementRide(11, 136.2, false),
                                new AmusementRide(14, 146.4, true),
                                new AmusementRide(10, 140.0, false)};

        for (int i = 0; i < ar.length; i++)
        {
            if (i != (ar.length - 1))
            {
                if (ar[i].canRide() == false)
                {
                    System.out.println("Test case " + (i + 1) + ": PASS");
                }
                else
                {
                    System.out.println("Test case " + (i + 1) + ": FAIL");
                }
            }
        }
        if (ar[ar.length - 1].canRide() == true)
        {
            System.out.println("Test case " + ar.length + ": PASS");
        }
        else
        {
            System.out.println("Test case " + ar.length + ": FAIL");
        }
    }
}