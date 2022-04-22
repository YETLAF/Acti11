import javax.swing.*;

public class getPerimeter {double perimetro, pi=3.1416;
    public void Circle(double radio){
        perimetro=pi*(Math.pow(radio,2));
        JOptionPane.showMessageDialog(null, "El area del circulo es "+perimetro);
    }
    public void Triangle(double base){
        perimetro=base*3;
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es "+perimetro);
    }
    public void Square(double lado){
        perimetro=lado*4;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es "+perimetro);
    }
    public void Rectangle(double base, double altura){
        perimetro=(base+base)+(altura+altura);
        JOptionPane.showMessageDialog(null, "El area del rectangulo es "+perimetro);
    }
}