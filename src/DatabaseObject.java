
public class DatabaseObject {
	int key, value;
	
	public DatabaseObject(int key, int value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
}
