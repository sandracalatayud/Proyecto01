package proyecto01;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

/**
* @generated
*/
public class Book_Edition extends Book {
    
    
    /* ATRIBUTOS */
    
    private String title;
    private Integer pages;
    private String plublisher;
    private String country_publishing;
    private String date_publishing;
    private FORMAT format;
    private String cover;
    private String isbn;
    private Integer edition;
    private String colection;
    private String language;
    
    /* CONSTRUCTORES */

    public Book_Edition() {
        super ();
    }

    public Book_Edition(String title, Integer pages, String plublisher, String country_publishing, String date_publishing, FORMAT format, String cover, String isbn, Integer edition, String colection, String language, String title_original, String subtitle, String author, String country_original_publishing, String date_original_publishing, String original_languaje, String series, Integer num_series, String sinopsis, AUTHOR_GENRE genre) {
        super(title_original, subtitle, author, country_original_publishing, date_original_publishing, original_languaje, series, num_series, sinopsis, genre);
        this.title = title;
        this.pages = pages;
        this.plublisher = plublisher;
        this.country_publishing = country_publishing;
        this.date_publishing = date_publishing;
        this.format = format;
        this.cover = cover;
        this.isbn = isbn;
        this.edition = edition;
        this.colection = colection;
        this.language = language;
    }

    
    /* GETTERS AND SETTERS */
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

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
    
   
    private String getCountry_publishing() {
        return this.country_publishing;
    }
    
    
    private void setCountry_publishing(String country_publishing) {
        this.country_publishing = country_publishing;
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
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.pages);
        hash = 89 * hash + Objects.hashCode(this.plublisher);
        hash = 89 * hash + Objects.hashCode(this.country_publishing);
        hash = 89 * hash + Objects.hashCode(this.date_publishing);
        hash = 89 * hash + Objects.hashCode(this.format);
        hash = 89 * hash + Objects.hashCode(this.cover);
        hash = 89 * hash + Objects.hashCode(this.isbn);
        hash = 89 * hash + Objects.hashCode(this.edition);
        hash = 89 * hash + Objects.hashCode(this.colection);
        hash = 89 * hash + Objects.hashCode(this.language);
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
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.plublisher, other.plublisher)) {
            return false;
        }
        if (!Objects.equals(this.country_publishing, other.country_publishing)) {
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
        return true;
    }

    
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Book_Edition{" + "title=" + title + ", pages=" + pages + ", plublisher=" + plublisher + ", country_publishing=" + country_publishing + ", date_publishing=" + date_publishing + ", format=" + format + ", cover=" + cover + ", isbn=" + isbn + ", edition=" + edition + ", colection=" + colection + ", language=" + language + '}';
    }

    
    
    
    
}
