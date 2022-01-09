package learning.branco.daniel.CoduranceKatas.SimpleMarsRover;

public class MarsRover {
    public String execute (String command){
        Rover rover1 = new Rover();
        char[] individualCommands = command.toCharArray();
        for(char movement : individualCommands){
            switch (movement){
                case 'L':
                    rover1.rotateRover("Rotate Left");
                    break;
                case 'R':
                    rover1.rotateRover("Rotate Right");
                    break;
                case 'M':
                    rover1.moveRover();
                    break;
                default:
                    return null;
            }
        }

        return rover1.getRoverPositionAndDirection();
    }
}
