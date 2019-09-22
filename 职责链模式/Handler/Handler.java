package Handler;

import Request.IWomen;

public abstract class Handler {
    private int FATHER_HANDLE_LEVEL = 0;
    private int HUSBAND_HANDLE_LEVEL = 1;
    private int SON_HANDLE_LEVEL = 2;

    private int cur_level = 0;
    private Handler mNext;


    public Handler(int cur_level) {
        this.cur_level = cur_level;
    }

    public Handler(int cur_level, Handler mNext) {
        this.cur_level = cur_level;
        this.mNext = mNext;
    }

    public int getCur_level() {
        return cur_level;
    }

    public void setCur_level(int cur_level) {
        this.cur_level = cur_level;
    }

    public void setmNext(Handler mNext) {
        this.mNext = mNext;
    }



    public final void handleMessage(IWomen women) {
        if (women.getType() == cur_level) {
            response(women);
            return;
        }
        if (mNext != null) {
            mNext.handleMessage(women);
            return;
        }
        System.out.println("没人能够处理,不同意");
    }


    protected abstract void response(IWomen women);

}
