
package testvehicle;


class TwoWheeler implements IVehicle,IVehicle2 {
 String ID;   
 String type;          
public TwoWheeler(String ID, String type){      
 this.ID = ID;     
 this.type = type;    }

    @Override
 public void start() {            
 System.out.println("Starting the "+ type);    }

    @Override        
    public void accelerate(int speed) {        
System.out.println("Accelerating at speed:"+speed+ " kmph");    }       
    @Override
 public void brake() {      
  System.out.println("Applying brakes");
    }
   
    @Override       
    public void stop() {       
 System.out.println("Stopping the "+ type);            } 
  
public void displayDetails(){       
System.out.println("Vehicle No.: "+ STATEID+ " "+ ID);       
System.out.println("Vehicle Type.: "+ type);   
 } }

public class TestVehicle {
             
public static void main(String[] args){              
             
                   
               
    TwoWheeler objBike = new TwoWheeler(args[0], args[1]);                    
                    
 objBike.displayDetails();                   
 objBike.start();                    
objBike.accelerate(Integer.parseInt(args[2]));
   objBike.brake();                        objBike.stop();                          }              
     
    
 }  
