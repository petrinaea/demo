package com.example.demo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RowWord {
  private SimpleStringProperty word;
  private SimpleIntegerProperty count;

  public RowWord(SimpleStringProperty word, SimpleIntegerProperty count) {
    this.word = word;
    this.count = count;
  }

  public String getWord() {
    return word.get();
  }

  public SimpleStringProperty wordProperty() {
    return word;
  }

  public void setWord(String word) {
    this.word.set(word);
  }


  public int getCount() {
    return count.get();
  }

  public SimpleIntegerProperty countProperty() {
    return count;
  }

  public void setCount(int count) {
    this.count.set(count);
  }

  public void incCount() {
    count.set(count.get() + 1);
  }
}
