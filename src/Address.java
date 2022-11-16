// ����������� ����� �� �������� ������, ������������ ������� Contact
public class Address extends Contact {
    private final String city;
    private final String address;

    public Address(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    // ����� sendMessage �������������� ����� �������� ������
    @Override
    public void sendMessage() {
        System.out.println("�������� �������� � ����� " + city + " �� ������: " + address);
    }

    @Override
    public void print() {
        System.out.println("�����: " + getCity());
        System.out.println("�����: " + getAddress());
    }

}