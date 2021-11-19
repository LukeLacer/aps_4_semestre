package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(BooksAuthorsPk.class)
public class BooksAuthors implements Serializable {
    @Id
    private String isbn;
    @Id
    private Integer author_id;
    
    private Integer seq_no;

    public BooksAuthors() {
    }

    public BooksAuthors(String isbn, Integer authorID, Integer seqNo) {
        this.author_id = authorID;
        this.isbn = isbn;
        this.seq_no = seqNo;
    }
    
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @param authorID the authorID to set
     */
    public void setAuthorID(Integer authorID) {
        this.author_id = authorID;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(Integer seqNo) {
        this.seq_no = seqNo;
    }

    /**
     * @return the isbn
     */
    public String getISBN() {
        return this.isbn;
    }

    /**
     * @return the authorID
     */
    public Integer getAuthorID() {
        return this.author_id;
    }

    /**
     * @return the seqNo
     */
    public Integer getSeqNo() {
        return seq_no;
    }

}
