package edu.gatech.gem5.game.readers;

import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.gatech.gem5.game.readers.Reader;
import edu.gatech.gem5.game.data.EnvironmentType;

/**
 * A class for parsing environment data files into a Java map.
 *
 * @author  Creston Bunch
 * @version 1.0.0
 */

public class EnvironmentReader extends Reader<EnvironmentType> {

    /**
     * Load the JSON dictionary into a Map object.
     *
     * @param path The path of the data file to load.
     * @return A map with the ids and corresponding objects.
     */
    @Override
    public Map<String, EnvironmentType> load(String path) {
        Map<String, EnvironmentType> map = new HashMap<>();
        InputStream stream = getClass().getResourceAsStream(path);
        String json = readStream(stream);
        
        Type collectionType = new TypeToken<
            Map<String, EnvironmentType>
        >(){}.getType();
 
        map = new Gson().fromJson(json, collectionType);

        return map;
    }
}
