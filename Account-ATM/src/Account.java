public class Account {
    private int accountNo;
    private String password;
    private double amount;
    private String customerName;

    public Account(){
        this.accountNo=0;
        this.password= "";
        this.amount= 0;
        this.customerName="";
    }

    public boolean checkLogin(int accNo, String password){
        return (this.accountNo==accNo && (password.equals(this.password)));

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }





}
