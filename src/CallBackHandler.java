import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class CallBackHandler extends DefaultHandler {

    private RoleMonitor roleMonitor;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("user")) {
            if (attributes.getLength() != 0) {
                roleMonitor.addRole(attributes.getValue("role"));
            } else {
                roleMonitor.addRole("non-role");
            }
        }
    }

    public RoleMonitor getRoleMonitor() {
        return roleMonitor;
    }

    public void setRoleMonitor(RoleMonitor roleMonitor) {
        this.roleMonitor = roleMonitor;
    }

}
