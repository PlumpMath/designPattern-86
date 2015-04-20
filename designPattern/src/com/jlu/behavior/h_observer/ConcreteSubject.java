package com.jlu.behavior.h_observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

  private List<Observer> list;

  public ConcreteSubject() {
    list = new LinkedList<Observer>();
  }
/**
 * 添加观察者
 */
  public void attach(Observer observer) {
    list.add(observer);
  }
/**
 * 删除观察者
 */
  public void detach(Observer observer) {

    list.remove(observer);
  }
/**
 * 更新所有观察者
 */
  public void notifyAllObserver() {
    for(Observer ob:list){
         ob.update();
    }

  }



}
