package com.example.web4;

public class Progress {
    private String pname;

    @Override
    public String toString() {
        return "Progress{" +
                "pname='" + pname + '\'' +
                ", spring=" + spring +
                ", react=" + react +
                ", java=" + java +
                ", english=" + english +
                '}';
    }

    private int spring;

    private int react;
    private int java;
    private int english;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public String getResult()
    {
        if(spring<35 || react<35 || english <35 || java<35)
        {
            return "Fail";
        }
       return "pass";
    }
}
