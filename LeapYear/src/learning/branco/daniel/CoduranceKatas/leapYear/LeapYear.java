package learning.branco.daniel.CoduranceKatas.leapYear;

public class LeapYear {

    public boolean isLeapYear(int year){
        boolean isLeap = false;

        if(year % 4 == 0){
            isLeap = true;
        }
        return isLeap;
    }
}
