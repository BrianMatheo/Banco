package parameters;
public class Title {
    private String author;
    private double money;
    private double ingress;

    public Title(String author, double money, double ingress) {
        this.author = author;
        this.money = money;
        this.ingress = ingress;
    }
    
    public static void modifyMoney(double money, double ingress){
    money=money-ingress;
                if(money<=0){
                    System.out.println("withdrawals>money in account, so your account now is 0");
                    money = 0;
                }else{
        System.out.println("your money is " + money);
                }
}
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Title{" + "author=" + author + ", money=" + money + ", ingress=" + ingress + '}';
    }
    
    
    
}
