package io.pragra.learning.sep;

public class BoxCalculator {
    public static void main(String[] args) {
        Box box = new Box(-98, 9, 6);
        box.calculateVolume();
        box.calculateArea();
        box.setHeight(-98);
        box.calculateArea();
        box.calculateVolume();
    }
}
