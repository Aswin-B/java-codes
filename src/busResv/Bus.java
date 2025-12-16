package busResv;

public class Bus {
    private int busNo;
    private int capacity;
    private boolean isAc;

    Bus(int busNo, int capacity, boolean isAc){
        this.busNo = busNo;
        this.capacity = capacity;
        this.isAc = isAc;
    }

    // Get methods - Accessor method
    public int getCapacity() {
        return capacity;
    }

    public boolean getIsAc() {
        return isAc;
    }

    public int getBusNo() {
        return busNo;
    }

    // Set methods - Mutator method

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setAc(boolean isAc){
        this.isAc = isAc;
    }

    public void displayBusInfo(){
        System.out.println("Bus Number        :" + this.busNo);
        System.out.println("Capacity Number   :" + this.capacity);
        System.out.println("AC Faclity        :" + ((this.isAc) ? "Available" : "Not Available"));
        System.out.println("----------------------------------------");
    }


}
