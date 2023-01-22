package com.g7vfx.cs3103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;




public class JavaConn{
	public static void main(String args[]) {
		String protocol = "https";
		String domain = "cs3103.cs.unb.ca";
		String docpath = "g7vfx/index.html";
		String portno = "443";
		String url;
		
		System.out.println("Choose one of the below :- "+"\n"+"1)Default URL\n"+"2)Custom URL\n");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch(i) {
		case 1:
			try {
				url= protocol +"://"+ domain + ":" + portno + "/" + docpath;
				System.out.println("Default link created : " + url );
				
				URL myurl = new URL("https://cs3103.cs.unb.ca:443/g7vfx/index.html");

				try(
						BufferedReader reader = new BufferedReader(new InputStreamReader(myurl.openStream()));
						BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
						) {
					String line;
					while ((line = reader.readLine()) != null) {
						writer.write(line);
					}
					System.out.println("Page downloaded.");

				}
			}
			catch(Exception e) {System.out.println(e);
			}
		}
	}
}

class Link {

	String protocol = "https";
	String domain = "cs3103.cs.unb.ca";
	String docpath = "g7vfx/index.html";
	String portno = "443";
	String url;

	Link(){
		url= protocol +"://"+ domain + ":" + portno + "/" + docpath;
		System.out.println("Default link created : " + url );
	}	
	Link(String docpath){
		url= protocol +"://"+ domain + ":" + portno + "/"+ docpath;
		System.out.println("Default link created : " + url );
	}

}	

