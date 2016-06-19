/*
 * SpinalHDL
 * Copyright (c) Dolu, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

package spinal.tester.scalatest

import spinal.core._
import spinal.lib._

object OperatorTester {


  class OperatorTester extends Component {
    val uint4 = in UInt(4 bits)
    val uint8 = in UInt(8 bits)
    val sint4 = in SInt(4 bits)
    val sint8 = in SInt(8 bits)
    val bits4 = in Bits(4 bits)
    val bits8 = in Bits(8 bits)
    val boolA,boolB = in Bool


    val uintNot = out(~uint4)
    val uintShiftLeftInt = out(uint8 << 4)
    val uintShiftLeftUint = out(uint8 << uint4)
    val uintShiftRightInt = out(uint8 >> 4)
    val uintShiftRightUint = out(uint8 >> uint4)

    val sintNot = out(~sint4)
    val sintShiftLeftInt = out(sint8 << 4)
    val sintShiftLeftUint = out(sint8 << uint4)
    val sintShiftRightInt = out(sint8 >> 4)
    val sintShiftRightUint = out(sint8 >> uint4)
    val sintMinus = out(-sint4)

    val bitsNot = out(~bits4)
    val bitsShiftLeftInt = out(bits8 << 4)
    val bitsShiftLeftUint = out(bits8 << uint4)
    val bitsShiftRightInt = out(bits8 >> 4)
    val bitsShiftRightUint = out(bits8 >> uint4)

    val uintSbEquals= out(uint4 === uint8)
    val uintSbNotEquals = out(uint4 =/= uint8)

    val uintSbAdd = out(uint4 + uint8)
    val uintSbSub = out(uint4 - uint8)
    val uintSbMul = out(uint4 * uint8)
    val uintSbDiv = out(uint4 / uint8)
    val uintSbRem = out(uint4 % uint8)

    val uintSbAnd = out(uint4 & uint8)
    val uintSbOr = out(uint4 | uint8)
    val uintSbXor = out(uint4 ^ uint8)

    val uintSbSmaller = out(uint4 < uint8)
    val uintSbSmallerEquals = out(uint4 <= uint8)
    val uintSbBigger = out(uint4 > uint8)
    val uintSbBiggerEquals = out(uint4 >= uint8)

    val sintSbEquals= out(sint4 === sint8)
    val sintSbNotEquals = out(sint4 =/= sint8)

    val sintSbAdd = out(sint4 + sint8)
    val sintSbSub = out(sint4 - sint8)
    val sintSbMul = out(sint4 * sint8)
    val sintSbDiv = out(sint4 / sint8)
    val sintSbRem = out(sint4 % sint8)

    val sintSbAnd = out(sint4 & sint8)
    val sintSbOr = out(sint4 | sint8)
    val sintSbXor = out(sint4 ^ sint8)

    val sintSbSmaller = out(sint4 < sint8)
    val sintSbSmallerEquals = out(sint4 <= sint8)
    val sintSbBigger = out(sint4 > sint8)
    val sintSbBiggerEquals = out(sint4 >= sint8)



    val bitsSbEquals= out(bits4 === bits8)
    val bitsSbNotEquals = out(bits4 =/= bits8)

    val bitsSbAnd = out(bits4 & bits8)
    val bitsSbOr = out(bits4 | bits8)
    val bitsSbXor = out(bits4 ^ bits8)



    val uintBsEquals= out(uint8 === uint4)
    val uintBsNotEquals = out(uint8 =/= uint4)

    val uintBsAdd = out(uint8 + uint4)
    val uintBsSub = out(uint8 - uint4)
    val uintBsMul = out(uint8 * uint4)
    val uintBsDiv = out(uint8 / uint4)
    val uintBsRem = out(uint8 % uint4)

    val uintBsAnd = out(uint8 & uint4)
    val uintBsOr = out(uint8 | uint4)
    val uintBsXor = out(uint8 ^ uint4)
    val uintBsNot = out(~uint8)

    val uintBsSmaller = out(uint8 < uint4)
    val uintBsSmallerEquals = out(uint8 <= uint4)
    val uintBsBigger = out(uint8 > uint4)
    val uintBsBiggerEquals = out(uint8 >= uint4)

    val sintBsEquals= out(sint8 === sint4)
    val sintBsNotEquals = out(sint8 =/= sint4)

    val sintBsAdd = out(sint8 + sint4)
    val sintBsSub = out(sint8 - sint4)
    val sintBsMul = out(sint8 * sint4)
    val sintBsDiv = out(sint8 / sint4)
    val sintBsRem = out(sint8 % sint4)

    val sintBsAnd = out(sint8 & sint4)
    val sintBsOr = out(sint8 | sint4)
    val sintBsXor = out(sint8 ^ sint4)
    val sintBsNot = out(~sint8)

    val sintBsSmaller = out(sint8 < sint4)
    val sintBsSmallerEquals = out(sint8 <= sint4)
    val sintBsBigger = out(sint8 > sint4)
    val sintBsBiggerEquals = out(sint8 >= sint4)

    val bitsBsEquals= out(bits8 === bits4)
    val bitsBsNotEquals = out(bits8 =/= bits4)

    val bitsBsAnd = out(bits8 & bits4)
    val bitsBsOr = out(bits8 | bits4)
    val bitsBsXor = out(bits8 ^ bits4)
    val bitsBsNot = out(~bits8)





    val boolEquals    = out(boolA === boolB)
    val boolNotEquals = out(boolA =/= boolB)
    
    val boolAnd = out(boolA & boolB)
    val boolOr = out(boolA | boolB)
    val boolXor = out(boolA ^ boolB)
    val boolNot = out(!boolA)



    val uintAsBits = out(uint8.asBits)
    val uintAsSint = out(uint8.asSInt)

    val sintAsBits = out(sint8.asBits)
    val sintAsUint = out(sint8.asUInt)

    val bitsAsUint = out(bits8.asUInt)
    val bitsAsSint = out(bits8.asSInt)

    val boolAsBits = out(boolA.asBits)
    val boolAsUInt = out(boolA.asUInt)
    val boolAsSInt = out(boolA.asSInt)



    val bitsResizeBigger  = out(bits8.resize(16))
    val bitsResizeSmaller = out(bits8.resize(4))

    val uintResizeBigger  = out(uint8.resize(16))
    val uintResizeSmaller = out(uint8.resize(4))

    val sintResizeBigger  = out(sint8.resize(16))
    val sintResizeSmaller = out(sint8.resize(4))

  }
}

class OperatorTesterCocotbBoot extends SpinalTesterCocotbBase {
  override def getName: String = "OperatorTester"
  override def createToplevel: Component =  new OperatorTester.OperatorTester
  override def pythonTestLocation: String = "tester/src/test/python/spinal/OperatorTester"
}