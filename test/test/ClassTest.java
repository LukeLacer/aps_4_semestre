package test;

import java.util.Scanner;

import model.Author;
import model.Book;

//Created By Victor Hugo(VeK) on 10/11/2021
//Class to test classes in model
public class ClassTest {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String finish;
        /*
         * // Testing Book Class System.out.println("Testando Classe Livros:\n"); do {
         * System.out.println("Criando Objeto Livro:\n");
         * 
         * System.out.print("Digite o título do Livro: "); String title =
         * scanner.nextLine(); System.out.print("Digite o ISBN do Livro: "); String isbn
         * = scanner.nextLine(); System.out.print("Digite o código da Editora: ");
         * Integer publisherID = scanner.nextInt();
         * System.out.print("Digite o preço do Livro: "); Double price =
         * scanner.nextDouble();
         * 
         * System.out.println("Tentando Criar a classe...\n"); Book livro = new
         * Book(title, isbn, publisherID, price);
         * 
         * System.out.println("Livro Criado: "); System.out.println("Título: " +
         * livro.getTitle()); System.out.println("ISBN: " + livro.getISBN());
         * System.out.println("ID Editora: " + livro.getPublisherID());
         * System.out.println("Preço: " + livro.getPrice());
         * 
         * System.out.println("\nTotal de Livro Criados: " + Book.books.size());
         * 
         * System.out.print("Digite 'n' se deseja encerrar: "); finish =
         * scanner.nextLine(); System.out.println(); } while (finish != "n");
         */

        System.out.println("Testando Classe Autores:\n");
        do {
            System.out.println("Criando Objeto Autor:\n");

            System.out.print("Digite o id do autor: ");
            Integer authorID = Integer.parseInt(scanner.nextLine());
            System.out.print("Digite o nome do autor: ");
            String name = scanner.nextLine();
            System.out.print("Digite o Fnome do autor: ");
            String fname = scanner.nextLine();

            System.out.println("\n Tentando Criar Objeto Autor...");
            Author autor = new Author(authorID, name, fname);

            System.out.println("Autor Criado: ");
            System.out.println("ID: " + autor.getAuthor_id());
            System.out.println("Nome: " + autor.getName());
            System.out.println("FNome: " + autor.getFname());

            System.out.println("\nTotal de Autores Criados: " + Author.authors.size());

            System.out.print("Digite 'n' se deseja encerrar: ");
            finish = scanner.nextLine();
            
            //System.out.println(finish);
            //System.out.print(finish.equals("n"));
        } while (!finish.equals("n"));

    }

}
