package old;

public class LinuxWindow extends AbstractWindow{
	public void test()
	{
		System.out.print("OHOH");
	}

	@Override
	public AbstractWindow clone() {
		// TODO Auto-generated method stub
		return new LinuxWindow();
	}
}
