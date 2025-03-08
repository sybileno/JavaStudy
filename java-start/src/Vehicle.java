public class Vehicle {
    private String type = "";
    private boolean existWheel = false;
    private String fuelType = "";

    public Vehicle(String type, boolean existWheel, String fuelType) {
        this.type = type;
        this.existWheel = existWheel;
        this.fuelType = fuelType;
    }

    public String getVehicleTypeName () {
        if(this.fuelType.equals("gasoline")) {
            return "가솔린 오토바이";
        }

        if(this.fuelType.equals("electricity")) {
            return "전기 오토바이";
        }

        return "";
    }
}
