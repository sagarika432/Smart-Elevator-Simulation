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
public class ElevatorManager {
    
  static  Elevator e1 ;
    static Elevator e2;
   
    ElevatorManager(Elevator e1 , Elevator e2)
    {
        this.e1 = e1;
        this.e2= e2;
    }
    
    public static  boolean addFloor (int x)
    {
        int min = Integer.MIN_VALUE;
        //int nextFloor1 = e1.nextFloor();
       // int nextFloor2 = e2.nextFloor();
        if(e1.currentFloor == x) // lift is passing by or idle on  the same floor itself
        {
            e1.addFloor(x);
            return true;
        }
        else  if(e2.currentFloor == x)  // lift is passing by or idle on  the same floor itself
        {
            e2.addFloor(x);
             System.out.println("lift2 !!!!!");
            return true;
            
        }
        // both are moving and not in idle state
        // both are moving in same  UP direction choose the nearer one 
        else  if(e1.currentFloor < x && e1.direction == Direction.UP &&e2.currentFloor < x && e2.direction == Direction.UP && !e1.floorSet.isEmpty()&& !e2.floorSet.isEmpty() )
        {
           
            if(x - e1.currentFloor < x- e2.currentFloor)
            {
                e1.addFloor(x);
            }
            else
            {
                 System.out.println("lift2 !!!!!");
                e2.addFloor(x);
            }
            
             return true;
        }
         // both are moving and not in idle state
        // both are moving in same  DOWN direction choose the nearer one 
        else  if(e2.currentFloor > x && e1.direction == Direction.DOWN &&e2.currentFloor > x && e1.direction == Direction.DOWN && !e1.floorSet.isEmpty()&& !e2.floorSet.isEmpty())
        {
            
            if(e1.currentFloor - x < e2.currentFloor - x)
            {
                e1.addFloor(x);
            }
            else
            {
                e2.addFloor(x);
            }
            return true;
        }
        // both are moving and not in idle state
        // first in up direction and second in down direction choose the best one by computing 
        else if(e1.direction == Direction.UP && e2.direction == Direction.DOWN && !e1.floorSet.isEmpty() && !e2.floorSet.isEmpty())
        {
             int calc1,calc2;
             
            if( x > e1.currentFloor )
            {
                calc1 =  x - e1.currentFloor;
            }
            else
            {
                   calc1 = 2 * e1.nextFloor() - x - e1.currentFloor;
                // calc1 = e1.nextFloor() - x  + ( e1.nextFloor() - e1.currentFloor);/*- e1.getCurrentFloor() +e1.getCurrentFloor()*/ 
            }
            
            
           if(x > e2.currentFloor)
           {
              // calc2 =  x - e2.nextFloor() + (e2.currentFloor - e2.nextFloor());
                calc2 =  x -  2 * e2.nextFloor() + e2.currentFloor;
               
           }
           else
           {
               calc2 = e2.currentFloor - x;
           } 
           if(calc1 < calc2)
           {
               e1.addFloor(x);
           }
           else
           {
                System.out.println("lift2 !!!!!");
               e2.addFloor(x);
           }
           return true;
        }
        
        
        //both are moving and not in idle state
         // first in down direction and second in up direction choose the best one by computing 
        else  if(e2.direction == Direction.UP && e1.direction == Direction.DOWN && !e1.floorSet.isEmpty() && !e2.floorSet.isEmpty())
        {
            
            int calc2 , calc1 ;
            if(x > e2.currentFloor)
            {
             calc2 = x - e2.currentFloor;
            }
            else
            {
               // calc2 = e2.nextFloor() - x +(e2.nextFloor() - e2.currentFloor);
                 calc2 =  2 * e2.nextFloor() - x  - e2.currentFloor;
                
            }
            
            
            if(x > e1.currentFloor)
            {
                //calc1 = x - e1.nextFloor() +(e1.currentFloor - e1.nextFloor());
                 calc1 = x - 2 * e1.nextFloor()  + e1.currentFloor;
            }
            else
            {
                calc1 = e1.currentFloor - x;
            }
            
                 if(calc1 <= calc2)
           {
               e1.addFloor(x);
           }
           else
           
                 {
                      System.out.println("lift2 !!!!!");
               e2.addFloor(x);
           }
                 return true;
            
            
        }
        
        // direction is diff && if anyone of them is idle or both are idle
        
        
        // first one is idle second one is moving 
      else  if(e1.floorSet.isEmpty() && !e2.floorSet.isEmpty())
        {
            int calc1 =0 ,  calc2=0 ;
            calc1 = Math.abs(x - e1.currentFloor);
            
            if(e2.direction == Direction.UP)
            {
                
                 if(x > e2.currentFloor)
            {
             calc2 = x - e2.currentFloor;
            }
            else
            {
                //calc2 = e2.nextFloor() - x +(e2.nextFloor() - e2.currentFloor);
                calc2 = 2 * e2.nextFloor() - x - e2.currentFloor;
                
            }
            }
            
            if(e2.direction == Direction.DOWN)
            {
                  if(x > e2.currentFloor)
           {
               //calc2 =  x - e2.nextFloor() + (e2.currentFloor - e2.nextFloor());
               calc2 = x - 2 * e2.nextFloor() +e2.currentFloor;
           }
           else
           {
               calc2 = e2.currentFloor - x;
           } 
                  
               
                
            }
            
              //****
                if(calc1 <calc2)
           {
               e1.addFloor(x);
           }
           else
           {
               e2.addFloor(x);
                System.out.println("lift2 !!!!!");
           }
                 return true;
            
            
            
        }
        
        // first one is moving and second one is idle 
     else if(!e1.floorSet.isEmpty() && e2.floorSet.isEmpty())
        {
             int calc1 =0 ,  calc2=0 ;
             calc2= Math.abs(x-e2.currentFloor);
             if(e1.direction == Direction.UP)
             {
                 
                  if( x > e1.currentFloor )
            {
                calc1 =  x - e1.currentFloor;
            }
            else
            {
                calc1 = 2 *e1.nextFloor() - x - e1.currentFloor;
                //calc1 = e1.nextFloor() - x  + ( e1.nextFloor() - e1.currentFloor);/*- e1.getCurrentFloor() +e1.getCurrentFloor()*/ 
            }
            
                 
             }
             
             if(e1.direction == Direction.DOWN)
             {
             } else {
                 if(x > e1.currentFloor)
                 {
                     //calc1 = x - e1.nextFloor() +(e1.currentFloor - e1.nextFloor());
                     calc1 = x - 2 * e1.nextFloor() + e1.currentFloor;
                 }
                 else
                 {
                     calc1 = e1.currentFloor - x;
                 }
            }
               //****
              if(calc1 <= calc2)
           {
               e1.addFloor(x);
           }
           else
           {
               e2.addFloor(x);
                System.out.println("lift2 !!!!!");
           }
                 return true;
             
            
        }
        // both are are idle
     else if(e1.floorSet.isEmpty() && e2.floorSet.isEmpty())
        {
            int calc1 ,calc2;
            calc2= Math.abs(x-e2.getCurrentFloor());
             calc1 = Math.abs(x - e1.getCurrentFloor());
             //****
               if(calc1 <calc2)
           {
               e1.addFloor(x);
           }
           else
           {
               e2.addFloor(x);
                System.out.println("lift2 !!!!!");
           }
                 return true;
           
        }
     else {
           return false;
     } 
        
        
        
        
        
        
        
        
        
        
        
        
          
    }
        
    }
    
    
    
    
    

