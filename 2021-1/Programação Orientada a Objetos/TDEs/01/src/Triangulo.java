import java.util.Scanner;

public class Triangulo {
    public double base;
    public double altura;
    public double area;

    Scanner tc = new Scanner(System.in);

    public void lerDados(){

        System.out.println("Informe a base do Triângulo: ");
        this.base = tc.nextDouble();
        System.out.println("Informe a altura do Triângulo: ");
        this.altura = tc.nextDouble();

    }

    public void calcularArea(){
        this.area= (this.base*this.altura)/2;
    }

    public void mostrarDados(){
        System.out.println("Base do Triângulo: "+this.base+"\nAltura do Triângulo: "+this.altura+ "\nÁrea do Triângulo: "+area);
    }

}
