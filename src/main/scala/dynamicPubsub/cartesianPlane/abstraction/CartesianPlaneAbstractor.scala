package dynamicPubsub.cartesianPlane.abstraction

import dynamicPubsub.cartesianPlane.CartesianPoint
import dynamicPubsub.generic.content.{ContentAbstraction, ContentAbstractor}

class CartesianPlaneAbstractor extends ContentAbstractor[CartesianPoint]{
  override def abstractContent(content: CartesianPoint): List[ContentAbstraction[CartesianPoint]] = ???
}
