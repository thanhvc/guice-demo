package org.sample.guice.impl;

import org.sample.guice.Phone;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by arlethp1 on 4/8/15.
 */
public class IPhone6S implements Phone {

  @Inject
  @Named("iphone6s.price")
  private String price;
  
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
    return "Iphone6S:" + price;
  }
    
}
