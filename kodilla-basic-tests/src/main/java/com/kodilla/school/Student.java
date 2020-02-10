package com.kodilla.school;
public class Student {

        private String name;
        private Grades maths = new Grades();
        private Grades physics = new Grades();
        private Grades geography = new Grades();
        private Grades history = new Grades();

    public Student(String name) {
            this.name = name;
            this.maths = maths;
            this.physics = physics;
            this.geography = geography;
            this.history = history;
        }

        public void addMathsGrade ( int grade){
            if (grade > 0 && grade < 7) {
                this.maths.add(grade);
            }
        }
        public void addPhysicsGrade ( int grade){
            if (grade > 0 && grade < 7) {
                this.physics.add(grade);
            }
        }
        public void addGeographyGrade ( int grade){
            if (grade > 0 && grade < 7) {
                this.geography.add(grade);
            }
        }
        public void addHistoryGrade ( int grade){
            if (grade > 0 && grade < 7) {
                this.history.add(grade);
            }
        }
        public double getMathsAverage () {
            return this.maths.getAverage();
        }
        public double getPhysicsAverage () {
            return this.physics.getAverage();
        }
        public double getGeographyAverage () {
            return this.geography.getAverage();
        }
        public double getHistoryAverage () {
            return this.history.getAverage();
        }
    }