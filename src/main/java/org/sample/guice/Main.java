package org.sample.guice;

import javax.script.ScriptException;

import org.sample.guice.impl.Note4;
import org.sample.guice.impl.RewardApp;

public class Main {

  private static void createRewardAppForIphones() {
    Phone note4 = new Note4();
    EwayApp app = new RewardApp(note4);
    app.create();

  }

  public static void main(String[] args) throws ScriptException {
    createRewardAppForIphones();
  }
}
