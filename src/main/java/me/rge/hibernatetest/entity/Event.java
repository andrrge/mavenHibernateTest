package me.rge.hibernatetest.entity;

/**
 * Created by IntelliJ IDEA.
 * User: rge
 * Date: 4/22/12
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Date;

public class Event {
    private Long id;
    private String title;
    private Date date;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}