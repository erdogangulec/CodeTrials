import java.util.Timer;
import java.util.TimerTask;

public class dess5 {

	public dess5() {
		// TODO Auto-generated constructor stub
	}
	static int sayac = 20;

	public static void main(String[] args) {
		Timer myTimer = new Timer();

		TimerTask gorev = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				sayac--;
				System.out.println(sayac);
				if (sayac == 0)
					myTimer.cancel();
			}
		};

		TimerTask gorev2 = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Ýkinci görev çalýþýyor");

			}
		};

		myTimer.schedule(gorev, 300, 3000);
		myTimer.schedule(gorev2, 200, 6000);

	}

}
