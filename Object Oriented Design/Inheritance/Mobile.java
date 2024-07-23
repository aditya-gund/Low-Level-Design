class Mobile{
    private String model;
    private boolean isPowerOn;
    public Mobile(String company, String model){
        this.model=model;
        this.isPowerOn=false;
    }
    public String getModel() {
        return model;
    }
    public void powerOn(){
        isPowerOn=true;
        System.out.println(model + " powered on");
    }
    public void powerOff(){
        isPowerOn=false;
        System.out.println(model+ " powered off");
    }
    public void doCalling(String number){
        if(isPowerOn){
            System.out.println("Calling "+ "+91:"+number);
        }
        else{
            System.out.println("can't call phone is off");
        }
    }
}
// Inheriting the mobile
class smartPhone extends Mobile{
    private boolean camera;
    public smartPhone(String company, String model){
        super(company, model);
        this.camera=false;
    }
    public void cameraOn(){
        camera=true;
        System.out.println("Do video calling " + getModel());
    }
    public void cameraOff(){
        camera=false;
        System.out.println("Camera is off " + getModel());
    }
    @Override
    public void doCalling(String number){
        if(camera){
            System.out.println("Video calling +91:"+ number);
        }else{
            System.out.println("Camera is disabled. Calling normal call");
            super.doCalling(number);
        }
    }
}

