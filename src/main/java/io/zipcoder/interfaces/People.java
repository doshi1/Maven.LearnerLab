package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

abstract class People <E extends Person> implements Iterable<E>{

    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void add(E person){
        this.personList.add(person);
    }

    public E findById(long id){
        for(E each: this.personList){
            if(each.getId() == id)
                return each;
        }
        return null;
    }

    public Boolean contains(E person){
        return this.personList.contains(person);
    }

    public void remove(E person){
        if(contains(person))
            this.personList.remove(person);
    }

    public void remove(long id){
        for(E each : this.personList){
            if(each.getId() == id)
                personList.remove(each);
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public Integer count(){
        return this.personList.size();
    }

    abstract E[] toArray();


    public Iterator<E> iterator() {
        return this.personList.iterator();
    }

}
