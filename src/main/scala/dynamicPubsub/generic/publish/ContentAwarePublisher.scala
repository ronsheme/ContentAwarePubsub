package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.{Event,Content}

class ContentAwarePublisher[C<:Content[C],E<:Event[C]](val provider:PublisherProvider[C,E]) {
  def publish(event:E):Unit={
    provider.getPublishers(event.getContent).foreach{p=>p.publish(event)}
  }
}
