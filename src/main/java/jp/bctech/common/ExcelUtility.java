package jp.bctech.common;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import java.io.*;

public class ExcelUtility {
	public static void create() {
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("test");
		
		Row row1 = sheet.createRow(1);
		Cell cell1_1 = row1.createCell(1);
		cell1_1.setCellValue(123);
		
		Row row4 = sheet.createRow(4);
		Cell cell4_3 = row4.createCell(3);
		cell4_3.setCellValue("月曜日");
		
		FileOutputStream output = null;
		try {
			output = new FileOutputStream("test1_1.xls");
			workbook.write(output);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void createExcel() {
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("content");
		
		Row row1 = sheet.createRow(1);
		Row row4 = sheet.createRow(4);
		
		FileOutputStream output = null;
		try {
			output = new FileOutputStream("content.xls");
			workbook.write(output);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
				
	}
}
