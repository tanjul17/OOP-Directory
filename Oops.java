// import java.net.SocketTimeoutException;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();// p1 object
        p1.size[0] = 12;
        p1.size[1] = 13;
        p1.size[2] = 14;
       
        // Pen p2 = new Pen("sky");
        // Pen p3 = new Pen(5);
        Pen p2 = new Pen(p1);// copy
        p1.size[1] = 18;
        for (int i = 0; i < 3; i++) {
            System.out.println(p2.size[i]);
        }

        // p1.setColor("blue");
        // System.out.println(p1.getColor());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());
        // p1.setTip(4);
        // System.out.println(p1.getTip());

        // BankAccount b1=new BankAccount();
        // b1.username = "Tanjul Sarathe";
        // b1.setPassward("tsvit@123");
        // System.out.println(b1.username);
        // System.out.println(b1.setPassward);

    }

}

// class BankAccount {
// public String username;
// private String passward;
// public void setPassward(String pwd){
// passward =pwd;
// }
// }

class Pen {
    // prop + func
    String color;
    int tip;
    float price;
    int size[];

    // Shallow copy constructor
    // Pen(Pen p1) {
    // size = new int[3];
    // this.color = p1.color;
    // this.tip = p1.tip;
    // this.size =p1.size;
    // }
    // deep copy constructor
    Pen(Pen p1) {
        size = new int[3];
        this.color = p1.color;
        this.tip = p1.tip;
        // this.size = p1.size;
        for (int i = 0; i < size.length; i++) {
            this.size[i] = p1.size[i];
        }
    }

    Pen() {
        size = new int[3];
        System.out.println("Write here about pen");
    }// default constructor

    Pen(String color) {
        size = new int[3];
        this.color = color;
    }// paramtr constructor

    Pen(int tip) {
        size = new int[3];
        this.tip = tip;
    }// perameter constructor

    // String getColor() {
    // return this.color;
    // }

    // int getTip() {
    // return this.tip;
    // }

    // void setColor(String newColor) {
    // color = newColor;
    // }

    // void setTip(int newTip) {
    // tip = newTip;
    // }
}

// class student {
// String name;
// int age;
// float cgpa;

// void calc(int phy, int chem, int math) {
// cgpa = (phy + chem + math) / 3;
// }
// }