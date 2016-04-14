/*
 * Copyright (C) 2009-2016 Eway Company.
 * 
 * All rights reserved.
 *
 */
package org.sample.guice.graph;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.sample.guice.AppModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;

/**
 * Created by The Eway Company
 * Author : Eway
 *          eway@eway.vn
 * Apr 14, 2016  
 */
public class GuiceGraphSample {
  public static void main(final String[] args) throws IOException {
    //dot -T png guice_graph.dot >guice_graph.png
    final PrintWriter printWriter = new PrintWriter(new File("guice_graph.dot"), "UTF-8");

    final Injector singletonInjector = Guice.createInjector(new AppModule());
    final Injector injector = Guice.createInjector(new GraphvizModule());
    final GraphvizGrapher graphvizGrapher = injector.getInstance(GraphvizGrapher.class);
    graphvizGrapher.setOut(printWriter);
    graphvizGrapher.setRankdir("TB");
    graphvizGrapher.graph(singletonInjector);// this one generates the dependency graph for the provided injector.
    printWriter.flush();
    printWriter.close();
    System.out.println("graph created");
  }
}