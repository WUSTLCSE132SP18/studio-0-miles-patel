
public class Heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		while(true)
		{
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
