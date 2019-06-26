import java.util.HashMap;

/**
 * 保存享元对象的集合工厂，负责缓存享元对象 或者 创新的享元对象
 */
public class TicketFactory {

    private HashMap<String,Ticket> maps ;

    private static TicketFactory mTicketFactory;


    private TicketFactory (){
        maps = new HashMap<>();
    }
    public static TicketFactory getInstance() {
        if (mTicketFactory == null) {
            mTicketFactory = new TicketFactory();
        }
        return mTicketFactory;
    }

    public  Ticket getTicket(String from,String to) {
        String key = from+"--"+to;
        if (maps.containsKey(key)) {
            System.out.println("使用缓存");
            return maps.get(key);
        }

        System.out.println("新创建对象");
        Ticket ticket = new TrainTicket(from,to);
        maps.put(key,ticket);
        return ticket;

    }
}
