package com.github.antoniolike.thefantasy.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileOperations {

	public static File createFile(String filePath) throws IOException {
		Path path = Paths.get(filePath);
		if(path!=null&&path.getParent()!=null&&!path.getParent().toString().isEmpty())
			Files.createDirectories(path.getParent());
		if(!path.toFile().exists())
			Files.createFile(path);
		return path.toFile();
	}

	public static void deleteFile(String filePath) throws IOException {
		Path path = Paths.get(filePath);
		Files.deleteIfExists(path);		
	}

	public static File renameFile(String filePath, String newName) throws IOException {
		Path path = Paths.get(filePath);
		Path newPath = Paths.get(newName);
		Files.move(path, newPath,StandardCopyOption.REPLACE_EXISTING);
		return newPath.toFile();
	}

	public static void writeToFile(String filePath, String text) throws IOException {
		File file = Paths.get(filePath).toFile();
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pw.println(text);
		pw.close();
	}

	public static String readFromFile(String filePath) throws IOException {
		File file = Paths.get(filePath).toFile();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = br.readLine();
		br.close();
		return text;
	}

}
