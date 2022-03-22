	package eventHandlingSpring;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "CustomEvent: [This is my custom event]";
	}

}