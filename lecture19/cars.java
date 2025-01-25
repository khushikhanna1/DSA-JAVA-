package lecture19;


    public class cars extends Vehicle {
        int colorCode;
        String brand;
        int mileage;
    
        public Cars(){
            this.colorCode= 0;
            this.brand= "Honda";
            this.mileage= 22;
            this.type= "Hatchback";
            this.fuel= "Petrol";
            this.tyres= 4;
        }
    
        
        void run(){
            System.out.println("Car is running");
        }
    }
