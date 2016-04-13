package org.sample.guice;

import javax.script.ScriptException;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  private static void createRewardAppForIphones() {
//  Phone note4 = new Note4();
//  EwayApp app = new RewardApp(note4);
//  app.create();
    
    Injector injector = Guice.createInjector(new AppModule());
    EwayApp myApp = injector.getInstance(EwayApp.class);
    myApp.create();

  }

  public static void main(String[] args) throws ScriptException {
    createRewardAppForIphones();
  }
}
