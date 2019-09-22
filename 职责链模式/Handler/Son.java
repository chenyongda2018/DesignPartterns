package Handler;

import Request.IWomen;

public class Son extends Handler{

    public Son(int cur_level) {
        super(cur_level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲的请求是:"+women.getRequest());
        System.out.println("我同意");
    }
}
