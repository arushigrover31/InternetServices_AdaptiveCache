
public class CacheObject {
	int key;
	int value;
	int frequency;
	long last_access_time;
	Priority priority;
	
	public CacheObject(int key, int value, Priority priority){
		this.key = key;
		this.value = value;
		this.frequency = 1;
		this.last_access_time = System.currentTimeMillis();
		this.priority = priority;
	}

	/**
	 * @return the data
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param data the data to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * @param frequency the frequency to set
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the last_access_time
	 */
	public long getLast_access_time() {
		return last_access_time;
	}

	/**
	 * @param last_access_time the last_access_time to set
	 */
	public void setLast_access_time(long last_access_time) {
		this.last_access_time = last_access_time;
	}

	/**
	 * @return the priority
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

}
