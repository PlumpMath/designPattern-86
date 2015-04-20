package com.jlu.behavior.h_observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

  private List<Observer> list;

  public ConcreteSubject() {
    list = new LinkedList<Observer>();
  }
/**
 * ��ӹ۲���
 */
  public void attach(Observer observer) {
    list.add(observer);
  }
/**
 * ɾ���۲���
 */
  public void detach(Observer observer) {

    list.remove(observer);
  }
/**
 * �������й۲���
 */
  public void notifyAllObserver() {
    for(Observer ob:list){
         ob.update();
    }

  }



}
