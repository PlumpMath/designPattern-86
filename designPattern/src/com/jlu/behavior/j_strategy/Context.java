package com.jlu.behavior.j_strategy;

public class Context {

  private SortStrategy sortStrategy;

  public void setSortStrategy(SortStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
  }

  public void sort() {

    sortStrategy.sort();
  }



}
