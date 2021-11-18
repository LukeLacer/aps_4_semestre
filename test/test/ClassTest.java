package test;

import java.util.Scanner;

import model.Book;
import model.Author;
import model.Publisher;
import model.BooksAuthors;

//Created By Victor Hugo(VeK) on 10/11/2021
//Class to test classes in model
public class ClassTest {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String finish;

        // Testing Book Class System.out.println("Testando Classe Livros:\n");
        // do {
        // System.out.println("Criando Objeto Livro:\n");

        // System.out.print("Digite o título do Livro: ");
        // String title = scanner.nextLine();
        // System.out.print("Digite o ISBN do Livro: ");
        // String isbn = scanner.nextLine();
        // System.out.print("Digite o código da Editora: ");
        // Integer publisherID = Integer.parseInt(scanner.nextLine());
        // System.out.print("Digite o preço do Livro: ");
        // Double price = Double.parseDouble(scanner.nextLine());

        // System.out.println("Tentando Criar a classe...\n");
        // Book livro = new Book(title, isbn, publisherID, price);

        // System.out.println("Livro Criado: ");
        // System.out.println("Título: " + livro.getTitle());
        // System.out.println("ISBN: " + livro.getISBN());
        // System.out.println("ID Editora: " + livro.getPublisherID());
        // System.out.println("Preço: " + livro.getPrice());

        // System.out.print("\nDigite 'r' se deseja remover um Livro: ");
        // String remove = scanner.nextLine();
        // if (remove.equals("r")) {
        // System.out.println("Listando os Livros que foram criados:\n");
        // for (Book book : Book.books) {
        // System.out.println("ISBN: " + livro.getISBN());
        // System.out.println("Título: " + livro.getTitle());
        // System.out.println("ID Editora: " + livro.getPublisherID());
        // System.out.println("Preço: " + livro.getPrice() + "\n");
        // }

        // System.out.print("Digite o ISBN do Livro que deseja apagar: ");
        // String removeID = scanner.nextLine();
        // livro.removeBook(removeID);
        // }

        // System.out.println("\nTotal de Livro Criados: " + Book.books.size());

        // System.out.print("Digite 'n' se deseja encerrar: ");
        // finish = scanner.nextLine();
        // System.out.println();
        // } while (finish != "n");

        // // Author Class Test
        // System.out.println("Testando Classe Autores:\n");
        // do {
        // System.out.println("Criando Objeto Autor:\n");

        // System.out.print("Digite o id do autor: ");
        // Integer authorID = Integer.parseInt(scanner.nextLine());
        // System.out.print("Digite o nome do autor: ");
        // String name = scanner.nextLine();
        // System.out.print("Digite o Fnome do autor: ");
        // String fname = scanner.nextLine();

        // System.out.println("\n Tentando Criar Objeto Autor...");
        // Author autor = new Author(authorID, name, fname);

        // System.out.println("Autor Criado: ");
        // System.out.println("ID: " + autor.getAuthor_id());
        // System.out.println("Nome: " + autor.getName());
        // System.out.println("FNome: " + autor.getFname());

        // System.out.print("\nDigite 'r' se deseja remover um Autor: ");
        // String remove = scanner.nextLine();
        // if (remove.equals("r")) {
        // System.out.println("Listando os Autores que foram criados:\n");
        // for (Author author : Author.authors) {
        // System.out.println("ID: " + author.getAuthor_id());
        // System.out.println("Nome: " + author.getName());
        // System.out.println("FNome: " + author.getFname() + "\n");
        // }

        // System.out.print("Digite o ISBN do Autor que deseja apagar: ");
        // Integer removeID = Integer.parseInt(scanner.nextLine());
        // autor.removeAuthor(removeID);
        // }

        // System.out.println("\nTotal de Autores Criados: " + Author.authors.size());

        // System.out.print("Digite 'n' se deseja encerrar: ");
        // finish = scanner.nextLine();

        // // System.out.println(finish);
        // // System.out.print(finish.equals("n"));
        // } while (!finish.equals("n"));

        /*
         * // Publisher Class Test System.out.println("Testando Classe Editora:\n"); do
         * { System.out.println("Criando Objeto Editora:\n");
         * 
         * System.out.print("Digite o id do editora: "); Integer publisherID =
         * Integer.parseInt(scanner.nextLine());
         * System.out.print("Digite o nome do editora: "); String name =
         * scanner.nextLine(); System.out.print("Digite a url da editora: "); String url
         * = scanner.nextLine();
         * 
         * System.out.println("\n Tentando Criar Objeto Editora..."); Publisher
         * publisher = new Publisher(publisherID, name, url);
         * 
         * System.out.println("Editora Criada: "); System.out.println("ID: " +
         * publisher.getPublisherID()); System.out.println("Nome: " +
         * publisher.getName()); System.out.println("URL: " + publisher.getUrl());
         * 
         * System.out.print("\nDigite 'r' se deseja remover um editora: "); String
         * remove = scanner.nextLine(); if (remove.equals("r")) {
         * System.out.println("Listando as editoras que foram criadas:\n"); for
         * (Publisher publisherI : Publisher.publishers) {
         * System.out.println("Nome da Editora: " + publisherI.getName());
         * System.out.println("ID da Editora: " + publisherI.getPublisherID() + "\n"); }
         * 
         * System.out.print("Digite o ID da editora que deseja apagar: "); Integer
         * removeID = Integer.parseInt(scanner.nextLine());
         * publisher.removePublisher(removeID); }
         * 
         * System.out.println("\nTotal de Editoras Criadas: " +
         * Publisher.publishers.size());
         * 
         * System.out.print("Digite 'n' se deseja encerrar: "); finish =
         * scanner.nextLine();
         * 
         * // System.out.println(finish); // System.out.print(finish.equals("n")); }
         * while (!finish.equals("n"));
         */

        // // BookAuthors Class Test
        // System.out.println("Testando Classe LivroAutores:\n");
        // do {
        // System.out.println("Criando Objeto LivroAutor:\n");

        // System.out.print("Digite o ISBN do LivroAutor: ");
        // String isbn = scanner.nextLine();
        // System.out.print("Digite o id do LivroAutor: ");
        // Integer authorID = Integer.parseInt(scanner.nextLine());
        // System.out.print("Digite o número da Sequência: ");
        // Integer seqNo = Integer.parseInt(scanner.nextLine());

        // System.out.println("\n Tentando Criar Objeto LivroAutores...");
        // BooksAuthors bookAuthor = new BooksAuthors(isbn, authorID, seqNo);

        // System.out.println("LivroAutor Criado: ");
        // System.out.println("ISBN: " + bookAuthor.getAuthorID());
        // System.out.println("ID do Autor: " + bookAuthor.getAuthorID());
        // System.out.println("SeqNo: " + bookAuthor.getSeqNo());

        // System.out.print("\nDigite 'r' se deseja remover um Livro Autor: ");
        // String remove = scanner.nextLine();
        // if (remove.equals("r")) {
        // System.out.println("Listando os LivrosAutores que foram criadas:\n");
        // for (BooksAuthors booksAuthors : BooksAuthors.booksAuthors) {
        // System.out.println("ISBN: " + booksAuthors.getISBN());
        // System.out.println("ID do Autor: " + bookAuthor.getAuthorID());
        // System.out.println("SeqNo: " + bookAuthor.getSeqNo() + "\n");
        // }

        // System.out.print("Digite o ISBN do LivroAutor que deseja apagar: ");
        // String removeID = scanner.nextLine();
        // bookAuthor.removeBookAuthor(removeID);
        // }

        // System.out.println("\nTotal de LivroAutores Criados: " +
        // BooksAuthors.booksAuthors.size());

        // System.out.print("Digite 'n' se deseja encerrar: ");
        // finish = scanner.nextLine();

        // // System.out.println(finish);
        // // System.out.print(finish.equals("n"));
        // } while (!finish.equals("n"));

    }

}