/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice;

import org.sample.guice.impl.Note4;
import org.sample.guice.impl.RewardApp;

import com.google.inject.AbstractModule;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 13, 2016  
 */
public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Phone.class).to(Note4.class);
    //bind(Phone.class).annotatedWith(Names.named("iphone6s")).to(IPhone6S.class);
    
    bind(EwayApp.class).to(RewardApp.class).asEagerSingleton();
  }
  
}
