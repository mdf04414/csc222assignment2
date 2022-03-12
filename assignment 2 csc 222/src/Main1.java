// Import to display the array as a string
import java.util.Arrays;
public class Main1 {

  public static void main(String[] args) {

    // Create an object from the Solution class
    Solution1 sol = new Solution1();

    // Declare all the input arrays
    String[] student_a_details_array = {"Abhi", "123IDX", "24"};
    String[] student_b_details_array = {"Sam", "321IK", "19"};
    String[] student_c_details_array = {"Rose", "WE34X", "20"};
    String[][] array_of_student_details_array = {
      student_a_details_array,
      student_b_details_array,
      student_c_details_array,
    };

    // Declare student results for math, social, science and art
    int[] student_a_results_array = {20, 36, 52, 15};
    int[] student_b_results_array = {86, 20, 76, 62};
    int[] student_c_results_array = {92, 98, 94, 99};
    int[][] array_of_student_results_array = {
      student_a_results_array,
      student_b_results_array,
      student_c_results_array,
    };

    // Initialize the value of array length
    int array_length = array_of_student_details_array.length;
    
    // iterate over the array of input array
    for (int i = 0; i < array_length; i++) {
      // Declare and Initialize the input array
      String[] student_i_details_array = array_of_student_details_array[i];
      int[] student_i_results_array = array_of_student_results_array[i];
      
      // Declare the output_string
      Student output_student_i = sol.execute(student_i_details_array, student_i_results_array);

      // Display the output_string
      System.out.println("Input Array: " + Arrays.toString(student_i_details_array) + " - " + Arrays.toString(student_i_results_array));
      System.out.println("Output:\n  Student Details: " + output_student_i.printDetails() + ", Grade: " + output_student_i.getGrade());
      System.out.println("");
    }
  }
}
