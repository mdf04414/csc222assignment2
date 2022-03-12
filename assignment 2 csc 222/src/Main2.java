// Import to display the array as a string
import java.util.Arrays;

public class Main2 {

  public static void main(String[] args) {

    // Create an object from the Solution class
    Solution2 sol = new Solution2();

    // Declare all the input arrays
    double[] vehicle_a_details_array = {100.0, 25.0, 15.0};
    double[] vehicle_b_details_array = {150.0, 50.0, 20.5};
    double[] vehicle_c_details_array = {210.5, 75.0, 25.0};
    double[][] array_of_vehicle_details_array = {
      vehicle_a_details_array,
      vehicle_b_details_array,
      vehicle_c_details_array,
    };

    // Declare vehicle travel_details for distance and fuel price
    double[] vehicle_a_travel_details_array = {50.0, 120};
    double[] vehicle_b_travel_details_array = {250.0, 70};
    double[] vehicle_c_travel_details_array = {40.5, 80};
    double[][] array_of_vehicle_travel_details_array = {
      vehicle_a_travel_details_array,
      vehicle_b_travel_details_array,
      vehicle_c_travel_details_array,
    };

    // Initialize the value of array length
    int array_length = array_of_vehicle_details_array.length;
    
    // iterate over the array of input array
    for (int i = 0; i < array_length; i++) {
      // Declare and Initialize the input array
      double[] vehicle_i_details_array = array_of_vehicle_details_array[i];
      double[] vehicle_i_travel_details_array = array_of_vehicle_travel_details_array[i];
      double distance = vehicle_i_travel_details_array[0];
      double fuel_price = vehicle_i_travel_details_array[1];
      
      // Declare the output_string
      Vehicle output_vehicle_i = sol.execute(vehicle_i_details_array);

      // Display the output_string
      System.out.println("Input Array: " + Arrays.toString(vehicle_i_details_array) + " - Distance:" + distance + ", Fuel Price: " + fuel_price);
      System.out.println("Output:\n  Vehicle Details: " + output_vehicle_i.printDetails() + ", Cost of Travel: $" + output_vehicle_i.costOfTravel(distance, fuel_price));
      System.out.println("");
    }
  }
}
