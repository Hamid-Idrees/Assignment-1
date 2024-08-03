public class Q3{
	public static void main (String [] args){
		
		// Marks obtained in five different subjects
		int [] marks = {80,90,75,60,100};
		
        // Calculating the aggregate marks
		int aggregateMarks = 0;
		for (int i = 0; i < marks.length; i++){
			aggregateMarks += marks[i];
		}
		
		System.out.println("Aggregate is: " + aggregateMarks);
		
		// Maximum marks that can be obtained in each subject
		int maxMarks = 100;
		int subjects = marks.length;           // 5
		int totalMarks = maxMarks * subjects;  // 100 * 5 = 500
		
		double percentage = (double) aggregateMarks / totalMarks * 100;   // formula: % = obtain / total * 100
		
		System.out.println("Percentage is: " + percentage + "%");
		
	}
}		

/*
The statement aggregateMarks += marks[i]; is a shorthand for aggregateMarks = aggregateMarks + marks[i];.

aggregateMarks = 0
Loop iteration 1: i = 0, marks[0] = 80
aggregateMarks = 0 + 80 = 80
Loop iteration 2: i = 1, marks[1] = 90
aggregateMarks = 80 + 90 = 170
Loop iteration 3: i = 2, marks[2] = 75
aggregateMarks = 170 + 75 = 245
Loop iteration 4: i = 3, marks[3] = 60
aggregateMarks = 245 + 60 = 305
Loop iteration 5: i = 4, marks[4] = 100
aggregateMarks = 305 + 100 = 405
*/
	