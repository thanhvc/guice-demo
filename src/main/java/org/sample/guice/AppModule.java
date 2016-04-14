/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.sample.guice.impl.IPhone6S;
import org.sample.guice.impl.Note4;
import org.sample.guice.impl.RewardApp;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 13, 2016  
 */
public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Phone.class).annotatedWith(Names.named("note4")).to(Note4.class);
    //bind(Phone.class).toProvider(PhoneProvider.class);
    bind(Phone.class).annotatedWith(Names.named("iphone6s")).to(IPhone6S.class);
    
    bind(EwayApp.class).to(RewardApp.class).asEagerSingleton();
    //
    Names.bindProperties(binder(), getConfiguration());
  }
  
  private Properties getConfiguration() {
    final Properties properties = new Properties();
    try {
      final InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties");
      properties.load(inputStream);
    } catch (final IOException e) {
      e.printStackTrace();
    }
    return properties;
  }

}
