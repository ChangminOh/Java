package Day1;

public class TicketMaker {
	private static TicketMaker ticketmaker = new TicketMaker();                             // static 으로 메모리에 객체를 생성

	private TicketMaker() {                                                                 // 생성자를 private 으로 두어 접근을 제한함
		ticket = 1000;
	}

	private int ticket ;

	public static TicketMaker getInstance() {												// 생성자를 반환하는 메소드
		return ticketmaker;
	}

	public int getNextTicketNumber() {
		return ticket++;
	}


	public static void main(String[] args) {
		TicketMaker a = TicketMaker.getInstance();											// getInstance를 하면 생성자를 반환하기 때문에 Type = TicketMaker 이다.

		System.out.println(a.getNextTicketNumber());

	}

}
