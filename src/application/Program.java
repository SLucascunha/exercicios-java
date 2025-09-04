package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do seu departamento: ");
        String department = sc.nextLine();

        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();

        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();

        System.out.print("Digite o seu salário base: ");
        Double workerbaseSalary = sc.nextDouble();

        Worker worker1 = new Worker(workerName, workerbaseSalary, WorkLevel.valueOf(workerLevel), new Department(department));

        System.out.println("Quantos contratos tem esse trabalhador? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Coloque os dados do #"+ (i + 1) + " contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valueHour = sc.nextDouble();

            System.out.print("Horas trabalhadas: ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valueHour, hour);
            worker1.addContrct(contract);
        }

        System.out.println();
        System.out.println("Insira o mês que quer calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker1.getName());
        System.out.println("Departamento: " + worker1.getDepartment().getName());
        System.out.printf("Ganho em " + monthAndYear + ": " + String.format("%.2f", worker1.income(year, month)));




    }
}