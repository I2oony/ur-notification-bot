package com.I2oony.config;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;

import com.google.common.io.*;

public class ConfigFileReader {
    List<String> lines;

    public List<String> getFile(URI configPath) {
        try {
            lines = Files.readLines(new File(configPath), Charset.defaultCharset());
            return lines;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.join("", lines);
    }
}
