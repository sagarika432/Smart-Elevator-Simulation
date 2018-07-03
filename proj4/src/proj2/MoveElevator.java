/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

/**
 *
 * @author ASHOK
 */
public class MoveElevator implements Runnable {
   
    Elevator elevator ;
    MoveElevator(Elevator e)
    {
        this.elevator = e;
    }
    @Override
	public void run() {
		while (true) {
           // Elevator elevator = Elevator.getInstance();
            if(elevator != null && elevator.controller != null)
            {
            int floor = elevator.nextFloor();
            int currentFloor = elevator.getCurrentFloor();
            if (floor >= 0) {
                if (currentFloor > floor) {
                    while (currentFloor > floor) {
                    	int oldFloor = floor;
                    	floor = elevator.getCurrentFloor();
                    	if(oldFloor != floor){
                    		elevator.addFloor(oldFloor);
                    	}
                    	elevator.setCurrentFloor(--currentFloor);
                    }
                } else {
                    while (currentFloor < floor) {
                    	int oldFloor = floor;
                       
                        
                    	floor = elevator.getCurrentFloor();
                    	if(oldFloor != floor){
                    		elevator.addFloor(oldFloor);
                    	}
                        elevator.setCurrentFloor(++currentFloor);
                       //  System.out.println("oldfloor =" + oldFloor );
                         // System.out.println("Currfloor =" + currentFloor );
                         //  System.out.println("floor =" + floor );
                    }
                }
            }
            if(currentFloor==floor){
            	System.out.println("The Elevator reached floor " + floor + ".");
                elevator.reachPrint(floor);
               
                
                
                
                
                
            }
        }
                }	
	}
    
    
}
