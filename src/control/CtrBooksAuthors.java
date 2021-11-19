package control;

import dao.DaoBooksAuthors;
import java.util.List;
import model.BooksAuthors;
import org.hibernate.HibernateException;

public class CtrBooksAuthors {
    DaoBooksAuthors acessohibernatebooksauthors;
    
    public CtrBooksAuthors() {
        acessohibernatebooksauthors = new DaoBooksAuthors();
    }
    public int gravarBooksAuthor(BooksAuthors booksauthors) {
        try {
            acessohibernatebooksauthors.gravar(booksauthors);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarBooksAuthors() {
        try {
            return acessohibernatebooksauthors.carregarTudoOrdenado(BooksAuthors.class, "seq_no");
        } catch (HibernateException e) {
            return null;
        }
    }
    public List carregarBookAuthors(String isbn) {
        try {
            return acessohibernatebooksauthors.carregarListaIsbn(isbn);
        } catch (HibernateException e) {
            return null;
        }
    }
    public int excluirBooksAuthor(BooksAuthors booksauthors) {
        try {
            acessohibernatebooksauthors.excluir(booksauthors);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public int alterarBooksAuthor(BooksAuthors booksbooksauthors) {
        try {
            acessohibernatebooksauthors.alterar(booksbooksauthors);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }

}
