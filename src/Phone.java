// ����������� ����� �� �������� ������, ������������ ������� Contact
public class Phone extends Contact {
    private final String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // ����� sendMessage �������������� ����� �������� ������
    @Override
    public void sendMessage() {
        System.out.println("������ ����� �� ������ " + phoneNumber + " � ����� �� ����.");
    }

    @Override
    public void print() {
        System.out.println("����� ��������: " + getPhoneNumber());
    }
}