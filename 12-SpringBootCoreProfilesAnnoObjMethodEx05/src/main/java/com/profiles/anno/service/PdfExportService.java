package com.profiles.anno.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class PdfExportService 
{
	private String fileExt;
	private String ftype;
}
