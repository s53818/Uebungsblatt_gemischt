package org.campus02.recursion;

public class WalkingDemoApp
{
    public static void main(String[] args)
    {
        walk(5,1);
    }

    public static void walk(int countSteps, int currentStep)
    {
        if (countSteps == 0)
        {
            return;
        }
        System.out.println("Step forward: " + currentStep);
        walk(countSteps-1, currentStep+1);
        if((currentStep-1) == 0)
        {
            return;
        }
        System.out.println("Step backward: " + (currentStep-1));
    }
}
