package dynamicPubsub.cartesianPlain.abstraction

import dynamicPubsub.cartesianPlain.CartesianPoint
import dynamicPubsub.generic.content.{ContentAbstraction, ContentAbstractor}

class CartesianPlainAbstractor extends ContentAbstractor[CartesianPoint]{
  override def abstractContent(content: CartesianPoint): List[ContentAbstraction[CartesianPoint]] = ???
}
