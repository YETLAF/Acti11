import javax.swing.*;

public class getArea {
    double area, pi=3.1416;
    public void Circle(double radio){
        area=pi*(Math.pow(radio,2));
        JOptionPane.showMessageDialog(null, "El area del circulo es "+area);
    }
    public void Triangle(double base, double altura){
        area=base*altura/2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es "+area);
    }
    public void Square(double lado){
        area=lado*4;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es "+area);
    }

    public void Rectangle(double base, double altura){
        area=base*altura;
        JOptionPane.showMessageDialog(null, "El area del rectangulo es "+area);
    }
}