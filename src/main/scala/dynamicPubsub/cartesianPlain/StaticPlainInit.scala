package dynamicPubsub.cartesianPlain

import dynamicPubsub.cartesianPlain.abstraction.Rectangle

object StaticPlainInit {
  def getRectangles:List[Rectangle] = {
    val points = 0.to(9).map(i => 0.to(9).map(j => new CartesianPoint(i, j)).toList).toList
    0.to(8).flatMap(i=>0.to(8).map(j=> new Rectangle(points(i)(j),points(i+1)(j+1)))).toList
  }
}
