import com.I2oony.JsonWorker;
import com.I2oony.config.Config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class JsonWorkerTest {
    static StringBuilder jsonStringBuilder;
    static JsonWorker jsonWorker = new JsonWorker();
    static String jsonTestString = "{'foo': 'bar', 'number': 1, arr: [1, 2], 'innerObject': {'innerFoo': 'innerBar'}}";

    @BeforeEach
    void setUp() {
        jsonStringBuilder = new StringBuilder();
    }

    static class BasicJsonWorkerTests {
        @Test
        public void test() {

        }

    }

    static class BasicParsingTests {

        @Test
        @DisplayName("Basic deserialization test: static string")
        public void jsonStringDeserialization() {
            TestObject testObject = jsonWorker.deserialize(jsonTestString, TestObject.class);
            System.out.println(jsonWorker.serialize(testObject));
        }

        static class TestObject {
            String foo;
            Integer number;
            List<Integer> arr;
            static class InnerObject {
                String innerFoo;
            }
        }
    }

    static class ConfigParsingTests {
//        @BeforeEach
//        public static void setUp() {
//            String fileName = "config.json";
//            ClassLoader classLoader = getClass().getClassLoader();
//
//            try (InputStream inputStream = classLoader.getResourceAsStream(fileName);
//                 InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//                 BufferedReader reader = new BufferedReader(streamReader)) {
//
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    jsonStringBuilder.append(line);
//                }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Test
//        @DisplayName("Config deserialization")
//        public static void deserializationConfig() {
//            String jsonConfigString =
//            Config config = JsonWorker.getJsonObject();
//            assert config != null;
//            assertEquals(, config.toString());
//        }
    }
}