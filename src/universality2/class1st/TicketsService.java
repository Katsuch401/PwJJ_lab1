package universality2.class1st;

import java.util.List;

public class TicketsService {
    public static List<Seance> seanceList;

    public void getTicket(Customer customer, Seance seance){
        customer.setSeance(seance);

    }
}
