package proyecto01;

import java.util.Objects;


/**
* @generated
*/
public class Reading {
    
    
    /* ATRIBUTOS */
    
    private String start_date;
    private String end_date;
    private Integer rate;
    private String review;
    private String sum_up;
    private Book_Edition book;
    
    /* CONSTRUCTORES */

    public Reading() {
    }

    public Reading(String start_date, String end_date, Integer rate, String review, String sum_up, Book_Edition book) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.rate = rate;
        this.review = review;
        this.sum_up = sum_up;
        this.book = book;
    }
    
    
    
    /* GETTERS AND SETTERS */
    
   
    private String getStart_date() {
        return this.start_date;
    }
    
   
    private void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    
    
    private String getEnd_date() {
        return this.end_date;
    }
    
   
    private void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    
    
    private Integer getRate() {
        return this.rate;
    }
    
    
    private void setRate(Integer rate) {
        this.rate = rate;
    }
    
    
    private String getReview() {
        return this.review;
    }
    
    
    private void setReview(String review) {
        this.review = review;
    }
    
    
    private String getSum_up() {
        return this.sum_up;
    }
    
    
    private void setSum_up(String sum_up) {
        this.sum_up = sum_up;
    }
    
    
    private Book_Edition getBook() {
        return this.book;
    }
    
    
    private void setBook(Book_Edition book) {
        this.book = book;
    }
    
    /* HASHCODE Y EQUALS */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.start_date);
        hash = 59 * hash + Objects.hashCode(this.end_date);
        hash = 59 * hash + Objects.hashCode(this.rate);
        hash = 59 * hash + Objects.hashCode(this.review);
        hash = 59 * hash + Objects.hashCode(this.sum_up);
        hash = 59 * hash + Objects.hashCode(this.book);
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
        final Reading other = (Reading) obj;
        if (!Objects.equals(this.start_date, other.start_date)) {
            return false;
        }
        if (!Objects.equals(this.end_date, other.end_date)) {
            return false;
        }
        if (!Objects.equals(this.review, other.review)) {
            return false;
        }
        if (!Objects.equals(this.sum_up, other.sum_up)) {
            return false;
        }
        if (!Objects.equals(this.rate, other.rate)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        return true;
    }
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Reading{" + "start_date=" + start_date + ", end_date=" + end_date + ", rate=" + rate + ", review=" + review + ", sum_up=" + sum_up + ", book=" + book + '}';
    }
    
    
    
    
}
