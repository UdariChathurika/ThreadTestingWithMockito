import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class ProducerConsumerDemoTest {

    ProducerConsumerDemo.Producer producerObj;
    ProducerConsumerDemo.Consumer consumerObj;


    @Before
    public void create(){
        producerObj = mock(ProducerConsumerDemo.Producer.class);
        consumerObj = mock(ProducerConsumerDemo.Consumer.class);

    }

    @Test
    public void producerThreadShouldCall(){
        Mockito.verify(producerObj,times(1));

    }

    @Test
    public void consumerThreadShouldCall(){
        Mockito.verify(consumerObj,times(1));

    }



}
