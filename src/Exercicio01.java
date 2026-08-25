import java.util.Scanner;

class Retangulo{
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }
    public double Perimeter(){
        return 2 * (width + height);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
public class Exercicio01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        r1.width = sc.nextDouble();
        r1.height = sc.nextDouble();
        System.out.printf("AREA = %.2f%n",  r1.Area());
        System.out.printf("PERIMETER = %.2f%n",  r1.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n",  r1.Diagonal());
    }
}