package io.pragra.learning.sep;

public class Box {
   private int height;
   private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int calculateVolume(){
        return height*length*width;
    }
    public int calculateArea() {
        return length * width;
    }

        public void setHeight(int height){
            if(height<=0){
                System.out.println("Wrong height");
                return;
            } this.height=height;

        }

    }




