package Handler;

import Request.IWomen;

public class Husband extends Handler{

    public Husband(int cur_level) {
        super(cur_level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("妻子的请求是:"+women.getRequest());
        System.out.println("同意");
    }
}
