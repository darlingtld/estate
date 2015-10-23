package estate.pojo.response;

/**
 * Created by tangl9 on 2015-10-23.
 */
public class Response {

    private String state;
    private Message message;
    private Object result;

    public Response(String state, Message message, Object result) {
        this.state = state;
        this.message = message;
        this.result = result;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
