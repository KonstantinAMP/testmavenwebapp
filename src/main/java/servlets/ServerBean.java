package servlets;

/**
 * Created by gijoe on 09.03.2015.
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "arg1", "arg2", "arg3" }, name = "serverBean")
@XmlRootElement
public class ServerBean {
    private String arg1;
    private String arg2;
    private String arg3;

    public ServerBean() {
        arg1 = "";
        arg2 = "";
        arg3 = "";
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }
}
