package final_project.ecse437.mcgill.ca.model;

//assuming a linear function is from the form y = ax + b
public class Linear {
    //variable a in the above formula
    private double linearCoefficient; 
    
    //variable b in the above formula
    private double constantB;
    
    
    
    public double getLinearCoefficient() {
        return linearCoefficient;
    }
    public void setLinearCoefficient(double linearCoefficient) {
        this.linearCoefficient = linearCoefficient;
    }
    public double getConstantB() {
        return constantB;
    }
    public void setConstantB(double constantB) {
        this.constantB = constantB;
    }
    
    public void computeFromTwoPoints(double x1, double x2 , double y1 , double y2) {
        this.linearCoefficient = (y2 -y1) /(x2 - x1);
        this.constantB = y1 - this.linearCoefficient*x1;
    }
    
    
    
    
    
    
    
    
    
}
