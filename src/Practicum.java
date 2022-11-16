import java.util.Scanner;

public class Practicum {

    // ��������� ���������� ���� friendsContactBook, ������� ����� ������� � ���� ������ ������� ��������� ������
    private static ContactBook<Contact> friendsContactBook = new ContactBook<>();
            // �������� ���������� ����� colleaguesContactBook, classmatesContactBook � relativesContactBook,
            // ������� ����� ������� ������ ����������� �������, �������� � �������� ������� ��������������
            private static ContactBook<Contact> colleaguesContactBook = new ContactBook<>();
    private static ContactBook<Contact> classmatesContactBook = new ContactBook<>();
    private static ContactBook<Contact> relativesContactBook = new ContactBook<>();


    public static void main(String[] args) {
        fillBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("������� ����� ���! 1 - ��������� ������������, 0 - ��������� �������");
            int mainCommand = scanner.nextInt();
            if (mainCommand == 1) {
                System.out.println("����� ����� ��������� �������?");
                System.out.println("1 - ������, 2 - �������, 3 - �������������, 4 - ������������");

                int bookIndex = scanner.nextInt();
                if (bookIndex == 1) {
                    friendsContactBook.printList();
                } else if (bookIndex == 2) {
                    colleaguesContactBook.printList();
                } else if (bookIndex == 3) {
                    classmatesContactBook.printList();
                } else if (bookIndex == 4) {
                    relativesContactBook.printList();
                }

                System.out.println("���� �� ������ ����������? ������� ���:");
                String name = scanner.next();
                if (bookIndex == 1) {
                    friendsContactBook.congratulate(name);
                } else if (bookIndex == 2) {
                    colleaguesContactBook.congratulate(name);
                } else if (bookIndex == 3) {
                    classmatesContactBook.congratulate(name);
                } else if (bookIndex == 4) {
                    relativesContactBook.congratulate(name);
                }
            } else if (mainCommand == 0) {
                break;
            }
        }
    }

    private static void fillBooks() {
        friendsContactBook.addContact(new Phone("����", "+7-909-000-11-22"));
        friendsContactBook.addContact(new Phone("����", "+7-999-555-11-22"));
        friendsContactBook.addContact(new Phone("������", "+7-979-698-00-22"));

        colleaguesContactBook.addContact(new Email("���������", "sasha@sasha.ru"));
        colleaguesContactBook.addContact(new Email("�����", "pasha@pasha.ru"));
        colleaguesContactBook.addContact(new Email("����", "oleg@oleg.ru"));

        classmatesContactBook.addContact(new SocialNetworkContact("���", "�������", "olya"));
        classmatesContactBook.addContact(new SocialNetworkContact("����", "����������", "zhenya"));

        relativesContactBook.addContact(new Address("������", "������", "��������, �.8"));
        relativesContactBook.addContact(new Address("������", "�������", "������, �.10"));
    }

}