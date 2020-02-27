import java.util.Scanner;

public class Data {
    int alph;
    String state;
    Data(){
        this.alph = -99;
        this.state = " ";
    }
    private void setAlph(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the alphabet(1,0): ");
        this.alph = in.nextInt();
        in.close();
    }
    private void setState(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the next state: ");
        this.state = in.nextLine();
        in.close();
    }
    public int getAlph(){
        return this.alph;
    }
    public String getState(){
        return this.state;
    }


}
