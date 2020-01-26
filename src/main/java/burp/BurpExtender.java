package burp;

public class BurpExtender implements IBurpExtender {
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.setExtensionName("aaaa");
        callbacks.printOutput("hahahaha");
    }
}
