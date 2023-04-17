package com.I2oony;

import com.google.gson.Gson;

public class JsonWorker {

    public <T> T deserialize(String jsonString, Class<T> tClass) {
        // FIXME: Create correct deserialization in classes with nested classes
        try {


            return new Gson().fromJson(jsonString, tClass);
        } catch (Exception e) {
            System.out.printf("[Exception]: %s - %s.",
                    JsonWorker.class.getName(),
                    e.getMessage());
            return null;
        }
    }

    public <T> String serialize(T object) {
        try {
            return new Gson().toJson(object);
        } catch (Exception e) {
            System.out.printf("[Exception]: %s - %s.",
                    JsonWorker.class.getName(),
                    e.getMessage());
            return null;
        }
    }

    //    public JSONObject getJsonObject(String jsonString) {
    //        try {
    //            return (JSONObject) new JSONParser().parse(jsonString);
    //        } catch (ParseException e) {
    //            System.out.printf("[Exception]: %s - ", this.getClass().getName());
    //            return null;
    //        }
    //    }
}
