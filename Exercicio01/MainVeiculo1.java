package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var veiculo1 = new Veículo();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do carro: ");
        veiculo1.setNomeDoCarro(sc.nextLine());
        System.out.print("Digite a marca do carro: ");
        veiculo1.setMarcaDoCarro(sc.nextLine());
        System.out.print("Digite o ano do carro: ");
        veiculo1.setAnoDoCarro(sc.nextInt());
        System.out.print("Digite a kilometragem do carro: ");
        veiculo1.setKilometragemDoCarro(sc.nextDouble());
        System.out.print("Digite a cor do carro: ");
        veiculo1.setCorDoCarro(sc.nextLine());
        System.out.println("O carro é usado? S/N");
        veiculo1.setUsado(sc.nextLine());

        switch (veiculo1.getUsado()){
            case "S":
                System.out.println("Carro registrado ");
                System.out.println(veiculo1.getNomeDoCarro() + " " + veiculo1.getMarcaDoCarro() + " " + veiculo1.getAnoDoCarro() + " " + veiculo1.getKilometragemDoCarro() + "KM " + veiculo1.getCorDoCarro() + "Usado");
                break;
            case "N":
                System.out.println("Carro registrado ");
                System.out.println(veiculo1.getNomeDoCarro() + " " + veiculo1.getMarcaDoCarro() + " " + veiculo1.getAnoDoCarro() + " " + veiculo1.getKilometragemDoCarro() + "KM " + veiculo1.getCorDoCarro() + "Novo");
                break;
            default:
                System.out.println("Erro");
                break;
        }

        }
    }
