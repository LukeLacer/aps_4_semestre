package control;

import dao.DaoAuthors;
import java.util.List;
import model.Author;
import org.hibernate.HibernateException;

public class CtrAuthors {
    DaoAuthors acessohibernateauthor;
    
    public CtrAuthors() {
        acessohibernateauthor = new DaoAuthors();
    }
    public int gravarAuthor(Author author) {
        try {
            acessohibernateauthor.gravar(author);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarAuthors() {
        try {
            return acessohibernateauthor.carregarTudoOrdenado(Author.class, "name");
        } catch (HibernateException e) {
            return null;
        }
    }
    public Object carregarAuthor(int id) {
        try {
            return acessohibernateauthor.carregarUm(id, Author.class);
        } catch (HibernateException e) {
            return null;
        }
    }
    public int excluirAuthor(Author author) {
        try {
            acessohibernateauthor.excluir(author);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public int alterarAuthor(Author author) {
        try {
            acessohibernateauthor.alterar(author);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }

}
