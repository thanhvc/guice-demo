/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice;

import org.sample.guice.impl.IPhone6S;
import org.sample.guice.impl.Note4;
import org.sample.guice.impl.RewardApp;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 13, 2016  
 */
public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<Phone> multibinder = Multibinder.newSetBinder(binder(), Phone.class);
    multibinder.addBinding().to(Note4.class);
    multibinder.addBinding().to(IPhone6S.class);
    
    bind(EwayApp.class).to(RewardApp.class);
  }
  
}
