package design.Decorator;

public class Decorator extends Component{
	
	public Component com;
	
	public Decorator(Component c) {
		// TODO Auto-generated constructor stub
		this.com = c;
	}
	
	public void operator() {
		// TODO Auto-generated method stub
		com.operator();
	}

}
