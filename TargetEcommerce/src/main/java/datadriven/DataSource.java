package datadriven;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    // Insert Data from into Database
    public static void insertDataIntoDB(){
       List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"targetitems","items");
    }

    //  From Class/ Same class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Hand sanitizer");
        itemsList.add("iphone 11 pro max");
        itemsList.add("T-shirt");
        itemsList.add("Mens shirt");
        itemsList.add("Camera");
        itemsList.add("Bike");
        return itemsList;
    }


    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("targetItems", "items");
        return list;
    }

    //Excel file
    public static List<String> getItemsListFromExcel1() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../TargetEcommerce/DataTest/TargetEcommerce.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
           // System.out.print(list.get(i+1) + " ");
        }
        return list;
    }


    //search  data from Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
//        String path = "../TargetEcommerce/DataTest/TargetEcommerce.xlsx";
        String path = "../TargetECommerce/DataTest/TargetEcommerce.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }


//
//    public static String getCellValue(String xl, String Sheet, int r, int c) {
//        try {
//            FileInputStream fis = new FileInputStream(xl);
//            Workbook wb = WorkbookFactory.create(fis);
//            Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
//            return cell.getStringCellValue();
//        } catch (Exception e) {
//            return "";
//        }
//    }
//
//    public static int getRowCount (String xl, String Sheet) {
//        try {
//            FileInputStream fis = new FileInputStream(xl);
//            Workbook wb = WorkbookFactory.create(fis);
//            return wb.getSheet(Sheet).getLastRowNum();
//        } catch (Exception e) {
//            return 0;
//        }
//
//    }

}