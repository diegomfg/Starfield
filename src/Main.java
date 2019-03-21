
public class Main {

	public static void main(String[] args)
	{
		Display display = new Display(800, 600, "Software Rendering");
		Bitmap target = display.GetFrameBuffer();
		Stars3D stars = new Stars3D(1000, 64.0f, 10.0f);

		long previousTime = System.nanoTime();
		while(true)
		{
			long currentTime = System.nanoTime();
			float delta = (float)((currentTime - previousTime)/1000000000.0);
			previousTime = currentTime;

			stars.UpdateAndRender(target, delta);

			display.SwapBuffers();
		}
	}
}
