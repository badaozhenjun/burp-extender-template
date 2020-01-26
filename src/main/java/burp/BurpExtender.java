package burp;

import java.io.PrintWriter;

public class BurpExtender implements IBurpExtender,IHttpListener {
    private IBurpExtenderCallbacks callbacks;
    private IExtensionHelpers helpers;
    private PrintWriter stdout;
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;
        this.helpers = callbacks.getHelpers();
        callbacks.setExtensionName("MarkINFO");
        this.stdout = new PrintWriter(callbacks.getStdout(), true);
        this.callbacks.registerHttpListener(this);
//        this.callbacks.registerMessageEditorTabFactory(this);
        this.stdout.print("author: badaozhenjun");
    }


    public void processHttpMessage(int toolFlag, boolean messageIsRequest, IHttpRequestResponse messageInfo) {

    }

//    public IMessageEditorTab createNewInstance(IMessageEditorController controller, boolean editable) {
//        return null;
//    }
}
