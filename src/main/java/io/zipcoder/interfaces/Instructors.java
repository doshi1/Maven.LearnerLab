package io.zipcoder.interfaces;

final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray(){
        return INSTANCE.toArray();
    }
}
