import javax.swing.*;

public class GUI_JFlame {
    public static void main(String[]args){
        JFrame frame = new JFrame("창이름");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X 버튼 누르면 끝
    }
}
