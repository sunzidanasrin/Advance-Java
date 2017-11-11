
package doms;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class DOMCreateXMLDemo {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Company");
            doc.appendChild(rootElement);
            
            //staff element
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);
            
            //set attribute to staff element
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            
            //Shorten way
            //staff.setAttribute("id","1");
            
            
            //firstname elements
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Anika"));
            staff.appendChild(firstname);
            
            //lastname elements
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Anan"));
            staff.appendChild(lastname);
            
            //nickname elements
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("Tropa"));
            staff.appendChild(nickname);
            
            //Slary Element
            Element Salary = doc.createElement("Salary");
            Salary.appendChild(doc.createTextNode("10000"));
            staff.appendChild(Salary);
            
            Element country = doc.createElement("country");
            country.appendChild(doc.createTextNode("Bangladesh"));
            staff.appendChild(country);
            
            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\git-urmi\\CoreJava\\XML\\src\\doms\\DOMCreateXMLDemo.xml"));
            
            //Output to console for testing
            //StreamResult result = new StreamResult
            
            transformer.transform(source, result);
            System.out.println("File Saved!");
            
        }catch (ParserConfigurationException pce){
            pce.printStackTrace();
        
        }catch (TransformerException tfe){
            tfe.printStackTrace();
        }
    }
}
