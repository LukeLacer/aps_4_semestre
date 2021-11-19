package control;

import dao.DaoBooks;
import java.util.List;
import model.Book;
import org.hibernate.HibernateException;

public class CtrBooks {
    DaoBooks acessohibernatebook;
    
    public CtrBooks() {
        acessohibernatebook = new DaoBooks();
    }
    public int gravarBook(Book book) {
        try {
            acessohibernatebook.gravar(book);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarBooks() {
        try {
            return acessohibernatebook.carregarTudoOrdenado(Book.class, "title");
        } catch (HibernateException e) {
            return null;
        }
    }
    public int excluirBook(Book book) {
        try {
            acessohibernatebook.excluir(book);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public int alterarBook(Book book) {
        try {
            acessohibernatebook.alterar(book);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }

}
