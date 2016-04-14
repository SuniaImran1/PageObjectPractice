package helpers;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class testXpathXml {

	File file;
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder documentbuilder;
	Document doc;
	XPathFactory xpathfactory = XPathFactory.newInstance();
	XPath XPATH = xpathfactory.newXPath();
	XPathExpression xpathexpression;

	testXpathXml(String filePath) {
		file = new File(filePath);
		try {

			documentbuilder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {

		}
	}

	

	public String getXpathValueFromXMLFile(String xpath) throws Exception {

		doc = documentbuilder.parse(file);

		// ctreate xpathfactory object

		// create xpath object

		xpathexpression = XPATH.compile(xpath);
		return xpathexpression.evaluate(doc);

		
		
	}
	
	public String getXpathValueFromXMLStream(InputStream is,String xpath)
	{
		
		try {
			doc=documentbuilder.parse(is);
			xpathexpression = XPATH.compile(xpath);
			return xpathexpression.evaluate(doc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		} 
		
		
	}
	public void sendGet() throws Exception{
		
	}
}
