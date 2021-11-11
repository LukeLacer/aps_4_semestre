package test;

import java.util.Scanner;

import model.Book;

//Created By Victor Hugo(VeK) on 10/11/2021
//Class to test classes in model
public class ClassTest {

    public static void main(String args[]) {

        // Testing Book Class
        Scanner scanner = new Scanner(System.in);
        String finish;

        System.out.println("Testando Classe Livros:\n");
        do {
            System.out.println("Criando Objeto Livro:\n");

            System.out.print("Digite o título do Livro: ");
            String title = scanner.nextLine();
            System.out.print("Digite o ISBN do Livro: ");
            String isbn = scanner.nextLine();
            System.out.print("Digite o código da Editora: ");
            Integer publisherID = scanner.nextInt();
            System.out.print("Digite o preço do Livro: ");
            Double price = scanner.nextDouble();

            System.out.println("Tentando Criar a classe...\n");
            Book livro = new Book(title, isbn, publisherID, price);

            System.out.println("Livro Criado: ");
            System.out.println("Título: " + livro.getTitle());
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("ID Editora: " + livro.getPublisherID());
            System.out.println("Preço: " + livro.getPrice());

            System.out.println("\nTotal de Livro Criados: " + Book.books.size());

            System.out.print("Digite 'n' se deseja encerrar: ");
            finish = scanner.nextLine();
            System.out.println();
        } while (finish != "n");

    }

}
