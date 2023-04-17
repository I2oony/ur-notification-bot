package com.I2oony;

import okhttp3.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bot started...");

        // String cookie = getAuthCookie(GlobalStaticVariables.SERVICE_LOGIN, GlobalStaticVariables.SERVICE_PASSWORD);

        System.out.println("Bot finished.");
    }

    public static OkHttpClient client = new OkHttpClient();
    public static final MediaType typeJson = MediaType.get("application/json; charset=utf-8");

//    public static String getAuthCookie(String login, String password) {
//        String url = GlobalStaticVariables.SERVICE_BASE_URL + "/auth/login";
//
//        JSONObject json = new JSONObject();
//        json.put("type", "Password");
//        json.put("userName", login);
//        json.put("password", password);
//
//        Response response = sendRequest(url, GlobalStaticVariables.METHOD_POST, json);
//
//        if (response == null)
//            return null;
//
//        try {
//            int responseCode = response.code();
//            ResponseBody responseBodyObject = response.body();
//            if (responseBodyObject == null)
//                return null;
//            String responseBody = responseBodyObject.string();
//
//            if (responseBody.equals("true"))
//                return response.header("Set-Cookie");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    public static String getStaffRequests(String cookie) {
        String url = GlobalStaticVariables.SERVICE_BASE_URL + "/rpc";

        return null;
    }

//    public static Response sendRequest(String url, String method, JSONObject json) {
//        System.out.println(json.toJSONString());
//        RequestBody body = RequestBody.create(json.toJSONString(), typeJson);
//        Request request = new Request.Builder()
//                .url(url)
//                .method(method, body)
//                .build();
//
//        try {
//            return client.newCall(request).execute();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

}
