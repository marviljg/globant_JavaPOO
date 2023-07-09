/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author jpc
 */
public class Meses {
    private HashMap<Integer, Date> meses;

    public Meses() {
    }

    public Meses(HashMap<Integer, Date> meses) {
        this.meses = meses;
    }

    public HashMap<Integer, Date> getMeses() {
        return meses;
    }

    public void setMeses(HashMap<Integer, Date> meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meses{");
        sb.append("meses=").append(meses);
        sb.append('}');
        return sb.toString();
    }
    
}
