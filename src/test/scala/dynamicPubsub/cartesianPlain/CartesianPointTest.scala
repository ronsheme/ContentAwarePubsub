package dynamicPubsub.cartesianPlain

import org.scalatest.FlatSpec

class CartesianPointTest extends FlatSpec {

  "(0,0)" should " be less-than-equal (1,1)" in{
    assert(new CartesianPoint(0,0).lte(new CartesianPoint(1,1)))
  }

  it should " equals to (0,0)" in{
    assert(new CartesianPoint(0,0) == new CartesianPoint(0,0))
  }

  "(0,2)" should " not be less-than-equal (1,1)" in{
    assert(!new CartesianPoint(0,2).lte(new CartesianPoint(1,1)))
  }

  "(2,2)" should " not be less-than-equal (1,1)" in{
    assert(!new CartesianPoint(2,2).lte(new CartesianPoint(1,1)))
  }
}
