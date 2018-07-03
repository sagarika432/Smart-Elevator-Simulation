
package proj2;

import java.util.TreeSet;
public class Elevator {
     FXMLDocumentController2 controller;
    
    private static Elevator elevator = null;
	  TreeSet<Integer> floorSet = new TreeSet<Integer>();
    int currentFloor = 0;
	
   Direction direction = Direction.UP;
    boolean lift1 = false ;
    boolean lift2 = false ;

     Elevator() {
    }

   
 void setController(FXMLDocumentController2 c )
    {
        this.controller = c;
        if(this.controller != null)
        {
            System.out.println(" yes  sssss");
        }
       
    }
 
 
    public synchronized void addFloor(int f) {
    	floorSet.add(f);
        // Notify the thread that a new request has come.
        notify();
    }

    public synchronized int nextFloor() {

        Integer floor = null;

        if (direction == Direction.UP) {
            if (floorSet.ceiling(currentFloor) != null) {
                floor = floorSet.ceiling(currentFloor);
            } else {
                floor = floorSet.floor(currentFloor);
            }
        } else {
            if (floorSet.floor(currentFloor) != null) {
                floor = floorSet.floor(currentFloor);
            } else {
                floor = floorSet.ceiling(currentFloor);
            }
        }
        if (floor == null) {
            try {
                System.out.println("Please click on floor number to simulate.");
                //Responding to notification
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Elevator moving to floor : " + floor);
            floorSet.remove(floor);
        }
        return (floor == null) ? -1 : floor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        if (this.currentFloor > currentFloor) {
            setDirection(Direction.DOWN);
        } else {
            setDirection(Direction.UP);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.currentFloor = currentFloor;
        System.out.println("Currently passing floor : " + currentFloor);
        if(lift1)
        
        {
            
            
            switch(currentFloor)
        {
            case 0:this.controller.act0(); break;
            case 1:this.controller.act1();break;
            case 2:this.controller.act2();break;
            case 3:this.controller.act3();break;
            case 4:this.controller.act4();break;
            case 5:this.controller.act5();break;
            case 6:this.controller.act6();break;
            case 7:this.controller.act7();
            
            
            
            
        }
        
        }
        else
        {
            System.out.println("lift2 !!!!!");
             switch(currentFloor)
        {
                 
            case 0:this.controller.actt0(); break;
            case 1:this.controller.actt1();break;
            case 2:this.controller.actt2();break;
            case 3:this.controller.actt3();break;
            case 4:this.controller.actt4();break;
            case 5:this.controller.actt5();break;
            case 6:this.controller.actt6();break;
            case 7:this.controller.actt7();
            
            
            
            
        }
        
        }
        
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
     public void reachPrint(int Curr)
     {
         if(lift1)
         {
              switch(Curr)
        {
            case 0:this.controller.act00(); break;
            case 1:this.controller.act11();break;
            case 2:this.controller.act22();break;
            case 3:this.controller.act33();break;
            case 4:this.controller.act44();break;
            case 5:this.controller.act55();break;
            case 6:this.controller.act66();break;
            case 7:this.controller.act77();
            
            
            
            
        }
         }
         else
         {
             switch(Curr)
        {
            case 0:this.controller.actt00(); break;
            case 1:this.controller.actt11();break;
            case 2:this.controller.actt22();break;
            case 3:this.controller.actt33();break;
            case 4:this.controller.actt44();break;
            case 5:this.controller.actt55();break;
            case 6:this.controller.actt66();break;
            case 7:this.controller.actt77();
            
            
            
            
        }
         }
         
                
     }
}
