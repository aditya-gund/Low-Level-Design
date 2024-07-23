// Class Car
class Car{
    // Attributes
    private  String make;
    private  String model;
    private  int year;
    // Setter Method
    public  void setMake(String make){
         this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    // Getter Method
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public static void main(String[] args) {
       // Object1
        Car myCar = new Car();
        myCar.setModel("Verana");
        myCar.setMake("Hyundai");
        myCar.setYear(2023);
        System.out.println("Company Name: "+ myCar.getMake());
        System.out.println("Car Model: "+ myCar.getModel());
        System.out.println("Year: "+ myCar.getYear());
        // Object2
        Car myCar1 = new Car();
        myCar1.setMake("TATA");
        myCar1.setModel("Nexon");
        myCar1.setYear(2021);
        System.out.println("Company Name: "+ myCar1.getMake());
        System.out.println("Car Model: "+ myCar1.getModel());
        System.out.println("Year: "+ myCar1.getYear());
    }
}