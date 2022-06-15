package proyecto01;

import java.util.Objects;
import java.util.Set;


/**
* @generated
*/
public class Book_Copy extends Book_Edition {
    
    /* ATRIBUTOS */
    
    private String bought_in;
    private String gifted_by;
    private String date_adquisition;
    private String location;
    private STATUS status;
    private String borrow_to;
    private String loaned_by;
    
    /* CONSTRUCTORES */

    public Book_Copy(String bought_in, String gifted_by, String date_adquisition, String location, STATUS status, String borrow_to, String loaned_by, Integer pages, String plublisher, String place_publishing, String date_publishing, FORMAT format, String cover, String isbn, Integer edition, String colection, String language, Set<Reading> reading, String title_original, String subtitle, String author, String place_original_publishing, String date_original_publishing, String original_languaje, String series, Integer num_series, String sinopsis) {
        super(pages, plublisher, place_publishing, date_publishing, format, cover, isbn, edition, colection, language, reading, title_original, subtitle, author, place_original_publishing, date_original_publishing, original_languaje, series, num_series, sinopsis);
        this.bought_in = bought_in;
        this.gifted_by = gifted_by;
        this.date_adquisition = date_adquisition;
        this.location = location;
        this.status = status;
        this.borrow_to = borrow_to;
        this.loaned_by = loaned_by;
    }

    public Book_Copy() {
        super();
    }
    
    
    
    
    /* GETTERS AND SETTERS */
    
    private String getBought_in() {
        return this.bought_in;
    }
    
    
    private void setBought_in(String bought_in) {
        this.bought_in = bought_in;
    }
    
    
    private String getGifted_by() {
        return this.gifted_by;
    }
    
    
    private void setGifted_by(String gifted_by) {
        this.gifted_by = gifted_by;
    }
    
    
    private String getDate_adquisition() {
        return this.date_adquisition;
    }
    
    
    private void setDate_adquisition(String date_adquisition) {
        this.date_adquisition = date_adquisition;
    }
    
    
    private String getLocation() {
        return this.location;
    }
    
    
    private void setLocation(String location) {
        this.location = location;
    }
    
    
    private STATUS getStatus() {
        return this.status;
    }
    
    
    private void setStatus(STATUS status) {
        this.status = status;
    }
    
    
    private String getBorrow_to() {
        return this.borrow_to;
    }
    
    
    private void setBorrow_to(String borrow_to) {
        this.borrow_to = borrow_to;
    }
    
    
    private String getLoaned_by() {
        return this.loaned_by;
    }
    
    
    private void setLoaned_by(String loaned_by) {
        this.loaned_by = loaned_by;
    }
    
    /* HASHCODE E EQUALS */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.bought_in);
        hash = 59 * hash + Objects.hashCode(this.gifted_by);
        hash = 59 * hash + Objects.hashCode(this.date_adquisition);
        hash = 59 * hash + Objects.hashCode(this.location);
        hash = 59 * hash + Objects.hashCode(this.status);
        hash = 59 * hash + Objects.hashCode(this.borrow_to);
        hash = 59 * hash + Objects.hashCode(this.loaned_by);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book_Copy other = (Book_Copy) obj;
        if (!Objects.equals(this.bought_in, other.bought_in)) {
            return false;
        }
        if (!Objects.equals(this.gifted_by, other.gifted_by)) {
            return false;
        }
        if (!Objects.equals(this.date_adquisition, other.date_adquisition)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.borrow_to, other.borrow_to)) {
            return false;
        }
        if (!Objects.equals(this.loaned_by, other.loaned_by)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
         if (!super.equals(obj)) {
            return false;
        }
        return true;
    }
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Book_Copy{" + "bought_in=" + bought_in + ", gifted_by=" + gifted_by + ", date_adquisition=" + date_adquisition + ", location=" + location + ", status=" + status + ", borrow_to=" + borrow_to + ", loaned_by=" + loaned_by + '}';
    }
    
    
    
}
