<<<<<<< HEAD
package com.nopcommerce.demo.propertyreader;
=======
package com.tutorialninja.demo.propertyreader;
>>>>>>> 55cc270 (Initial commit)

import java.io.FileInputStream;
import java.util.Properties;

/**
<<<<<<< HEAD
 * Created by Jay Vaghani
=======
 * Created by Jitesh Patel
>>>>>>> 55cc270 (Initial commit)
 */
public class PropertyReader {

    /*
    Rules for implementing singleton design pattern
    1. Make the constructor private
    2. Create a static method to get the instance
    3. Create a static member variable
    */

    //Declare the PropertyReader variable
    private static volatile PropertyReader propInstance;

    //Create Private constructor Because of prevent the Instantiation of class
    private PropertyReader() {

    }

    /**
     * This method will return instance of PropertyReader class
     * @return
     */
    public static synchronized PropertyReader getInstance() {
        if (propInstance == null) {
            propInstance = new PropertyReader();
        }
        return propInstance;
    }

    /**
     * This method will read property from property file
     *
     * @param propertyName
     * @return
     */
    public String getProperty(String propertyName) {

        Properties prop = new Properties();
        FileInputStream inputStream = null;
        try {
<<<<<<< HEAD
            inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile/config.properties");
=======
            inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/tutorialninja/demo/propertyreader/PropertyReader.java");
>>>>>>> 55cc270 (Initial commit)
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null) {
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
    }

}
