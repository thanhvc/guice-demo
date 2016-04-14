/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice.provider;

import org.sample.guice.Phone;
import org.sample.guice.impl.Note4;

import com.google.inject.Provider;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 14, 2016  
 */
public class PhoneProvider implements Provider<Phone> {
  private final Phone note4;
  public PhoneProvider() {
    note4 = new Note4();
  }
  @Override
  public Phone get() {
    return note4;
  }

}
