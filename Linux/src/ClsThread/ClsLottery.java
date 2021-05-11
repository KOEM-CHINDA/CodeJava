
package ClsThread;

import javax.swing.JButton;
import javax.swing.JTextField;


public class ClsLottery {
  private JTextField txt;
  private Thread th;
  private Runnable r = new Runnable() {
    @Override
    public void run() {
      try {
        int i = 0;
        while (true) {          
          txt.setText(""+i);
          i++;
          if(i==10)
            i=0;
          Thread.sleep(30);
        }
      } catch (Exception e) {
      }
    }
  };
  public void click(JTextField txt, JButton btn){
    this.txt = txt;
    if(btn.getText().equalsIgnoreCase("Start")){
      th = new Thread(r);
      th.start();
      btn.setText("Stop");
    }else{
      th.interrupt();
      btn.setText("Start");
    }
  }
}
