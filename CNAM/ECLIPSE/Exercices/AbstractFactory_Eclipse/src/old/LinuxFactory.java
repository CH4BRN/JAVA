package old;



public //====== concrete factories ======
class LinuxFactory extends WidgetFactory{
	 public AbstractWindow createWindow(){ return new LinuxWindow(); }
	 public AbstractScrollBar createScrollBar(){ return new LinuxScrollBar(); }
	}