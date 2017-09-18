import javax.swing.JOptionPane;

//THIS IS MY FIRST EVER MINI PROJECT :)
class Calc{
    public static void main(String[] args){
           calculator();
       
    }
    public static void calculator(){
        int fNumber = 0;
        int sNumber = 0;
        int solve = 0;
        String answer = "aasfd";
        String op = JOptionPane.showInputDialog("What Operator Would You Like To Use: ");
        switch(op){
            case "multiply":
            fNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
            sNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
            solve = fNumber * sNumber;
            JOptionPane.showMessageDialog(null, "Your Solution Is: "+ solve);
            answer = JOptionPane.showInputDialog("Use Again? Type Yes or No");
            if(answer == "Yes"){
                calculator();
                System.out.println("Entry Test");
            };
            case "divide":
            fNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
            sNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
            solve = fNumber * sNumber;
            JOptionPane.showMessageDialog(null, "Your Solution Is: "+ solve);
            answer = JOptionPane.showInputDialog("Use Again? Type Yes or No");
            if(answer == "Yes"){
                calculator();
                System.out.println("Entry Test");
            };
    
        }
    }
}
