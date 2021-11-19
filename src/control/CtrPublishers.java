package control;

import dao.DaoPublishers;
import java.util.List;
import model.Publisher;
import org.hibernate.HibernateException;

/**
 *
 * @author Gabriel Freitas-PC
 */
public class CtrPublishers {
    DaoPublishers acessohibernatepublishers;
    
    public CtrPublishers() {
        acessohibernatepublishers = new DaoPublishers();
    }
    public int gravarPublisher(Publisher publisher) {
        try {
            acessohibernatepublishers.gravar(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarPulishers() {
        try {
            return acessohibernatepublishers.carregarTudoOrdenado(Publisher.class, "name");
        } catch (HibernateException e) {
            return null;
        }
    }
    public int excluirPulisher(Publisher publisher) {
        try {
            acessohibernatepublishers.excluir(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public int alterarPulisher(Publisher publisher) {
        try {
            acessohibernatepublishers.alterar(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
}
