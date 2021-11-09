public class Main {

    public static void main(String[] args) {
        Cars car1 = new Cars("Silver","Renault Megane", 1.6, 4); 
        Cars car2=new Cars();
        Cars car3=new Cars("Black","Mercedes");
        
        car1.showInfos();
        car2.showInfos();
        car3.showInfos();
    }
    

}
