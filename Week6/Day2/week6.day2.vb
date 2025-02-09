3:00 to 3:30 ---> ReadExcel
3:30 to 3:50 ---> Breakout+Break
3:50 to 4:30 ---> ExcelIntegration
4:30 to 4:40 ---> Break
4:40 to 5:00 ---> ScreenShot
5:00 to 5:45 ---> BDD introduction
5:45 to 6:00 --->Breakout

libraries:
1.Apache poi--->.xls,.xlsx
steps to create excelsheet in data folder:
1.rightclick--->project--->clicknew-->folder--->foldername-->data-->finish
2.right click on the folder--->show in--->system explorer-->doubleclick on data-->rightclick-->new--->ms excelsheet.

workbook--->no of worksheets--identify the worksheet--->identify the row---identify the cell

.xlsx--->XSSF

excel integration:

excelworkbook-->javapgm--->dataprovider--->testcase


@B.s
  @B.t
   @B.Class
     @dataprovider
       @B.method
            @TestSteps to do Excel Integration:
Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount String[][] data = new String[rowCount][columnCount];

Push stringCellValue to the Array data[i-1][j]=stringCellValue;

Close the workbook and return the data wBook.close(); return data;

Change main method to a normal static method public static String[][] readExcel(){

}

Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data @DataProvider(name="fetchData") public String[][] sendData() throws IOException { return ReadExcel.readExcel(); }

Move sendData() into the BaseClass and declare a fileName globally public String fileName; ------------ > Global declaration @DataProvider(name="fetchData") public String[][] sendData() throws IOException { return ReadExcel.readExcel(fileName); }

Create setValues() inside each testcase and annotate with @BeforeTest and mention the filename here @BeforeTest public void setValues() { fileName="EditLead";

}

Finally , run from the xml file