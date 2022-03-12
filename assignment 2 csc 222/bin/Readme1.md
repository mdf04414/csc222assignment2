Problem Statement

Complete the code present in execute() for the Solution class for the following conditions

Input:
Ex:
student_details_array => [Abhi, 123IDX, 24]
student_results_array => [20, 36, 52, 15]
Output:
Ex:
printDetails() => "Name:Abhi, Id:123IDX, Age:24"
getGrade() => "F"
Process: Given a string array (student_details_array) which contains student name, id and age respectively along with an integer array (student_results_array) which contains students results for math, social, science and art, These arrays are given as input to the execute() method which has to use the two values from the two input arrays and return an object of Student class which is mentioned below.
Create Student class which is not derived from any other class in this program
Student class will have the following attributes
name: This will be the name of the student. Type: string, No default value set.
id: This will be the id of the student, random alphanumerics. Type: string, No default value set.
age: This will be the age of the student. Type: string, No default value set.
math_score: This will be the marks scored by the respective student in math subject. Type: Integer, No default value set.
social_score: This will be the marks scored by the respective student in social subject. Type: Integer, No default value set.
science_score: This will be the marks scored by the respective student in science subject. Type: Integer, No default value set.
art_score: This will be the marks scored by the respective student in art subject. Type: Integer, No default value set.
Student class will have the following methods
printDetails() : This method takes no argument value as input and will be used to return a string which represents the details of the student mainly - name, id and age in the following string format
Name:{name}, Id:{id}, Age:{age}
Example-1:
  In Input: student_details_array => [Abhi, 123IDX, 24]
  "Abhi" -> name
  "123IDX" -> id
  "24" -> age
  Hence string returned from printDetails() method will be
  => Name:Abhi, Id:123IDX, Age:24
  ​
Example-2:
  In Input: student_details_array => [Sam, 321IK, 19]
  "Sam" -> name
  "321IK" -> id
  "19" -> age
  Hence string returned from printDetails() method will be
  => Name:Sam, Id:321IK, Age:19

getGrade() : This method takes no argument value as input and will return a string value which represents a grade given for the respective average score in the subjects math, social, science and art, which will be from a group of grade
A(avg >= 95), B(avg < 95), C(avg < 80), D(avg < 75), E (avg < 50), F (avg < 35)
A or B or C or D or E or F
Example-1:
  In Input: student_results_array - [20, 36, 52, 15]
  20 -> marks scored in math
  36 -> marks scored in social
  52 -> marks scored in science
  15 -> marks scored in art
  average = (20+36+52+12) / 4 => 30
  Since 30 is below 35 we return grade 
  => F
  ​
Example-2:
  In Input: student_results_array - [86, 20, 76, 62]
  86 -> marks scored in math
  20 -> marks scored in social
  76 -> marks scored in science
  62 -> marks scored in art
  average = (86+20+76+62) / 4 => 61
  Since 61 is below 75 we return grade 
  => D

Rules to follow:

The output should be a data structure specifically mentioned in the above question.
Inbuilt functions which require no import and Datatype methods can be used to solve this problem but No arbitray functions or library can be used.
No other function name can be defined/declared than the ones asked to be declared in any of the questions presented in this readme.
The code you write should pass all the test cases given. There will be hidden test cases to check the accuracy of your solution.
Commands

# Change directory into the programming problem
cd Assignment-2/Problem-1/
# Execute the java program
rm *.class; javac Main.java && java Main

TEST CASES:

Input Array: [Abhi, 123IDX, 24] - [20, 36, 52, 15]
Output:
  Student Details: Name:Abhi, Id:123IDX, Age:24, Grade: F
  ​
Input Array: [Sam, 321IK, 19] - [86, 20, 76, 62]
Output:
  Student Details: Name:Sam, Id:321IK, Age:19, Grade: D
  ​
Input Array: [Rose, WE34X, 20] - [92, 98, 94, 99]
Output:
  Student Details: Name:Rose, Id:WE34X, Age:20, Grade: A

Hint:

You can use if statements and class Student with constructor to take all the values from both the arrays and design the solution for this problem since these are inbuilt methods which do not require any imports.
You can come up with a solution that does not use this hint but it should satisfy all the TEST CASES.