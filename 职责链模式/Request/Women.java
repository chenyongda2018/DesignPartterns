package Request;


public class Women implements IWomen{

    private int type = 0;

    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }


    public void setType(int type) {
        this.type = type;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public String getRequest() {
        return null;
    }
}
