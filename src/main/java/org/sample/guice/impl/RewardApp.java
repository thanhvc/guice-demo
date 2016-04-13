/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice.impl;

import java.util.Set;

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


  @Inject
  private Set<Phone> myPhones;
  
  public RewardApp() {
  }
  
  @Override
  public void create() {
    for(Phone phone : myPhones) {
      System.out.println("RewardApp:: is making on " + phone.toString());
    }
    
  }

  public Set<Phone> getMyPhone() {
    return myPhones;
  }
  

}
