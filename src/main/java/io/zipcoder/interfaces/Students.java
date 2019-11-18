package io.zipcoder.interfaces;


final class Students extends People<Student> {
        private static final Students INSTANCE = new Students();

        private Students(){
            Student s1 = new Student(0, "miral");
            Student s2 = new Student(1, "jim");

            personList.add(s1);
            personList.add(s2);
        }

        public static Students getInstance(){
            return INSTANCE;
        }

        public Student[] toArray(){

            return personList.toArray(new Student[personList.size()]);
        }
}
