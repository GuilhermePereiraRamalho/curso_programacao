package application;

public class AreaTrapezio {
    public static void main(String[] args) {
        double b, B, h, area;
        // Boa pratica: Sempre indicar o tipo do número, se a expressão for de ponto flutuante(não inteira)
        // para double use .0 para float use f
        b = 6.0; // b = 6f;
        B = 8.0; // B = 8f;
        h = 5.0; // h = 5f;

        area = (b + B)/ 2.0 * h;

        System.out.println(area);
    }
}
