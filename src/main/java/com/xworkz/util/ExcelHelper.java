package com.xworkz.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ExcelHelper {

	static Logger logger = LoggerFactory.getLogger(ExcelHelper.class);

	public ExcelHelper() {
		logger.info("{} is created", this.getClass().getSimpleName());
	}

	public List<String> getContactListFromInputStream(InputStream inputStream) {
		List<String> mobileNumList = new ArrayList<String>();
		try {
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet excelSheet = workbook.getSheetAt(0);
			logger.info("Last Row Number Is: " + excelSheet.getLastRowNum());
			logger.info("Excel file Is opened");
			logger.info("Size of Excel is {}", excelSheet.getLastRowNum());
			Row row;
			for (int i = 0; i <= excelSheet.getLastRowNum(); i++) {
				row = (Row) excelSheet.getRow(i);
				logger.debug("Data type is {}", row.getCell(0).getCellType());
				if (row.getCell(0).getCellType() == 0) {
					Long long1 = (long) row.getCell(0).getNumericCellValue();
					logger.info("String is {}", long1);
					mobileNumList.add(String.valueOf(long1));
				}
			}
		} catch (Exception e) {
			logger.error("error is {} and message is {}", e, e.getMessage());
		}
		return mobileNumList;
	}
}
