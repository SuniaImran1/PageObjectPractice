package Java_Practice;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParsedXML {

	public String getXpathValueFromXML(String xpathString, Document doc) {

		XPathFactory xpathfactory = XPathFactory.newInstance();

		XPath xpath = xpathfactory.newXPath();
		XPathExpression xPathExpression;
		try {
			xPathExpression = xpath.compile(xpathString);

			return xPathExpression.evaluate(doc);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "NOT FOUND";

	}

	public static void main(String[] args) throws Exception {
		File file = new File("/home/SImran/Documents/workspace-wspip/Testing/src/employee.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 factory.setNamespaceAware(true);
		 factory.setAttribute("gh", "https://graphhopper.com/public/schema/gpx/1.1");
		DocumentBuilder docbuilder = factory.newDocumentBuilder();
		Document doc = docbuilder.parse(file);

		ParsedXML xmlParser = new ParsedXML();

		System.out.println(xmlParser.getXpathValueFromXML("//employee[1]/location", doc));
		System.out.println(xmlParser.getXpathValueFromXML("//employee[2]/lastName", doc));
		System.out.println(xmlParser.getXpathValueFromXML("//employee[3]/lastName", doc));
	}

}
