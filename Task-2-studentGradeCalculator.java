import java.util.Scanner;
public class studentGrade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects : ");
        int subjects = sc.nextInt();

        int totalMarks = 0;
        for(int i=1; i<=subjects; i++){
            int marks;

            while(true){
                System.out.print("Enter marks for Subject"+i+" : ");
                marks = sc.nextInt();

                if(marks>=0 && marks<=100){
                    break;
                }
                System.out.println("Invalid input marks must be between 0-100");
            }
            totalMarks+=marks;
        }
        double average = (double) totalMarks/subjects;
        char grade;

        if(average>=90){
            grade = 'O';
        }else if(average>=80){
            grade = 'A';
        }else if(average>=70){
            grade = 'B';
        }else if(average>=60){
            grade = 'C';
        }else if(average>=50){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("**********Student Details**********");
        System.out.println("Student name : "+ name);
        System.out.println("Total marks : "+ totalMarks);
        System.out.println("Average : "+average);
        System.out.println("Grade : "+grade);

        sc.close();
    }
}





