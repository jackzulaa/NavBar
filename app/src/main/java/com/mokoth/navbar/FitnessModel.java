package com.mokoth.navbar;

public class FitnessModel {
    private String course_name;
    private int imgid;

    public FitnessModel(String fitness_name, int imgid) {
        this.course_name = course_name;
        this.imgid = imgid;
    }

    public String getfitness_name() {
        return course_name;
    }

    public void setfitness_name(String course_name) {
        this.course_name = course_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
