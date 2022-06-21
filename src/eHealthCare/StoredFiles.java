package eHealthCare;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFiles {
    private String storedFile;
    private JsonArray memory;

    public StoredFiles(String storedFile) {
        this.storedFile = storedFile;
        this.memory = read();
    }

    public int search(String key, Integer value) {
        // duyet
        int index = -1;

        
        // ...
        Integer id = null;
        for (int i = 0; i < memory.size(); i++) {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            
            id = jsonObject.get(key).getAsInt();
            if (value == id) {
                index = i;//
                break;
            }
        }
        return index;
    }

    public JsonArray read() {
        JsonArray jsonArray = null;
        
        
        try (FileReader reader = new FileReader(storedFile)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonArray;
    }

    public void update(Integer id, Integer insuranceCardType, String name, String dateOfBirth, String address, String phoneNumber, InfoCustomer infoCustomer) {
        JsonObject info = new JsonObject();
        info.addProperty("age", infoCustomer.getAge());
        info.addProperty("gender", infoCustomer.getGender());
        info.addProperty("bloodGroup", infoCustomer.getBloodGroup());
        info.addProperty("weight", infoCustomer.getWeight());
        info.addProperty("height", infoCustomer.getHeight());
        
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("id", id);
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("dateOfBirth", dateOfBirth);
        jsonObject.addProperty("address", address);
        jsonObject.addProperty("phoneNumber", phoneNumber);
        jsonObject.addProperty("insuranceCardType", insuranceCardType);
        jsonObject.add("infoCustomer", info);

        memory.add(jsonObject);
        // memory.ad
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("insurancecards.json")) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public JsonArray getAll(){
        return this.memory;
    }
}
