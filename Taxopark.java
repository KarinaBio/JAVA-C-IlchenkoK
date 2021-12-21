package com.univ.Task_6_10;
import java.util.ArrayList;
import java.util.List;

public class Taxopark{
    Sedan[] sedans;
    Cabriolet[] cabriolets;

    public Taxopark(Sedan[] sedans, Cabriolet[] cabriolets){
        this.cabriolets = cabriolets;
        this.sedans = sedans;
    }
    public int getCost(){
        int ans = 0;
        for (Cabriolet c : cabriolets){
            ans += c.getCost();
        }
        for (Sedan s : sedans){
            ans += s.getCost();
        }
        return ans;
    }
    public List<Car> getBySpeed(int min, int max){
        List<Car> ans = new ArrayList<>();
        for (Cabriolet c : cabriolets){
           if (c.getSpeed() >= min && c.getSpeed() <= max){
               ans.add(c);
           }
        }
        for (Sedan s : sedans){
            if (s.getSpeed() >= min && s.getSpeed() <= max){
                ans.add(s);
            }
        }
        return ans;
    }
    public Car getMinFuel(){
        Car ans = sedans[0];
        for (Cabriolet c : cabriolets){
            if (c.getFuel() < ans.getFuel()){
                ans = c;
            }
        }
        for (Sedan s : sedans){
            if (s.getFuel() < ans.getFuel()){
                ans = s;
            }
        }
        return ans;
    }
    public Car getMaxFuel(){
        Car ans = sedans[0];
        for (Cabriolet c : cabriolets){
            if (c.getFuel() > ans.getFuel()){
                ans = c;
            }
        }
        for (Sedan s : sedans){
            if (s.getFuel() > ans.getFuel()){
                ans = s;
            }
        }
        return ans;
    }

}
