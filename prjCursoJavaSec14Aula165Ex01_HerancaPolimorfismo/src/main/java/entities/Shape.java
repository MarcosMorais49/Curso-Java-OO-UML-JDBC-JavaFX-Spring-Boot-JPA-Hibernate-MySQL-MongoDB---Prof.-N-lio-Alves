package entities;

import entitiesEnum.Color;

public abstract class Shape {
    private Color color;
    
    private Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract Double area();
}
