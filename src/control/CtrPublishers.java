package control;

import dao.DaoPublishers;
import java.util.List;
import model.Publisher;
import org.hibernate.HibernateException;

public class CtrPublishers {
    DaoPublishers acessohibernatepublisher;
    
    public CtrPublishers() {
        acessohibernatepublisher = new DaoPublishers();
    }
    public int gravarPublisher(Publisher publisher) {
        try {
            acessohibernatepublisher.gravar(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public List carregarPublishers() {
        try {
            return acessohibernatepublisher.carregarTudoOrdenado(Publisher.class, "name");
        } catch (HibernateException e) {
            return null;
        }
    }
    public int excluirPublisher(Publisher publisher) {
        try {
            acessohibernatepublisher.excluir(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
    public int alterarPublisher(Publisher publisher) {
        try {
            acessohibernatepublisher.alterar(publisher);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }
}
