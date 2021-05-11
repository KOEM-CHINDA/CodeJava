
package ClsThread;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ClsThread {
  private JTextField txt;
  private JButton btn;

  public ClsThread(JTextField txt, JButton btn) {
    this.txt = txt;
    this.btn = btn;
  }
  public void click(){
    if(btn.getText().equals("Start")){
      btn.setText("Stop");
      
      th.start();
    }
    else{
      btn.setText("Start");
      btn.setEnabled(false);
      th.interrupt();
    }
      
  }
  private Thread th = new Thread(() -> {
    try {
      Random ran = new Random();
      while(true){
        int i = ran.nextInt(10);
        txt.setText(""+i);
        Thread.sleep(10);
      }
    } catch (Exception e) {}
  });
  
}
