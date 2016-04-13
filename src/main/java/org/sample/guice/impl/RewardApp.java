/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice.impl;

import javax.inject.Inject;

import org.sample.guice.EwayApp;
import org.sample.guice.Phone;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 13, 2016  
 */
public class RewardApp implements EwayApp {

  /**
   * 
   */
  private final Phone myPhone;
  
  @Inject
  public RewardApp(Phone phone) {
    this.myPhone = phone;
  }
  
  @Override
  public void create() {
    System.out.println("RewardApp:: is making on " + this.myPhone.toString());
  }

  public Phone getMyPhone() {
    return myPhone;
  }
  

}
