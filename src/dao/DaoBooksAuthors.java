package dao;

import java.util.List;
import model.BooksAuthors;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class DaoBooksAuthors extends DaoGenerico {
    
    public List carregarListaIsbn(String isbn) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        return session.getSession()
            .createCriteria(BooksAuthors.class)
            .add(
		Restrictions.like("isbn", isbn, MatchMode.ANYWHERE)
            )
            .list();
    }
}
