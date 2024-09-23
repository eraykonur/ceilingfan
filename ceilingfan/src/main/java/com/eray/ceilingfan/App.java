package com.eray.ceilingfan;

public class App {
	public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        System.out.println("Initial State: Speed = " + fan.getSpeed() + ", Direction = " + fan.getDirection());
    }
}
