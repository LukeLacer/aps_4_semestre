package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Authors") //Para que ele use um nome diferente da classe para buscar a tabela no banco
public class Author {
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer author_id;
    private String name;
    private String fname;

    /**
     * @return the author_id
     */
    public Integer getAuthor_id() {
        return author_id;
    }

    /**
     * @param author_id the author_id to set
     */
    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }
}
