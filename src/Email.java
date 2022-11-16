// ����������� ����� �� �������� ������, ������������ ������� Contact
public class Email extends Contact {
    private final String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // ����� sendMessage �������������� ����� �������� ������
    @Override
    public void sendMessage() {
        System.out.println("�������� ���������� �������� ������� �� ����������� ����� " + email);
    }

    @Override
    public void print() {
        System.out.println("Email: " + getEmail());
    }
}