import org.apache.commons.lang3.StringUtils;

public class Twofer {
    public String twofer(String name) {
        return "One for " + StringUtils.defaultString(name, "you") + ", one for me.";
    }
}
