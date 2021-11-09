public class Cars {
    //Field, Properties
    private String color; //private should be.
    private String model;
    private double engine;
    private int doors;
    
    public Cars(String color, String model) { //constructor 
        this(color,model,0,0);
    }
    //constructors have identical name with class
    public Cars() { //overloading solved car2 object problem in Main.java .
//      this.color="No Information";
//      this.model="No Information";
//      this.engine=0;
//      this.doors=0;
        this("Bilgi Yok","Bilgi Yok",0,0); //this calls the following funtion.
    }
    
    public Cars(String color, String model, double engine , int doors) {
        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
        
    }

    public void setColor(String color) {
        this.color =color; //this.color is the object above, the other one is variable.
                
    }
    public String getColor() {
        return this.color; //java knows but "this" usage is safer.
        
    }
    public String getModel() { //sağ click>source> generate getters setters .
        return model;
    }
    public void setModel(String model) {
        this.model = model;        
    }
    public double getEngine() {
        return engine;             
    }
    public void setEngine(double engine) {
        this.engine = engine;      
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) { //Encapsulation
        if (doors==2 || doors==4) {
            this.doors = doors;
        }
        else {
            System.out.println("The number of doors can only be 2 and 4.");
        }
                
    }
    
    public void showInfos() {
        System.out.println("Color of the car: " + this.color);
        System.out.println("Model of the car: " + this.model);
        System.out.println("Engine Capacity of the Car: " + this.engine);
        System.out.println("Number of doors of the car: "+ this.doors);
    }
    
}
