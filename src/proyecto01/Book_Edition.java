package proyecto01;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class Book_Edition extends Book {
    
    
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
    
    /**
    * @generated
    */
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
    
}
