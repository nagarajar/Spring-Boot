package com.profiles.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.profiles.anno.service.ExportExcelService;
import com.profiles.anno.service.PdfExportService;


@Component
public class TestObjRunner implements CommandLineRunner 
{
	@Autowired(required = false)
	private ExportExcelService es;
	
	@Autowired(required = false)
	private PdfExportService pdfs;
	
	public void run(String... args) throws Exception {
		System.out.println(es);
		System.out.println(pdfs);
	}
}
