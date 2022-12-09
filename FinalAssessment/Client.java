package FinalAssessment;


class Window{
	public void get() {
		
	}
}

class PMWindow extends Window{
	public void get() {
	System.out.println("In PMWindow");
}
}

class MotifWindow extends Window{
	public void get() {
	System.out.println("In MotifWindow");
}
}

class ScrollBar{
	public void get() {
		
	}
}

class PMScrollBar extends ScrollBar{
	public void get() {
	System.out.println("In PMScrollBar");
}
}

class MotifScrollBar extends ScrollBar{
	public void get() {
	System.out.println("In MotifScrollBar");
}
}

abstract class WidgetFactory{
	public abstract ScrollBar CreateScrollBar();
	public abstract Window CreateWindow();
		
}

class MotifWidgetFactory extends WidgetFactory{
	public ScrollBar CreateScrollBar(){
		return new MotifScrollBar();
	}
	public Window CreateWindow() {
		return new MotifWindow();
	}
	
}

class PMWidgetFactory extends WidgetFactory{
	public ScrollBar CreateScrollBar(){
		return new PMScrollBar();
	}
	public Window CreateWindow() {
		return new PMWindow();
	}
	
}


public class Client {
	
	public static void main(String args[]) {
		WidgetFactory wf;
		Window w;
		ScrollBar sb;
		
		wf=new MotifWidgetFactory();
		w=wf.CreateWindow();
		w.get();
		sb=wf.CreateScrollBar();
		sb.get();
		
		wf=new PMWidgetFactory();
		w=wf.CreateWindow();
		w.get();
		sb=wf.CreateScrollBar();
		sb.get();
		
	}
	
}
