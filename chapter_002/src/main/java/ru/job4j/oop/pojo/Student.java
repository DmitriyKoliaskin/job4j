package ru.job4j.oop.pojo;

import java.util.Date;

public class Student {

    private String fio;
    private String group;
    private Date receipts;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceipts() {
        return receipts;
    }

    public void setReceipts(Date receipts) {
        this.receipts = receipts;
    }
}
