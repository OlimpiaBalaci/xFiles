package service;

import model.factory.ObjectFactory;

import java.util.HashMap;
import java.util.Map;

public class Deserialization {

    // TODO: check if line of text contains more than one ":"
    public Object deserialize(String lineOfText) {
        String[] objectTypeAttributes = lineOfText.split(":"); // element 0 = car(type); element 1 = attributes.
        //car: name, opel;color, red;speed, 50;
        //  objectTypeAttributes[0] =car;
        // objectTypeAttributes[1] = name, opel;color, red;speed, 50;
        String objectType = objectTypeAttributes[0].trim();

        //TODO: check also ..
        String[] objectAttributes = objectTypeAttributes[1].split(";");
        // name, opel;color, red;speed, 50


        Map<String, String> objectAttributesValues = new HashMap<String, String>();
        for (String element : objectAttributes) {
            String[] mappings = element.split(",");
            objectAttributesValues.put(mappings[0].trim(), mappings[1].trim());

        }
        return ObjectFactory.create(objectType, objectAttributesValues);
    }

}
