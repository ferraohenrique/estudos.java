import java.util.Scanner;

class employee{
    public String name;
    public double GlossSalary;
    public double tax;

    public double NetSalary(){
        return GlossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
         GlossSalary += GlossSalary * (percentage/100);
    }
    public String toString(){
        return name + " $" + String.format("%.2f", NetSalary());
    }
}
public class exercicio02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        employee e1 = new employee();
        e1.name = sc.nextLine();
        e1.GlossSalary = sc.nextDouble();
        e1.tax = sc.nextDouble();
        System.out.println("Employee: " + e1);


        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        e1.IncreaseSalary(percentage);

        System.out.println("Update Data: " + e1);
    }
}
