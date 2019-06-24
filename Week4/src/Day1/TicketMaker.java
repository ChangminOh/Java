package Day1;

public class TicketMaker {
	private static TicketMaker ticketmaker = new TicketMaker();                             // static ���� �޸𸮿� ��ü�� ����

	private TicketMaker() {                                                                 // �����ڸ� private ���� �ξ� ������ ������
		ticket = 1000;
	}

	private int ticket ;

	public static TicketMaker getInstance() {												// �����ڸ� ��ȯ�ϴ� �޼ҵ�
		return ticketmaker;
	}

	public int getNextTicketNumber() {
		return ticket++;
	}


	public static void main(String[] args) {
		TicketMaker a = TicketMaker.getInstance();											// getInstance�� �ϸ� �����ڸ� ��ȯ�ϱ� ������ Type = TicketMaker �̴�.

		System.out.println(a.getNextTicketNumber());

	}

}
