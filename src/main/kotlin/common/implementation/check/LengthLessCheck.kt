package common.implementation.check

import common.interfaces.Check

class LengthLessCheck(private val value: Number) : Check<String> {

    override fun test(x: String): Boolean {
        return x.length < value.toInt()
    }
}