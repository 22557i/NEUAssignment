/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author tnaxy
 */
public class VitalSigns {
    
    public double temperature;
    public double bloodPressure;
    public int HeartRate;
    public double WeightInPounds;
    public int RepiratoryRate;
    public double WeightInKilo;
    public boolean IsNormal;

    public boolean IsNormal() {
        if(temperature>=38||temperature<=35||bloodPressure>=130||bloodPressure<=70||HeartRate>=130||HeartRate<=70||WeightInPounds>=200||WeightInPounds<=90||RepiratoryRate>40||RepiratoryRate<10)
            return false;
        else return true;
    }

    public void setIsNormal(boolean IsNormal) {
        this.IsNormal = IsNormal;
    }

    public double getWeightInPounds() {
        return WeightInPounds;
    }

    public void setWeightInPounds(double WeightInPounds) {
        this.WeightInPounds = WeightInPounds;
    }

    public int getRepiratoryRate() {
        return RepiratoryRate;
    }

    public void setRepiratoryRate(int RepiratoryRate) {
        this.RepiratoryRate = RepiratoryRate;
    }

    public double getWeightInKilo() {
        return WeightInKilo;
    }

    public void setWeightInKilo() {
        this.WeightInKilo = this.WeightInPounds * 0.453;
    }
    
 

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private String date;
    @Override
    public String toString(){
        return this.date;
    }
    
    
    
    
}
