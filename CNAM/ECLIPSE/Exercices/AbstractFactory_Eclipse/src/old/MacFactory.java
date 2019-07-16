package old;


public class MacFactory extends WidgetFactory{
	 public AbstractWindow createWindow(){ return new MacWindow(); }
	 public AbstractScrollBar createScrollBar(){ return new MacScrollBar(); }
	}