package com.paliwal.demo1.model;

public class Todo {

    private  int id;
    private String title;
    public Todo(int id , String title)
  {
      this.id = id;
      this.title = title;

  }
  public Todo()
  {

  }
  public int getId() {
        return id;
  }
    public void setId(int id) { this.id = id; }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) { this.title = title; }







}
