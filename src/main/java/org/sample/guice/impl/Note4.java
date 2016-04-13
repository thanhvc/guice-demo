package org.sample.guice.impl;

import org.sample.guice.Phone;

public class Note4 implements Phone {

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
    return "Note4";
  }
}
