package learning.branco.daniel.CoduranceKatas.SimpleMarsRover;

class Rover {

    /*Array that keeps a record of the direction that the rover is facing.
    1 represents the faced direction, 0 the other direction {North, East, South, West}*/
    private int[] roverFacedDirection = {1,0,0,0};

    /*Array that shows the rover position on the grid 10x10
    1 represents his position, 0 the available positions
    The first sub-array is the x-axis of the grid where the index 0 represents the west
    and the index 9 represents the East
    The second sub-array is the y-axis of the grid where the index 0 represents the South
    and the index 9 represents the North
     */
    private int[][] roverPositionOnTheGrid = {{1,0,0,0,0,0,0,0,0,0},{1,0,0,0,0,0,0,0,0,0}};

    //Method that rotates the rover, can receive two directions Left or Right
    void rotateRover(String direction){

    }

    /*Method that moves the rover
    if it reaches the end of grid it must ignore the move commands
    until a new valid direction is supplied
    */
    boolean moveRover(){
        return false;
    }

    //Returns a int Array with the rover position on the grid
    private int[] getRoverPosition(){
        return new int[2];
    }

    //Returns the direction the rover is facing
    private String getRoverFacedDirection(){
        int indexDirectionFaced = 0;
        for(int i = 0; i < 4; i++){
            if(roverFacedDirection[i] == 1){
                indexDirectionFaced = i;
                break;
            }
        }

        switch (indexDirectionFaced){
            case 0:
                return "north";
            case 1:
                return "East";
            case 2:
                return "South";
            default:
                return "West";
        }
    }
}
