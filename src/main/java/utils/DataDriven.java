package utils;

import org.testng.annotations.DataProvider;

public class DataDriven {
    @DataProvider(name = "test-data")
    public static Object[][] testData() {
        Object[][] data = new Object[1][19];
        data[0][0] = "Emma";
        data[0][1] = "Watson";
        data[0][2] = "Emma#@12478";
        data[0][3] = "15";
        data[0][4] = "4";
        data[0][5] = "1990";
        data[0][6] = "Emma";
        data[0][7] = "Watson";
        data[0][8] = "Warner Bros";
        data[0][9] = "4 windmill street";
        data[0][10] = "building 6 , apartment 10";
        data[0][11] = "London";
        data[0][12] = "New York";
        data[0][13] = "52112";
        data[0][14] = "United States";
        data[0][15] = "Thanks";
        data[0][16] = "4402076364412";
        data[0][17] = "4402076364412";
        data[0][18] = "4 windmill street";
        return data;
    }

}
