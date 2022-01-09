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

    //Method that rotates the rover, can receive two directions "Rotate Left" or "Rotate Right"
    void rotateRover(String direction){

        for(int i = 0; i < 4; i++){
            if(roverFacedDirection[i] == 1 && direction.equals("Rotate Left")){
                roverFacedDirection[i] = 0;
                if(i - 1 >= 0){
                    roverFacedDirection[i - 1] = 1;
                    break;
                } else {
                    roverFacedDirection[roverFacedDirection.length - 1] = 1;
                    break;
                }
            } else if(roverFacedDirection[i] == 1 && direction.equals("Rotate Right")){
                roverFacedDirection[i] = 0;
                if(i + 1 >= roverFacedDirection.length){
                    roverFacedDirection[0] = 1;
                    break;
                } else {
                    roverFacedDirection[i + 1] = 1;
                    break;
                }
            }
        }


    }

    /*Method that moves the rover
    if it reaches the end of grid it must wrap around
    */
    boolean moveRover(){
        int[] actualRoverPosition = getRoverPosition();
        int[] newRoverPosition = actualRoverPosition;
        String roverFacedDirection = getRoverFacedDirection();
        int transverseIndexPosition = actualRoverPosition[0];
        int longitudinalIndexPosition = actualRoverPosition[1];

        switch (roverFacedDirection){
            case "North":
                longitudinalIndexPosition += 1;
                break;
            case "East":
                transverseIndexPosition += 1;
                break;
            case "South":
                longitudinalIndexPosition -= 1;
                break;
            case "West":
                transverseIndexPosition -= 1;
                break;
            default:
                return false;
        }

        //Checks and updates the rover position if it needs to wrap-around
        if(transverseIndexPosition >= roverPositionOnTheGrid[0].length){
            transverseIndexPosition = 0;
        } else if (transverseIndexPosition < 0){
            transverseIndexPosition = roverPositionOnTheGrid[0].length - 1;
        } else if (longitudinalIndexPosition >= roverPositionOnTheGrid[1].length){
            longitudinalIndexPosition = 0;
        } else if (longitudinalIndexPosition < 0){
            longitudinalIndexPosition = roverPositionOnTheGrid[1].length - 1;
        }

        newRoverPosition[0] = transverseIndexPosition;
        newRoverPosition[1] = longitudinalIndexPosition;

        setRoverPositionOnTheGrid(actualRoverPosition, newRoverPosition);

        return true;
    }

    /*Returns a int Array with the indexes of the rover position on the grid
      {x,y} where x is the transverse axis (West to East) and y the longitudinal axis (South to North)*/
    private int[] getRoverPosition(){
        int[] roverPosition = {0,0};

        for(int i = 0; i < roverPositionOnTheGrid.length; i++){
            for(int j = 0; j < roverPositionOnTheGrid[i].length; j++){
                if (roverPositionOnTheGrid[0][j] == 1) {
                    roverPosition[0] = j;
                    break;
                } else if(roverPositionOnTheGrid[1][j] == 1){
                    roverPosition[1] = j;
                    break;
                }
            }
        }

        return roverPosition;
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
                return "North";
            case 1:
                return "East";
            case 2:
                return "South";
            case 3:
                return "West";
            default:
                return "Unknown";
        }
    }

    private void setRoverPositionOnTheGrid(int[] oldPosition, int[] newPosition){
        roverPositionOnTheGrid[0][oldPosition[0]] = 0;
        roverPositionOnTheGrid[0][newPosition[0]] = 1;
        roverPositionOnTheGrid[1][oldPosition[1]] = 0;
        roverPositionOnTheGrid[1][newPosition[1]] = 1;

    }
}
