package xml;

import java.util.jar.Attributes;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXML {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean bfname = false;
                boolean bsalary = false;
                boolean bAge = false;

                @Override
                public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
                     System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("FullName")) {
                        bfname = true;
                    }
                    if (qName.equalsIgnoreCase("Age")) {
                        bAge = true;
                    }
                    if (qName.equalsIgnoreCase("Salary")) {
                        bsalary = true;
                    }
                }

                


                
                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End Element:" + qName);
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (bfname) {
                        System.out.println("Full Name : " + new String(ch, start, length));
                        bfname = false;
                    }
                    if (bAge) {
                        System.out.println("Age : " + new String(ch, start, length));
                        bAge = false;
                    }
                    if (bsalary) {
                        System.out.println("Salary : " + new String(ch, start, length));
                        bsalary = false;
                        System.out.println(" ");
                    }
                }

            };
            saxParser.parse("D:\\git-urmi\\CoreJava\\XML\\src\\xml\\company.XML", handler);
        } catch (Exception e) {
        }

    }
}
