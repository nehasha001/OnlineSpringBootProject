package com.example.demo.models;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Jersey{
    @Id
    private int id;
    private String pname;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}