package com.I2oony.shops;

import static com.I2oony.GlobalStaticVariables.*;

import com.I2oony.*;
import com.I2oony.botapi.model.Location;
import com.I2oony.shops.model.Shop;
import okhttp3.Response;

import java.util.HashMap;

public class Shops {
    private HashMap<Integer, Shop> shops;

    public Shops() {

        // TODO: getting and parse all shops to use information in the message
        /*
        1. get shops
        2. make every shop an object Shop
            - constructor which takes json string and parse it to object
        2.1. add specific methods to easily getting the info
        3. store all the shops in the HashMap<Integer, Shop>, where Integer is shopId
         */



        // shops = new HashMap<Integer, Shop>();
    }

    public Shop getShop(Integer id) {
        return shops.get(id);
    }

    public Location getShopCoordinates(Integer id) {
        Shop shop = shops.get(id);
        if (shop == null)
            return null;
        return shop.getLocation();
    }

    public String getShopAddress(Integer id) {
        Shop shop = shops.get(id);
        if (shop == null)
            return null;
        return shop.getAddress();
    }

    // Service class for better creating JSON body for GetAllShops request
//    private JSONObject shopsRequestBody() {
//        JSONObject json = new JSONObject();
//
//        json.put("Id", "");
//        json.put("Method", "");
//
//        JSONObject params = new JSONObject();
//        params.put("RegionId", null);
//        params.put("CityId", null);
//        json.put("Params", params);
//
//
//        return json;
//    }

    // ---
//    private JSONObject getAllShops() {
//        String url = SERVICE_BASE_URL + "/rpc";
//        JSONObject json = shopsRequestBody();
//
//        Response response = Main.sendRequest(url, METHOD_POST, json);
//        if (response == null)
//            return null;
//        int code = response.code();
//        if (code != 200)
//            return null;
//        try {
//            JSONObject jsonObject = (JSONObject) new JSONParser().parse(response.body().toString());
//        } catch (ParseException e) {
//            System.out.printf("helb... ", e.getMessage());
//        }
//
//        return null;
//    }
}