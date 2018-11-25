package com.cybertek.package1;

//import com.cybertek.package2.*;
//import com.cybertek.package2.Class2;
//import com.cybertek.package2.Class3;


public class Class1 {

	public static void main(String[] args) {
		// There are 3 ways to access package from outside the package:
		//1 - import package.*
		//2 - import package.className
		//3 - fully qualified name
		
		//Class2 cl = new Class2();
		// or
		com.cybertek.package2.Class2 cl = new com.cybertek.package2.Class2();
		com.cybertek.package2.Class3 cl1 = new com.cybertek.package2.Class3();
	}

}
