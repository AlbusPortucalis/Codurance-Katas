package learning.branco.daniel.CoduranceKatas.FizzBuzz;

public class FizzBuzz {

    public String convert(int number){

    if(number % 5 == 0) {
        return "Buzz";
    } else if(number % 3 == 0){
        return "Fizz";
    }

        return String.valueOf(number);
    }
}
