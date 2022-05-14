/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9____InnerAndAbstractClassesAndInterfaces.InterfacesExample___1.Interface2;

import java.util.*;
public class Monster implements ISavable{
    private String name;
    private int hitPoints;
    private int strength;
    public Monster(String name, int hitPoints,int strength)
    {
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }
    public String getName()
    {
        return this.name;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }
    public int getStrength()
    {
        return this.strength;
    }
    @Override
    public String toString()
    {
        return "Monster{'"+
                this.name+'\''+", hitPoints="+
                this.hitPoints+", strength="+
                this.strength+"}";
    }
    @Override
    public List<String> write()
    {
        List<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        return values;      
    }
    public void read(List<String> savedValues)
    {
        if(savedValues!=null && savedValues.size()>0)
        {
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));
        }
    }
}
