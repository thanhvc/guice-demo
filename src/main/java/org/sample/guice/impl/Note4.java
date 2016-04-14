package org.sample.guice.impl;

import org.sample.guice.Phone;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Note4 implements Phone {

  @Inject
  @Named("note4.price")
  private String price;
  
  @Override
  public void call() {
    System.out.println("note4:: calling....");
  }

  @Override
  public void takePhoto() {
    System.out.println("note4:: take photo....");
  }

  @Override
  public void sendSMS() {
    System.out.println("note4:: send SMS....");
  }

  @Override
  public String toString() {
    return "Note4:" + price;
  }
}
