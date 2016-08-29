package entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: lmf@cic.tsinghua.edu.cn
 * Date: 13-11-25
 * Time: 上午11:10
 */
@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String author;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private double price;
    private int amount;
    private String picture;
    @Lob
    private String description;

    public Book(String title, String author, Date date, double price, int amount, String picture, String description) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.picture = picture;
        this.description = description;
    }

    public Book() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
