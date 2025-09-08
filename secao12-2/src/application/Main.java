package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Nascimento (DD/MM/YYYY): ");
        Date birthday = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthday);


        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("Quantos itens tem no pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("INSIRA OS DADOS DO #" + (i + 1) + " ITEM: ");
            System.out.print("Nome do Produto: ");
            String prodName = sc.nextLine();
            System.out.print("Preço do Produto: ");
            double prodPrice = sc.nextDouble();

            Product product = new Product(prodName, prodPrice);

            System.out.print("Quantidade: ");
            int prodQuantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(prodQuantity, prodPrice, product);
            order.addItem(orderItem);
        }

        System.out.println(order);

    }
}