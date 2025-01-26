public class Casting {
    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;
        // se nao usar o casting como as duas variáveis da equação são inteiras, o resultado é a divisão interia e corta as casas decimais
        resultado = (double) a / b;

        System.out.println(resultado);
    }
}
