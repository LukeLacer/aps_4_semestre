package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "Authors") // Para que ele use um nome diferente da classe para buscar a tabela no banco
public class Author {
    // ----------------------------------------------------------------------
    // Atributes
    // ----------------------------------------------------------------------
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;
    private String name;
    private String fname;
    public static ArrayList<Author> authors = new ArrayList<Author>();

    // ----------------------------------------------------------------------
    // Constructors
    // ----------------------------------------------------------------------
    public Author() {}
    public Author(Integer authorID, String name, String fname) {

        boolean conditions = checkID(authorID) && checkName(name) && checkName(fname);

        if (conditions) {
            this.author_id = authorID;
            this.name = name;
            this.fname = fname;
            authors.add(new Author(authorID, name, fname, true));
        } else {
            System.out.println("Algum dados é inválido, autor não foi criado");
        }
    }

    // VeK: This Arraylist is used to store all the books created inside this
    // arraylist
    // If you have a better idea about how to store this in a better way, please
    // share
    public Author(Integer authorID, String name, String fname, boolean flag) {
        this.author_id = authorID;
        this.name = name;
        this.fname = fname;
    }

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

    // ----------------------------------------------------------------------
    // Functions
    // ----------------------------------------------------------------------

    // checking ID
    public boolean checkID(Integer authorID) {
        boolean isAuthorOK = true;
        // If already have a ID in authors ArrayList, return false
        if (authors.size() > 0) {
            for (Author author : authors) {
                if (author.author_id == authorID) {
                    isAuthorOK = false;
                }
            }
        }

        return isAuthorOK;
    }

    // checking name
    public boolean checkName(String name) {
        boolean isNameOK = true;

        boolean conditions = name.length() > 0 && name.length() <= 25;
        if (!conditions) {
            isNameOK = false;
        }

        return isNameOK;
    }

    // Removing Author from ArrayList
    public void removeAuthor(Integer authorID) {
        for (Author author : authors) {
            if (author.getAuthor_id().equals(authorID)) {
                authors.remove(author);
                return;
            }
        }
        System.out.println("Autor não encontrado");
    }

}
