Problem Statement

Complete the code present in execute() for the Solution class for the following conditions

Input:
Ex:
vehicle_details_array => [100.0, 25.0, 15.0]
distance => 50.0
fuel_price => 120.0
Output:
Ex:
printDetails() => "Max Speed: 100.0 Miles/Hour, Mileage: 25.0 Miles/Liter, Max Fuel Capacity: 15.0 Liter"
costOfTravel() => 240.0
Process: Given a string array (vehicle_details_array) which contains vehicle max_speed, mileage and mac_fuel_capacity respectively. The array is given as input to the execute() method which has to use the values from the input array and return an object of vehicle class which is mentioned below.
Create a Vehicle class that is not derived from any other class in this program
Vehicle class will have the following attributes
max_speed: This will be the maximum speed (Miles/Hour) of the vehicle. Type: double, No default value set.
mileage: This will be the mileage ((Miles/Liter)) of the vehicle. Type: double, No default value set.
max_fuel_capacity: This will be the maximum fuel that the vehicle can store (Liter) in the vehicle. Type: double, No default value set.
Vehicle class will have the following methods
printDetails(): This method takes no argument value as input and will be used to return a string which represents the details of the vehicle mainly - name, id and age in the following string format
Max Speed: {max_speed} Miles/Hour, Mileage: {mileage} Miles/Liter, Max Fuel Capacity: {max_fuel_capacity} Liter
Example-1:
  In Input: vehicle_details_array => [100.0, 25.0, 15.0]
  100.0 -> max_speed
  25.0 -> mileage
  15.0 -> max_fuel_capacity
  Hence string returned from printDetails() method will be
  => Max Speed: 100.0 Miles/Hour, Mileage: 25.0 Miles/Liter, Max Fuel Capacity: 15.0 Liter
  ​
Example-2:
  In Input: vehicle_details_array => [150.0, 50.0, 20.5]
  150.0 -> max_speed
  50.0 -> mileage
  20.5 -> max_fuel_capacity
  Hence string returned from printDetails() method will be
  => Max Speed: 150.0 Miles/Hour, Mileage: 50.0 Miles/Liter, Max Fuel Capacity: 20.5 Liter

costOfTravel(distance, fuel_price) : This method takes two argument values as input, distance and fuel_price both of which are of type double and will return a double value which the cost to cover the distance in the current vehicle
240.0
Example-1:
  Given the vehicle has the following properties
  - Max Speed: 100.0 Miles/Hour, Mileage: 25.0 Miles/Liter, Max Fuel Capacity: 15.0 Liter
  where
  50.0 -> distance
  120.0 -> fuel_price
  Hence it will cost 240.0 for the entire trip which is the value returned by this method
  => 240.0
  ​
Example-2:
  Given the vehicle has the following properties
  - Max Speed: 150.0 Miles/Hour, Mileage: 50.0 Miles/Liter, Max Fuel Capacity: 20.5 Liter
  where
  250.0 -> distance
  70.0 -> fuel_price
  Hence it will cost 240.0 for the entire trip which is the value returned by this method
  => 350.0

Rules to follow:

The output should be a data structure specifically mentioned in the above question.
Inbuilt functions which require no import and Datatype methods can be used to solve this problem but No arbitray functions or library can be used.
No other function name can be defined/declared than the ones asked to be declared in any of the questions presented in this readme.
The code you write should pass all the test cases given. There will be hidden test cases to check the accuracy of your solution.
Commands

# Change directory into the programming problem
cd Assignment-2/Problem-2/
# Execute the java program
rm *.class; javac Main.java && java Main

TEST CASES:

Input Array: [100.0, 25.0, 15.0] - Distance:50.0, Fuel Price: 120.0
Output:
  Vehicle Details: Max Speed: 100.0 Miles/Hour, Mileage: 25.0 Miles/Liter, Max Fuel Capacity: 15.0 Liter, Cost of Travel: $240.000
  ​
Input Array: [150.0, 50.0, 20.5] - Distance:250.0, Fuel Price: 70.0
Output:
  Vehicle Details: Max Speed: 150.0 Miles/Hour, Mileage: 50.0 Miles/Liter, Max Fuel Capacity: 20.5 Liter, Cost of Travel: $350.0
  ​
Input Array: [210.5, 75.0, 25.0] - Distance:40.5, Fuel Price: 80.0
Output:
  Vehicle Details: Max Speed: 210.5 Miles/Hour, Mileage: 75.0 Miles/Liter, Max Fuel Capacity: 25.0 Liter, Cost of Travel: $43.2

Hint:

You can use if statements and class Vehicle with constructor to take all the values from both the arrays and design the solution for this problem since these are inbuilt methods which do not require any imports.
You can come up with a solution that does not use this hint but it should satisfy all the TEST CASES.