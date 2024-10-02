package eud.ict.shape;



public class Grade {
	   
	   private int kor, eng, math;
	  
	   private String name;
	   
	   public Grade(String name, int kor, int eng, int math) {
	      this.name = name;
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math;      
	   }
	   
	   public String getName() {
		   return name;
	   }
	   
	   public char getGrade() {
	      char grade = '가';
	      
	      double avg = (kor + eng + math) / 3.0;
	      
	      if (avg >= 90) {
	         grade = '수';
	      } else if (avg >= 80) {
	         grade = '우';
	      } else {
	         grade = '가';
	      }

	      return grade;
	   }
	   
	   public double getAvg() {
	      return  (kor + eng + math) / 3.0;
	   }
	   
	   
	}