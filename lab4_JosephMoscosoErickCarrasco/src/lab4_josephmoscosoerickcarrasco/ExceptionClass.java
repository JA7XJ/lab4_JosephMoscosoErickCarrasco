/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josephmoscosoerickcarrasco;

/**
 *
 * @author erick
 */
public class ExceptionClass extends Exception{
    private int type;

    public ExceptionClass() {
        super();
    }

    public ExceptionClass(int type, String message) {
        super(message);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ExceptionClass{" + "type=" + type + '}';
    }
    
    
    
}
