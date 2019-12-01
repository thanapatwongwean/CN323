/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author thanapatwongwean
 */
public class Packet implements Comparable<Packet>, Serializable{
    
    private String source;
    private String des;
    private String priority;
    private String data;

    public Packet(String source, String des, String priority,String data) {
        this.source = source;
        this.des = des;
        this.priority = priority;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Packet t) {
        return ((this.getPriority().compareTo(t.getPriority()))*(-1));
        
    }
    
        
}
