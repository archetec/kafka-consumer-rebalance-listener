/**
 * 
 */
package ia.iafg.kafka.rebalancelistener;

import java.util.Collection;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.common.TopicPartition;

/**
 * @author emorin
 *
 */
public class IAConsumerRebalanceListener implements ConsumerRebalanceListener {
	
	private long startTime;

	public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
		System.out.println("Consumer rebalance process started");
		startTime = System.currentTimeMillis();
	}

	public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
		System.out.println("Consumer rebalance process stopped, time " + (System.currentTimeMillis() - startTime));
	}

}
