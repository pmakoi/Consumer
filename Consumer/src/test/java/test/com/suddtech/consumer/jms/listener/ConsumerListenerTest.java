package test.com.suddtech.consumer.jms.listener;

import static org.junit.Assert.*;

import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.suddtech.consumer.jms.listener.ConsumerLinstenerImpl;

public class ConsumerListenerTest {
	private TextMessage message;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnMessage() {
		ConsumerLinstenerImpl consumerListener = new ConsumerLinstenerImpl();
		consumerListener.onMessage(message);
		assertNull(message);
		
	}

}
