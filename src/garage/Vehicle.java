package garage;

public class Vehicle {
    private String modelName;
    private String description;
    private String manufacturer;
    private int year;
    private String color;
    private int speed;
    private int[] dimensions = new int[3];
    private int weight;

    public Vehicle(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Je suis " + modelName + " et je  démarre");
    }

    public void stop() {
        System.out.println("Je suis " + modelName + " et je m'arrête");
    }

	/**
	 * GETTER
	 * @return the modelName
	 */
	String getModelName() {
		return modelName;
	}

	/**
	 * GETTER
	 * @return the description
	 */
	String getDescription() {
		return description;
	}

	/**
	 * GETTER
	 * @return the manufacturer
	 */
	String getManufacturer() {
		return manufacturer;
	}

	/**
	 * GETTER
	 * @return the year
	 */
	int getYear() {
		return year;
	}

	/**
	 * GETTER
	 * @return the color
	 */
	String getColor() {
		return color;
	}

	/**
	 * GETTER
	 * @return the speed
	 */
	int getSpeed() {
		return speed;
	}

	/**
	 * GETTER
	 * @return the dimensions
	 */
	int[] getDimensions() {
		return dimensions;
	}

	/**
	 * GETTER
	 * @return the weight
	 */
	int getWeight() {
		return weight;
	}


}