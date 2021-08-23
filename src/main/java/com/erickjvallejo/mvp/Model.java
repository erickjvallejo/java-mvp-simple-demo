package com.erickjvallejo.mvp;

public class Model {

    private String name;
    private String apellido;

    public Model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
