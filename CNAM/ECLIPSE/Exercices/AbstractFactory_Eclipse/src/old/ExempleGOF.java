package old;

import AbstractFactoryPrototype.LinuxPrototypeFactory;

//====== client ======
public class ExempleGOF{
 public static void main(String[] args){
     
     AbstractWindow myWindow;
     AbstractScrollBar myScroll;
     
     WidgetFactory factory1 = new LinuxFactory();
     myWindow = factory1.createWindow();
     myScroll = factory1.createScrollBar();
     System.out.println("\n=== LinuxFactory ===");
     System.out.println("    Window : " + myWindow);
     System.out.println("    ScrollBar : " + myScroll);
     
     WidgetFactory factory2 = new MacFactory();
     myWindow = factory2.createWindow();
     myScroll = factory2.createScrollBar();
     System.out.println("\n=== MacFactory ===");
     System.out.println("    Window : " + myWindow);
     System.out.println("    ScrollBar : " + myScroll);
     
     var factory = new LinuxPrototypeFactory();
     var thing = factory.createWindow();
     var scroll = factory.createScrollBar();
     
     
     System.out.println(thing.getClass().getSimpleName() );
     System.out.println(scroll.getClass().getSimpleName());
 }
}
 


