

/**
 * 具体的享元对象
 */
public class TrainTicket implements Ticket {
    private String from;
    private String to;
    private String bunk;
    private String cost;



    @Override
    public void show(String bunk) {
        this.bunk = bunk;
        System.out.println("购买了从"+this.from+"到"+this.to+"的火车"+"--铺位"+bunk);
    }


    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBunk() {
        return bunk;
    }

    public void setBunk(String bunk) {
        this.bunk = bunk;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
