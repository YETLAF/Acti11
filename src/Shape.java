import javax.swing.*;

public class Shape {public static void main(String[]args){
    double base, altura, lado, radio;
    int menu, opcion;
    getArea area=new getArea();
    getPerimeter perim=new getPerimeter();
    do{
        menu=Integer.parseInt(JOptionPane.showInputDialog("Que figura quieres calcular?\n"
                + "1)Circulo\n"
                + "2)Triangulo\n"
                + "3)Cuadrado\n"
                + "4)Rectangulo\n"
                + "5)Ninguna"));
        switch(menu){
            case 1:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion\n1) Area\n2) Perimetro"));
                if(opcion==1){
                    radio=Double.parseDouble(JOptionPane.showInputDialog("Cual es el radio?"));
                    area.Circle(radio);
                }
                else if(opcion==2){
                    radio=Double.parseDouble(JOptionPane.showInputDialog("Cual es el radio?"));
                    perim.Circle(radio);
                }
                break;
            case 2:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion\n1) Area\n2) Perimetro"));
                if(opcion==1){
                    base=Double.parseDouble(JOptionPane.showInputDialog("Cual es la base?"));
                    altura=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura?"));
                    area.Triangle(base, altura);
                }
                else if (opcion==2){
                    base=Double.parseDouble(JOptionPane.showInputDialog("Cual es la base?"));
                    perim.Triangle(base);
                }
                break;
            case 3:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion\n1) Area\n2) Perimetro"));
                if(opcion==1){
                    lado=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura del lado?"));
                    area.Square(lado);
                }
                else if(opcion==2){
                    lado=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura del lado?"));
                    perim.Square(lado);
                }
                break;
            case 4:
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion\n1) Area\n2) Perimetro"));
                if(opcion==1){
                    base=Double.parseDouble(JOptionPane.showInputDialog("Cual es la base?"));
                    altura=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura?"));
                    area.Rectangle(base, altura);
                }
                else if(opcion==2){
                    base=Double.parseDouble(JOptionPane.showInputDialog("Cual es la base?"));
                    altura=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura?"));
                    perim.Rectangle(base, altura);
                }
                break;
        }
    }while(menu!=5);
}
}