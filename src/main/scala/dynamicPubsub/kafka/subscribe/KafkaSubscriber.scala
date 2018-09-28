package dynamicPubsub.kafka.subscribe

import dynamicPubsub.cartesianPlain.{CartesianPoint, CartesianPointEvent}
import dynamicPubsub.generic.subscribe.Subscriber

class KafkaSubscriber(topic:String)
  extends Subscriber[CartesianPoint, CartesianPointEvent](topic){
  //TODO: add init code that gets the kafka consumer, then use it in subscribe/unsubscribe
  override def subscribe(consumer:CartesianPointEvent=>Unit): Unit = ???

  override def unsubscribe(): Unit = ???
}
