//Bradley Ayers
//QAP 1
//September 24, 2024

public class AccountTest {
    public static void main(String[] args) {
        Account Acc1 = new Account("ACC001","Bill Gates", 5000);
        Account Acc2 = new Account("ACC002","Jeff Bezos", 4000);
        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());
        Acc1.transferTo(Acc2, 1000);
        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());
    }
}