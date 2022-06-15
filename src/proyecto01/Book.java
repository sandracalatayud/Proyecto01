/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto01;

/**
 * 
 * @author Sandra Calatayud <scmct93 at gmail.com>
 */
public class Book {

    
    /* ATRIBUTOS */
    
    private String title_original;
    private String subtitle;
    private String author;
    private String place_original_publishing;
    private String date_original_publishing;
    private String original_languaje;
    private String series;
    private Integer num_series;
    private String sinopsis;
    
    /* CONSTRUCTORES */
    
    
    
    
    /* GETTERS AND SETTERS */
    
    
    private String getTitle_original() {
        return this.title_original;
    }
    
    private void setTitle_original(String title_original) {
        this.title_original = title_original;
    }
    
    private String getSubtitle() {
        return this.subtitle;
    }
    
    private void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    
    private String getAuthor() {
        return this.author;
    }
    
    private void setAuthor(String author) {
        this.author = author;
    }
    

    private String getPlace_original_publishing() {
        return this.place_original_publishing;
    }
    
    
    private void setPlace_original_publishing(String place_original_publishing) {
        this.place_original_publishing = place_original_publishing;
    }
    
    
    private String getDate_original_publishing() {
        return this.date_original_publishing;
    }
    
   
    private void setDate_original_publishing(String date_original_publishing) {
        this.date_original_publishing = date_original_publishing;
    }
    
    private String getOriginal_languaje() {
        return this.original_languaje;
    }
    
    
    private void setOriginal_languaje(String original_languaje) {
        this.original_languaje = original_languaje;
    }
    
    
    private String getSeries() {
        return this.series;
    }
    
    
    private void setSeries(String series) {
        this.series = series;
    }
   
    private Integer getNum_series() {
        return this.num_series;
    }
    
    private void setNum_series(Integer num_series) {
        this.num_series = num_series;
    }
    
   
    private String getSinopsis() {
        return this.sinopsis;
    }
    
    
    private void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
        
}
