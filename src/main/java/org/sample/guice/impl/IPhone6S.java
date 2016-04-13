package org.sample.guice.impl;

import org.sample.guice.Phone;

/**
 * Created by arlethp1 on 4/8/15.
 */
public class IPhone6S implements Phone {

  @Override
  public void call() {
    System.out.println("Iphone6S:: calling....");
  }

  @Override
  public void takePhoto() {
    System.out.println("Iphone6S:: take photo....");
  }

  @Override
  public void sendSMS() {
    System.out.println("Iphone6S:: send SMS....");
  }

  @Override
  public String toString() {
    return "Iphone6S";
  }

    
}
