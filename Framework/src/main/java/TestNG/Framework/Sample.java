package TestNG.Framework;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Sample {

	public static void main(String[] args){
		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setName("CodeMapper");
		xmlSuite.setParallel("false");
		xmlSuite.setVerbose(1);
		
		XmlTest xmlTest = new XmlTest(xmlSuite);
		xmlTest.setName("Test - 1");
		xmlTest.setPreserveOrder("true");
		
		XmlClass publicTestClass = new XmlClass(Login.class);
		
		List<XmlClass> list = new ArrayList<XmlClass>();
		list.add(publicTestClass);
		
		xmlTest.setXmlClasses(list);
		
		TestNG testng = new TestNG();
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlSuite);
		
		testng.setXmlSuites(suites);
		testng.run();
		}
	
}
