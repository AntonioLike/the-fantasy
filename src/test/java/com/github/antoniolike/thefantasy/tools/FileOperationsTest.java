package com.github.antoniolike.thefantasy.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.nio.file.InvalidPathException;

import org.junit.jupiter.api.Test;



class FileOperationsTest {
	
	File file;
	
	@Test
	void testCreateDeleteFile() throws IOException {
		String filePath = "test.txt";
		testCreateFile(filePath);
		testDeleteFile(filePath);
	}
	
	@Test
	void testCreatedDeleteNestedFile() throws IOException{
		String filePath = "/a/test.txt";
		testCreateFile(filePath);
		testDeleteFile(filePath);
	}
	
	@Test
	void testCreateBadFile() throws IOException{
		String filePath = "\\\test";
		assertThrows(InvalidPathException.class, ()->testCreateFile(filePath));
	}
	
	@Test
	void testCreateRenameDeleteFile() throws IOException {
		String filePath = "test.txt";
		String newName = "newTest.txt";
		testCreateFile(filePath);
		testRenameFile(filePath, newName);
		testDeleteFile(newName);
	}
	
	@Test
	void testCreateWriteReadDeleteFile() throws IOException {
		String filePath = "test.txt";
		String text = "This is sample text.";
		testCreateFile(filePath);	
		testWriteToFile(filePath, text);
		testReadFromFile(filePath, text);
		testDeleteFile(filePath);
	}
	
	void testCreateFile(String filePath) throws IOException {		
		file = FileOperations.createFile(filePath);
		assertTrue(file.exists());
		assertEquals(filePath.replace('/', '\\'),file.getPath());
	}
	
	void testDeleteFile(String filePath) throws IOException {
		FileOperations.deleteFile(filePath);
		assertFalse(file.exists());
	}
	
	void testRenameFile(String filePath, String newName) throws IOException {
		assertEquals(newName,FileOperations.renameFile(filePath, newName).getName());
	}

	void testWriteToFile(String filePath, String text) throws IOException {
		FileOperations.writeToFile(filePath,text);
	}
	
	void testReadFromFile(String filePath, String text) throws IOException {
		String readText = FileOperations.readFromFile(filePath);
		assertEquals(text, readText);
	}
}
