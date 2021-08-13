package garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private int door;
    private int literPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight, int door, int literPer100km, String motor, List<String> options) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
        this.door = door;
        this.literPer100km = literPer100km;
        this.motor = motor;
        this.options = options;
    }

    @Override
    public void start() {
        System.out.println("Je suis " + modelName + ", je consomme" + literPer100km + " / START");
    }
    @Override
    public void stop() {
        System.out.println("Je suis " + modelName + ", je consomme" + literPer100km + " / STOP");
    }
    
    public void startHeadlight() {
        System.out.println("J'allume mes phares");
    }

    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

	/**
	 * GETTER
	 * @return the door
	 */
	int getDoor() {
		return door;
	}

	/**
	 * GETTER
	 * @return the literPer100km
	 */
	int getLiterPer100km() {
		return literPer100km;
	}

	/**
	 * GETTER
	 * @return the motor
	 */
	String getMotor() {
		return motor;
	}

	/**
	 * GETTER
	 * @return the options
	 */
	List<String> getOptions() {
		return options;
	}

    
}