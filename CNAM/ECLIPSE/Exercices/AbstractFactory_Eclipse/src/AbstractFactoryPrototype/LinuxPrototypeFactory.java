package AbstractFactoryPrototype;

import old.AbstractScrollBar;
import old.AbstractWindow;
import old.LinuxScrollBar;
import old.LinuxWindow;
import old.WidgetFactory;

public class LinuxPrototypeFactory extends WidgetFactory {
	
	protected AbstractWindow linuxProto;
	
	protected AbstractScrollBar windowProto;


	public LinuxPrototypeFactory(){
		this.linuxProto = new LinuxWindow();
		this.windowProto= new LinuxScrollBar();
	}
	
	public AbstractWindow createWindow()
	{
		return this.linuxProto.clone();
	}

	@Override
	public AbstractScrollBar createScrollBar() {
		// TODO Auto-generated method stub
		return this.windowProto.clone();
	}
}
