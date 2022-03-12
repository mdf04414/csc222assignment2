class Vehicle{
    //Instance Variable
    double max_speed;
    double mileage;
    double max_fuel_capacity;
  
    // Constructor declartion of class
    public Vehicle(double max_speed, double mileage, double max_fuel_capacity){
      // Initialize instance variable values
      this.max_speed = max_speed;
      this.mileage = mileage;
      this.max_fuel_capacity = max_fuel_capacity;
    }
  
    public String printDetails(){
      return ("Max speed: " + this.max_speed + " Miles/Hour, Mileage: " + this.mileage + " Miles/Liter, Max fuel capacity: " + max_fuel_capacity + " Liter");
    }
  
    public double costOfTravel(double distance, double fuel_price){
      double min_fuel_capacity = distance / this.mileage;
      double cost_of_travel = min_fuel_capacity * fuel_price;
      return cost_of_travel;
    }
  
  }
  
  
  public class Solution2 {
      public static Vehicle execute(double[] vehicle_details_array) {
        // Write Code Here to return the required value mentioned in the Process
        double max_speed = vehicle_details_array[0];
        double mileage = vehicle_details_array[1];
        double max_fuel_capacity = vehicle_details_array[2];

        Vehicle vehicle = new Vehicle(max_speed, mileage, max_fuel_capacity);

        return vehicle;
      }
  }
  
  
  