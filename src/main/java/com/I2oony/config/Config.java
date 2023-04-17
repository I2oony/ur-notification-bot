package com.I2oony.config;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

public final class Config {
    Integer version;
    ConfigBody config;
    InfoBody info;
    ShopsBody shops;
    EmojiBody emojis;

    private static class ConfigBody {
        HashMap<String, Mapping> service, bot;
    }
    private static class InfoBody {
    }
    private static class ShopsBody {
        Regions regions;
        ArrayList<Integer> whitelist, blacklist;

        private static class Regions {
            ArrayList<Integer> whitelist, blacklist, cities;
        }
    }
    private static class EmojiBody {
        HashMap<String,
                HashMap<String, Mapping>> emojis;
    }

    private static class Mapping {
        HashMap<String, Object> keyValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
