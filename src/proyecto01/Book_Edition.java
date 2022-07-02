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
    private String subtitle;
    private Integer pages;
    private String publisher;
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

    public Book_Edition(String title, String subtitle, Integer pages, String plublisher, String country_publishing, String date_publishing, FORMAT format, String cover, String isbn, Integer edition, String colection, String language, String title_original, String subtitle_original, String author, String country_original_publishing, String date_original_publishing, String original_languaje, String series, Integer num_series, String sinopsis, AUTHOR_GENRE genre) {
        super(title_original, subtitle_original, author, country_original_publishing, date_original_publishing, original_languaje, series, num_series, sinopsis, genre);
        this.title = title;
        this.subtitle = subtitle;
        this.pages = pages;
        this.publisher = plublisher;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    

    public Integer getPages() {
        return this.pages;
    }
    
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    
    
    public String getPublisher() {
        return this.publisher;
    }
    
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
   
    public String getCountry_publishing() {
        return this.country_publishing;
    }
    
    
    public void setCountry_publishing(String country_publishing) {
        this.country_publishing = country_publishing;
    }
    
    
    public String getDate_publishing() {
        return this.date_publishing;
    }
    

    public void setDate_publishing(String date_publishing) {
        this.date_publishing = date_publishing;
    }
    
   
    public FORMAT getFormat() {
        return this.format;
    }
    
   
    public void setFormat(FORMAT format) {
        this.format = format;
    }
    
    
    public String getCover() {
        return this.cover;
    }
    
    
    public void setCover(String cover) {
        this.cover = cover;
    }
    
    
    public String getIsbn() {
        return this.isbn;
    }
    
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    public Integer getEdition() {
        return this.edition;
    }
    
    public void setEdition(Integer edition) {
        this.edition = edition;
    }
    

    public String getColection() {
        return this.colection;
    }
    
    public void setColection(String colection) {
        this.colection = colection;
    }
    
    
    public String getLanguage() {
        return this.language;
    }
    
   
    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    /* HASHCODE Y EQUALS */

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.subtitle);
        hash = 37 * hash + Objects.hashCode(this.pages);
        hash = 37 * hash + Objects.hashCode(this.publisher);
        hash = 37 * hash + Objects.hashCode(this.country_publishing);
        hash = 37 * hash + Objects.hashCode(this.date_publishing);
        hash = 37 * hash + Objects.hashCode(this.format);
        hash = 37 * hash + Objects.hashCode(this.cover);
        hash = 37 * hash + Objects.hashCode(this.isbn);
        hash = 37 * hash + Objects.hashCode(this.edition);
        hash = 37 * hash + Objects.hashCode(this.colection);
        hash = 37 * hash + Objects.hashCode(this.language);
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
        if (!Objects.equals(this.subtitle, other.subtitle)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
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
         if (!super.equals(obj)) {
            return false;
        }
        return true;
    }

    

    
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Book_Edition{" + super.toString()+"title=" + title + ", subtitle=" + subtitle + ", pages=" + pages + ", plublisher=" + publisher + ", country_publishing=" + country_publishing + ", date_publishing=" + date_publishing + ", format=" + format + ", cover=" + cover + ", isbn=" + isbn + ", edition=" + edition + ", colection=" + colection + ", language=" + language + '}';
    }

    
}
