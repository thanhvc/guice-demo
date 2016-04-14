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

import com.google.inject.Provider;

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
  private final Provider<Phone> myProvider;
  
  @Inject
  public RewardApp(Provider<Phone> myProvider) {
    this.myProvider = myProvider;
  }
  
  @Override
  public void create() {
    System.out.println("RewardApp:: is making on " + this.myProvider.get().toString());
  }

  public Phone getMyPhone() {
    return this.myProvider.get();
  }

}
