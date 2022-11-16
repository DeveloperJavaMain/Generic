// ����������� ����� �� �������� ������, ������������ ������� Contact
public class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public String getUsername() {
        return username;
    }

    // ����� sendMessage �������������� ����� �������� ������
    @Override
    public void sendMessage() {
        System.out.println("�������� �������� ������ ������������� � ������� " + socialNetwork + ", ��� ������������ " + username);
    }

    @Override
    public void print() {
        System.out.println("���������� ����: " + socialNetwork);
        System.out.println("��� ������������: " + username);
    }
}