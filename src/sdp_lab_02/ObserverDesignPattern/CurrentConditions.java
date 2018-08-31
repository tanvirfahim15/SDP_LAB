/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_02.ObserverDesignPattern;

/**
 *
 * @author student
 */
public class CurrentConditions implements DisplayElement,Observer{
    float temperature,humidity,pressure;

    @Override
    public void display() {
        System.out.println("Temperature: "+temperature+"Humidity: "+humidity+"Pressure: "+pressure);
    }

    @Override
    public void update(Subject s) {
        if(s instanceof WeatherData){
            WeatherData w = (WeatherData)s;
            temperature = w.getTemperature();
            humidity = w.getHumidity();
            pressure = w.getPressure();
            display();
        }
    }
    
}
