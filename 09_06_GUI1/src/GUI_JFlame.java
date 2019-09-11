
//화면 정가운데((한가위)frame 위치하기

import javax.swing.*;
        import java.awt.*;

public class GUI_JFlame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = screenSize.width;
        int 화h = screenSize.height;
        int 창w = 400;
        int 창h = 200;
        frame.setPreferredSize(new Dimension(창w, 창h));
        frame.setLocation((화w-창w)/2, (화h-창h)/2);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        JButton button = new JButton("오예!");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X버튼 -> 끝
    }
}
