package io.zipcoder.interfaces;

import java.util.HashMap;

final class ZipCodeWilmington {
    private final static ZipCodeWilmington zipCode = new ZipCodeWilmington();
    private  Students students;
    private  Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();

    }


    public void hostLectures(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        teacher.lecture(students.toArray(), numberOfHours);


    }
    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();

        for(Student student: students){

            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

    public static  ZipCodeWilmington getInstance(){
        return zipCode;
    }

    @Override
    public String toString() {
        return "ZipCodeWilmington{" +
                "students=" + students +
                ", instructors=" + instructors +
                '}';
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}