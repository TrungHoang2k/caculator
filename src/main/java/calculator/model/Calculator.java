package calculator.model;

public class Calculator {
    private Double x;
    private Double y;
    private String action;

    public Calculator() {
    }

    public Calculator(Double x, Double y, String action) {
        this.x = x;
        this.y = y;
        this.action = action;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

