package org.campus02.impfstoffauswahl;

public class VaccinationAppointment
{
    public static int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson, boolean
            workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor)
    {
        int risikoFaktor = 0;
        risikoFaktor += age / 10;

        if(majorIllness)
            risikoFaktor += 3;

        if(contactOfPregnantPerson)
            risikoFaktor += 2;

        if(workingInHealthSector)
            risikoFaktor += 2;

        if(workingInEducationSector)
            risikoFaktor += 1;

        if(baseRiskFactor)
            risikoFaktor += 1;

        return risikoFaktor;
    }

    public static String[] calculateMonthAndVaccine(int age, int riskClass)
    {
        String[] monthAndVaccine = new String[2];
        if(riskClass >= 10)
        {
            monthAndVaccine[0] = "January";
        }
        else if (riskClass == 9)
        {
            monthAndVaccine[0] = "February";
        }
        else if (riskClass == 7 || riskClass == 8)
        {
            monthAndVaccine[0] = "March";
        }
        else if (riskClass == 6)
        {
            monthAndVaccine[0] = "April";
        }
        else if (riskClass == 4 || riskClass == 5)
        {
            monthAndVaccine[0] = "May";
        }
        else if (riskClass == 2 || riskClass == 3)
        {
            monthAndVaccine[0] = "June";
        }
        else
        {
            monthAndVaccine[0] = "July";
        }

        if(age >= 18 && age < 50)
        {
            monthAndVaccine[1] = "AstraZeneca";
        }
        else if(age < 65 && age >= 50)
        {
            monthAndVaccine[1] = "Moderna";
        }
        else
        {
            monthAndVaccine[1] = "Pfizer";
        }

        return monthAndVaccine;
    }
}
