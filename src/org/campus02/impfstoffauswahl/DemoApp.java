package org.campus02.impfstoffauswahl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoApp extends VaccinationAppointment
{
    public static void main(String[] args)
    {
        System.out.println(calculateRiskClass(67,true,true,true,true,true));
        //System.out.println(calculateRiskClass(7,false,false,false,false,false));

        System.out.println(Arrays.toString(calculateMonthAndVaccine(65, 6)));
    }
}
