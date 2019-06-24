import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            CallBackHandler callBackHandler = new CallBackHandler();
            callBackHandler.setRoleMonitor(new RoleMonitor());
            saxParser.parse(new File("feed.xml"), callBackHandler);
            RoleMonitor roleMonitor = callBackHandler.getRoleMonitor();
            System.out.println(roleMonitor.out());
        } catch (ParserConfigurationException | SAXException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
