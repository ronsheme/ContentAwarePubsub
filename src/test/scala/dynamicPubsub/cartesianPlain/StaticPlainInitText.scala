package dynamicPubsub.cartesianPlain

import org.scalatest.FlatSpec

class StaticPlainInitText extends FlatSpec {

  "(0,0)->(1,1)" should " be a rectangle in the rectangle list " in{
    assert(StaticPlainInit.getRectangles.map(rect=>rect.toString).contains("(0,0)->(1,1)"))
  }

  "(0,0)->(0,1)" should " not be a rectangle in the rectangle list " in{
    assert(!StaticPlainInit.getRectangles.map(rect=>rect.toString).contains("(0,0)->(0,1)"))
  }
}
