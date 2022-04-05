import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu {
    
    private static final int MENU_HEIGHT = 100;
    private static final int MENU_WIDTH = 600;
    public static void main( String[] args ){

        JFrame menu = new JFrame( "MENU" );
        JButton schedule = new JButton( "模擬課表" );
        JButton courseSort = new JButton( "歷年加簽資訊統整");
        JButton recommend = new JButton( "排薦擺放志願序" );
        
        menu.setLayout( new GridLayout(1,3) );
        menu.setSize( MENU_WIDTH, MENU_HEIGHT );

        menu.add( schedule );
        menu.add( courseSort );
        menu.add( recommend );

        schedule.addActionListener( new ScheduleListener() );

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible( true );

    }
    
}


/*
1
000318081	初級會計學（二）	黃政仁	3.0	二78E/商館260306	已額滿
7
000348071	管理學	廖經維	3.0	一EFG/研究250103	已額滿
16
002344001	體育[男女合班]—土風舞初級	曾明生	1.0	五12/	正常
25
031008041	國文－古典小說選讀	洪敬清	3.0	二D56/資訊140205	正常
30
042137001	法學素養	陳靜慧	3.0	三78E/綜合270751	正常
35
043038001	計算思維	劉吉軒	3.0	四78E/綜合270101	已額滿
38
090114001	數位轉型的智權與風險管理	萬幼筠	2.0	五78/資訊140104	老師異動於2022/01/07
42
306050011	程式設計二	林怡伶	2.0	二23/資管電腦室	已額滿
36
090020001	認識中醫藥	邱榮鵬	2.0	五78/資訊140201	已額滿
40
306048001	管理科學	周彥君等	3.0	三234/商館260105	已額滿
*/