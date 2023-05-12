package review.behavioralPatterns.responsility;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public RequestHandler setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handleRequest(Request request) {
        if (canHandle(request)) {
            handle(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for the request.");
        }
    }

    protected abstract boolean canHandle(Request request);

    protected abstract void handle(Request request);
}

class XMLHandler extends RequestHandler {
    @Override
    protected boolean canHandle(Request request) {
        return "XML".equals(request.getName());
    }

    @Override
    protected void handle(Request request) {
        System.out.println(request.getData());
    }
}

class JSONHandler extends RequestHandler {

    @Override
    protected boolean canHandle(Request request) {
        return "JSON".equals(request.getName());
    }

    @Override
    protected void handle(Request request) {
        System.out.println(request.getData());
    }
}

class TextHandler extends RequestHandler {

    @Override
    protected boolean canHandle(Request request) {
        return "TEXT".equals(request.getName());
    }

    @Override
    protected void handle(Request request) {
        System.out.println(request.getData());
    }
}

class Request {
    private String name;
    private String data;

    public Request(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}

class Client {
    public static void main(String[] args) {
        RequestHandler handler = new XMLHandler();
        handler.setNextHandler(new JSONHandler())
                .setNextHandler(new TextHandler());


//        Request xmlRequest = new Request("XML", "<data>some data</data>");
//        handler.handleRequest(xmlRequest);
//
//        Request jsonRequest = new Request("JSON", "{\"data\":\"some data\"}");
//        handler.handleRequest(jsonRequest);

        Request textRequest = new Request("TEXT", "some data");
        handler.handleRequest(textRequest);

    }
}
