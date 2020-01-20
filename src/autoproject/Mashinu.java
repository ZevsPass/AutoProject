/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoproject;

/**
 *
 * @author Edward
 */
public class Mashinu {
   private String manufacture;
   private String model;
   private int year;
   private double motorCapacity;
   private String ;
   
   public Mashinu (String manufacture, String model, int year, double motorCapacity, enum type) {
       this.manufacture=manufacture;
       this.model=model;
       this.year;
       this.type=type;
   }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(double motorCapacity) {
        this.motorCapacity = motorCapacity;
    }
   
   public String toString(manufacture, model, year, motorCapacity, type){
         return ("name \t" + getManufacture() + "\n"
                + "surname \t" +  getModel() + "\n"
                + " age \t" + getYear() + "\n"
                + "Birthday \t" + getMotorCapacity() + "\n"
                + "Birthday \t" + this.type);
               
   }
  
    
}
