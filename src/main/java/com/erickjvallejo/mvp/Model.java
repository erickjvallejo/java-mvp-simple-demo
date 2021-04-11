package com.erickjvallejo.mvp;

public class Model {

    private String name;
    private String apellido;

    /**
    * 
    */
    public Model() {
    }

    /**
     * @param name
     * @param apellido
     */
    public Model(String name, String apellido) {
        this.setName(name);
        this.setApellido(apellido);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Model [apellido=" + apellido + ", name=" + name + "]";
    }

}
