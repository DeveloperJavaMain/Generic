import java.util.ArrayList;
import java.util.List;

// ���������� ����� ContactBook ���, ����� �� ��� ������� � ���� ������ ������ ���������
public class ContactBook<T extends Contact> {
    // �������� ���� ������ contacts - ������ ��������� �����
    List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // �������� �� ����� ���� ������ ��������� �����
        for (T contact : contacts) {
            System.out.println("���: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false; //��������� ���� �� ������� � ����
        // ������� ������� � ����� �� �����, � ��������� ��� ��������� � ������� ������ sendMessage()
        for (T contact : contacts) {
            if (contactPresented) {
                System.out.println("��������� � ����� ����� ��� ������� �� �������� ������: " + name);
                contact.sendMessage();
            } else {
                // ���� ������� �� ������, �������� �������������� ���������
                System.out.println("�� ������ ������� � ��������� ������.");
            }

        }
    }
}