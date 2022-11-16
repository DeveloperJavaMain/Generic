// ��������� ���������� ������ Contact
public abstract class Contact {
    // ����� ������ ��������� ���� ���� - ��� ������������ name
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    // � ��� ������ - sendMessage() ��� �������� ��������� � print() ��� ������ ���������� � ��������
    abstract void sendMessage();
    abstract void print();

    public String getName() {
        return name;
    }
}