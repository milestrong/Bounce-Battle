package com.miles.epik.window;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.miles.epik.framework.GameObject;
import com.miles.epik.framework.ObjectId;
import com.miles.epik.objects.Block;

public class Handler {

	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private GameObject tempObject;
	
	public void tick(){
		for(int i=0; i<object.size(); i++){
			tempObject = object.get(i);
			
			tempObject.tick(object);
		}
	}
	
	public void render(Graphics g){
		for(int i=0; i<object.size(); i++){
			tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);	
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	
	public void createLevel() throws IOException{
		List<String> lines = new ArrayList<String>();
		
		lines = addLine("map1.txt");
		int xval=0, yval=0;
		char temp;
		
		for(String s : lines){
			for(int i=0; i<s.length(); i++){
				temp = s.charAt(i);
				switch(temp){
					case 'b':
						addObject(new Block(xval, yval, ObjectId.Block));
						break;
				}
				xval += 32;
			}
			xval = 0;
			yval += 32;
		}
	}
	
	public static List<String> addLine(String path)throws IOException{
		List<String> strings = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		    String line;

		    while ((line = br.readLine()) != null) {
		       	strings.add(line);
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return strings;
	}
}
