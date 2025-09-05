package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static entities.Funcionario.buscarPorId;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.println("Quantos funcionários vai cadastrar? ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Funcionário %d: \n", i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: " );
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            listaFuncionarios.add(funcionario);
        }

        System.out.println("Qual o id do funcionário que deseja aumentar o salário? ");
        int idBusca = sc.nextInt();
        System.out.println("Qual porcentagem deseja aumentar? ");
        double porcentagem = sc.nextDouble();

        Funcionario funcionario = buscarPorId(listaFuncionarios, idBusca);

        if (funcionario != null) {
            funcionario.aumentarSalario(porcentagem);
            System.out.printf("Salário atualizado com sucesso!, %.2f\n", funcionario.getSalario());
        } else {
            System.out.println("Funcionário não encontrado");
        }




    }
}