import java.util.Scanner;

class Student{
    public String name;
    public double n1, n2, n3;

    public double FinalGrade(){
        return n1 + n2 + n3;
    }

    public double MissingPoints(){
        if (FinalGrade() < 60){
            return 60 - FinalGrade();
        }else {
            return 0.0;
        }
    }
}
public class exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.n1 = sc.nextDouble();
        s1.n2 = sc.nextDouble();
        s1.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f\n", s1.FinalGrade());

        if (s1.FinalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS: %.2f\n", s1.MissingPoints());
        }else{
            System.out.println("PASS");
        }
        sc.close();
    }
}