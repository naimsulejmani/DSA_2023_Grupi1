package hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(10);

        hashTable.put("dbName", "CacttusGrup1");
        hashTable.put("username", "sa");
        hashTable.put("password", "adminadmin");
        hashTable.put("ip", "127.0.0.1");

        System.out.println("CELESAT: ");
        for (String key : hashTable.keys()) {
            System.out.println(key);
        }

        System.out.println("VLERAT: ");
        for (String value : hashTable.values()) {
            System.out.println(value);
        }

        System.out.println(hashTable.containsKey("dbName"));
        System.out.println(hashTable.containsValue("adminadmin"));

        System.out.println(hashTable.get("dbName"));

        HashTable<String, String> shqip = new HashTable<>(10);
        shqip.put("lblName", "Emri");
        HashTable<String, String> english = new HashTable<>(10);
        english.put("lblName", "Name");


    }
}








