package com.greenfox.filip5.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo implements Comparable {

    @Id
    @GeneratedValue
    long id;

    String title;

    boolean urgent;

    //@Column(name="done")
    boolean completed;

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.completed = false;
    }

    public Todo() {
        this.urgent = false;
        this.completed = false;
    }


    public Todo(String title, boolean urgent, boolean completed) {

        this.title = title;
        this.urgent = urgent;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", urgent=" + urgent +
                ", completed=" + completed +
                '}';
    }

    @Override
    public int compareTo(Object t) {
        return (int) (this.getId() - ((Todo) t).getId());
    }

}

//    Add a com.greenfox.filip5.models.Todo class with the fields
//(id: long, title: String, urgent: boolean(default false), completed: boolean(default false))