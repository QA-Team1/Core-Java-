
public class StuResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int english=60, physics=64, chemistry=55, maths=85, computer=89;
		double total,average,percentage;
		System.out.println("Enter marks of five subjects");
		System.out.println("english");
		System.out.println("physics");
		System.out.println("chemistry");
		System.out.println("computer");
		
		 total = english + physics + chemistry + maths + computer;
		 average = (total / 5);
		 percentage = (total / 500) *100;
		    
		    System.out.println("Total marks ="+total);
		    System.out.println("Average marks = "+average);
		    System.out.println("Percentage = "+percentage);
		
		

	}

}
