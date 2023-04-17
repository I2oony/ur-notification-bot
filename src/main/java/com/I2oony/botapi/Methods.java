package com.I2oony.botapi;

import com.I2oony.botapi.model.Location;
import com.I2oony.GlobalStaticVariables;
import com.I2oony.Main;
import okhttp3.Response;

public class Methods {

//    public static String sendMessage(Long chatId, String text) {
//        String url = GlobalStaticVariables.BOT_BASE_URL + GlobalStaticVariables.BOT_TOKEN + "/sendMessage";
//
//        JSONObject json = new JSONObject();
//        json.put("chat_id", chatId);
//        json.put("text", text);
//
//        Response response = Main.sendRequest(url, GlobalStaticVariables.METHOD_POST, json);
//
//        if (response == null)
//            return null;
//        return Integer.valueOf(response.code()).toString();
//    }

//    public static String sendLocation(Long chatId, Location location) {
//        String url = GlobalStaticVariables.BOT_BASE_URL + GlobalStaticVariables.BOT_TOKEN + "/sendLocation";
//
//        JSONObject json = new JSONObject();
//        json.put("chat_id", chatId);
//        json.put("latitude", location.getLatitude());
//        json.put("longitude", location.getLongitude());
//
//        Response response = Main.sendRequest(url, GlobalStaticVariables.METHOD_POST, json);
//
//        if (response == null)
//            return null;
//        return Integer.valueOf(response.code()).toString();
//    }
}
