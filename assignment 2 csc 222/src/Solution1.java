class Student{
  //Instance Variable
  String name;
  String id;
  String age;

  int math_score;
  int social_score;
  int science_score;
  int art_score;

  // Constructor declartion of class
  public Student(String name, String id, String age, int math_score, int social_score, int science_score, int art_score){
    // Initialize instance variable values
    this.name = name; 
    this.id = id;
    this.age = age;

    this.math_score = math_score;
    this.social_score = social_score;
    this.science_score = science_score;
    this.art_score = art_score;
  }

  public String printDetails(){
    // return student details string
    return ("Name: " + this.name + ", Id: " + this.id + ", Age: " + this.age);
  }

  public String getGrade(){
    // Calculate average student score
    float average_subject_score = ((this.math_score + this.social_score + this.science_score +this.art_score) / 4);
    
    if (average_subject_score < 35.0){
      return "F";
    }else if (average_subject_score < 50.0){
      return "E";
    }else if (average_subject_score < 75.0){
      return "D";
    }else if (average_subject_score < 80.0){
      return "C";
    }else if (average_subject_score < 95.0){
      return "B";
    }else {
      return "A";
    }
  }
}


public class Solution1 {
    public static Student execute(String[] student_details_array, int[] student_results_array) {
      // Write Code Here to return the required value mentioned in the Process
      String name = student_details_array[0]; 
      String id = student_details_array[1];
      String age = student_details_array[2];

      int math_score = student_results_array[0];
      int social_score = student_results_array[1];
      int science_score = student_results_array[2];
      int art_score = student_results_array[3];

      Student student = new Student(name, id, age, math_score, social_score, science_score, art_score);

      return student;
    }
}
  

