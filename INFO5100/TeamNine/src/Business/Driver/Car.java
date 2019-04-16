/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

/**
 *
 * @author mr.wu
 */
// 这里的cartype是简单的登记类型
//pickup service {economy for 4 people、Extra Seats for 6 people、Lux for 4 people}，
//cargo delivery {9' cargo van, 10' truck, 15' truck, 17' truck}，
//方便system admin了解driver的大致情况

public class Car {
    private String Type;
    private String Corporation;
    private String plateNO;
    private String color;

    public String getCorporation() {
        return Corporation;
    }

    public void setCorporation(String Corporation) {
        this.Corporation = Corporation;
    }

    public Car(String Type, String plateNO, String color,String corportation) {
        this.Type = Type;
        this.plateNO = plateNO;
        this.color = color;
        this.Corporation = corportation;
    }

    public Car() {
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPlateNO() {
        return plateNO;
    }

    public void setPlateNO(String plateNO) {
        this.plateNO = plateNO;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
