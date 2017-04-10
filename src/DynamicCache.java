import java.util.HashMap;
import java.util.Scanner;

public class DynamicCache {
	HashMap<Integer,DatabaseObject> database = new HashMap<>();
	
	static boolean is_cache_hit(int key) {
		return false;
	}
	
	void StoreData(int key, int value) {
		System.out.println("[StoreData] Entering");
		if(is_cache_hit(key)) {
			System.out.println("[StoreData] Cache Hit");
		} else {
			System.out.println("[StoreData] Cache Miss");
			DatabaseObject db_object = new DatabaseObject(key, value);
			database.put(key, db_object);
			// Add to cache
		}
		System.out.println("[StoreData] Exiting");
	}
	
	int RetrieveData(int key) {
		System.out.println("[RetrieveData] Entering");
		if(is_cache_hit(key)) {
			System.out.println("[RetrieveData] Cache Hit");
			return 1;
		} else {
			System.out.println("[RetrieveData] Cache Miss");
			if(database.containsKey(key)) {
				DatabaseObject db_object = database.get(key);
				return db_object.getValue();
			} else {
				return -1;
			}
		}
		//System.out.println("[RetrieveData] Exiting");
	}
	
	public static void main(String args[]) {
		DynamicCache dynamic_cache = new DynamicCache();
		Scanner sc_input = new Scanner(System.in);
		int user_choice;
		int user_store_key;
		int user_store_value;
		int user_retrieve_key;
		int user_retrieve_value;
		while(true) {
			System.out.println("1. Store Data\n2. Retrieve Data\n3. Exit");
			user_choice = sc_input.nextInt();
			switch(user_choice) {
				case 1:
					System.out.println("Enter key value pair to store: ");
					user_store_key = sc_input.nextInt();
					user_store_value = sc_input.nextInt();
					dynamic_cache.StoreData(user_store_key, user_store_value);
					break;
				case 2:
					System.out.println("Enter key to retrieve: ");
					user_retrieve_key = sc_input.nextInt();
					user_retrieve_value = dynamic_cache.RetrieveData(user_retrieve_key);
					if(user_retrieve_value == -1) {
						System.out.println("Data not found");
					} else {
						System.out.println("Retrieved Key Value Pair: " 
								+ user_retrieve_key + ":" 
								+ user_retrieve_value);
					}
					break;
				case 3: sc_input.close();
						System.exit(0);
				default: System.out.println("Invalid Input, Try Again");
			}
			
		}
	}
}
