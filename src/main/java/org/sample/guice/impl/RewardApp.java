/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice.impl;

import javax.inject.Inject;
import javax.inject.Named;

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
  public RewardApp(@Named("note4") Phone myPhone) {
    this.myPhone = myPhone;
  }
  
  @Override
  public void create() {
    System.out.println("RewardApp:: is making on " + this.myPhone.toString());
  }

  public Phone getMyPhone() {
    return this.myPhone;
  }

}
