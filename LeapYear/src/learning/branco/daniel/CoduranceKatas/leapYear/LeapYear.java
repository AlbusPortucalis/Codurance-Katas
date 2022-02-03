package learning.branco.daniel.CoduranceKatas.leapYear;

public class LeapYear {

    public boolean isLeapYear(int year){
        boolean isLeap = true;

        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
            isLeap = false;
        }
        return isLeap;
    }
}
