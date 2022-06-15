package proyecto01;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

/**
* @generated
*/
public class Book_Edition extends Book {
    
    
    /* ATRIBUTOS */
    
    private Integer pages;
    private String plublisher;
    private String place_publishing;
    private String date_publishing;
    private FORMAT format;
    private String cover;
    private String isbn;
    private Integer edition;
    private String colection;
    private String language;
    private Set<Reading> reading;
    
    /* CONSTRUCTORES */

    public Book_Edition() {
        super ();
    }

    public Book_Edition(Integer pages, String plublisher, String place_publishing, String date_publishing, FORMAT format, String cover, String isbn, Integer edition, String colection, String language, Set<Reading> reading, String title_original, String subtitle, String author, String place_original_publishing, String date_original_publishing, String original_languaje, String series, Integer num_series, String sinopsis) {
        super(title_original, subtitle, author, place_original_publishing, date_original_publishing, original_languaje, series, num_series, sinopsis);
        this.pages = pages;
        this.plublisher = plublisher;
        this.place_publishing = place_publishing;
        this.date_publishing = date_publishing;
        this.format = format;
        this.cover = cover;
        this.isbn = isbn;
        this.edition = edition;
        this.colection = colection;
        this.language = language;
        this.reading = reading;
    }
    
    
    
    /* GETTERS AND SETTERS */
    
    
    private Integer getPages() {
        return this.pages;
    }
    
    private void setPages(Integer pages) {
        this.pages = pages;
    }
    
    
    private String getPlublisher() {
        return this.plublisher;
    }
    
    
    private void setPlublisher(String plublisher) {
        this.plublisher = plublisher;
    }
    
   
    private String getPlace_publishing() {
        return this.place_publishing;
    }
    
    
    private void setPlace_publishing(String place_publishing) {
        this.place_publishing = place_publishing;
    }
    
    
    private String getDate_publishing() {
        return this.date_publishing;
    }
    

    private void setDate_publishing(String date_publishing) {
        this.date_publishing = date_publishing;
    }
    
   
    private FORMAT getFormat() {
        return this.format;
    }
    
   
    private void setFormat(FORMAT format) {
        this.format = format;
    }
    
    
    private String getCover() {
        return this.cover;
    }
    
    
    private void setCover(String cover) {
        this.cover = cover;
    }
    
    
    private String getIsbn() {
        return this.isbn;
    }
    
    
    private void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    private Integer getEdition() {
        return this.edition;
    }
    
    private void setEdition(Integer edition) {
        this.edition = edition;
    }
    

    private String getColection() {
        return this.colection;
    }
    
    private void setColection(String colection) {
        this.colection = colection;
    }
    
    
    private String getLanguage() {
        return this.language;
    }
    
   
    private void setLanguage(String language) {
        this.language = language;
    }
    
    
    /* HASHCODE Y EQUALS */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.pages);
        hash = 37 * hash + Objects.hashCode(this.plublisher);
        hash = 37 * hash + Objects.hashCode(this.place_publishing);
        hash = 37 * hash + Objects.hashCode(this.date_publishing);
        hash = 37 * hash + Objects.hashCode(this.format);
        hash = 37 * hash + Objects.hashCode(this.cover);
        hash = 37 * hash + Objects.hashCode(this.isbn);
        hash = 37 * hash + Objects.hashCode(this.edition);
        hash = 37 * hash + Objects.hashCode(this.colection);
        hash = 37 * hash + Objects.hashCode(this.language);
        hash = 37 * hash + Objects.hashCode(this.reading);
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
        final Book_Edition other = (Book_Edition) obj;
        if (!Objects.equals(this.plublisher, other.plublisher)) {
            return false;
        }
        if (!Objects.equals(this.place_publishing, other.place_publishing)) {
            return false;
        }
         if (!super.equals(obj)) {
            return false;
        }
        if (!Objects.equals(this.date_publishing, other.date_publishing)) {
            return false;
        }
        if (!Objects.equals(this.cover, other.cover)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.colection, other.colection)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.pages, other.pages)) {
            return false;
        }
        if (this.format != other.format) {
            return false;
        }
        if (!Objects.equals(this.edition, other.edition)) {
            return false;
        }
        if (!Objects.equals(this.reading, other.reading)) {
            return false;
        }
        return true;
    }
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Book_Edition{" + "pages=" + pages + ", plublisher=" + plublisher + ", place_publishing=" + place_publishing + ", date_publishing=" + date_publishing + ", format=" + format + ", cover=" + cover + ", isbn=" + isbn + ", edition=" + edition + ", colection=" + colection + ", language=" + language + ", reading=" + reading + '}';
    }
    
    
    
}
