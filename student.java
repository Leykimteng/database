package data;

import java.util.logging.Logger;

public class student {
    private int id;
    private String name;
    student(){
        this.id = 0;
        this.name = "";
    }
    student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name;
    }
}