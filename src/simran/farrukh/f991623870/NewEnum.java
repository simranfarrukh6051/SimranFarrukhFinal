/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simran.farrukh.f991623870;

/**
 *
 * @author Simran
 */
public enum NewEnum {
    PERSONAL("P"), BUSINESS("B"), FAMILY("F");
    
    private String enums;
    
    private NewEnum(String e){
        enums = e;
    }
    
    public String getEnum(){
        return enums;
    }
}
