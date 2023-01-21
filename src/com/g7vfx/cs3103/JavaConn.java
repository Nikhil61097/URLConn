package com.g7vfx.cs3103;

import java.net.URI;
import java.util.Scanner;




public class JavaConn{
	public static void main(String args[]) {
		Link link = new Link(); 

		System.out.println("Choose one of the below :- "+"\n"+"1)Default URL\n"+"2)Custom URL\n");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch(i) {
		case 1:
			try {
				URI myurl = new URI(link.url);
				java.awt.Desktop.getDesktop().browse(myurl);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			break;
		case 2:

			System.out.println("Enter docpath\n");
			String docpath_name= sc.next();
			Link link1 = new Link(docpath_name);
			try {
				URI myurl1 = new URI(link1.url);
				java.awt.Desktop.getDesktop().browse(myurl1);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			break;
		}

	}

}

class Link {

	String protocol = "https";
	String domain = "cs3103.cs.unb.ca";
	String docpath = "/g7vfx/index.html";
	String portno = "443";
	String url;

	Link(){
		url= protocol +"://"+ domain  + docpath;
		System.out.println("Default link created : " + url );
	}	
	Link(String docpath){
		url= protocol + "://" + domain + docpath;
		System.out.println("Default link created : " + url );
	}

}		

