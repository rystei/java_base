import java.util.Scanner;

public class ConsumoAutonomia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o consumo médio do carro: ");
        double consumoMedio = sc.nextDouble();
        System.out.println("Insira a capacidade do tanque: ");
        double capacidadeTanque = sc.nextDouble();
        System.out.println("Insira a quantidade de combustível atual: ");
        double combustivelAtual = sc.nextDouble();
        System.out.println("Insira a distância da viagem: ");
        double distancia = sc.nextDouble();

        double autonimiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia máxima do veículo: " + autonimiaMaxima);
        System.out.println("Autonomia atual: " + autonomiaAtual);
        if (autonomiaAtual >= distancia) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Você precisa abastecer o carro para completar a viagem");
        }

    }
}
