package Handler;

import Request.IWomen;

public class Father extends Handler {

    public Father(int cur_level) {
        super(cur_level);
    }


    @Override
    protected void response(IWomen women) {
        System.out.println("女儿的请求是:"+women.getRequest());
        System.out.println("同意");
    }
}
