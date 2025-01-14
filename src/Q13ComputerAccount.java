public class Q13ComputerAccount {
    private String realName;
    private String userName;
    private String password;

    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    public void printRealName() {
        System.out.println("Real Name: " + realName);
    }

    public void printUserName() {
        System.out.println("User Name: " + userName);
    }

    public void printPassword() {
        System.out.println("Password: " + password);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password changed...");
    }
}
