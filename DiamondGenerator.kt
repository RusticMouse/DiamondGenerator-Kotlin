object DiamondGenerator {
    fun createDiamond(size: Int, symbol: String?): String {
        val diamond = StringBuilder()
        for (i in 1..size) {
            for (j in size - 1 downTo i) {
                diamond.append(" ")
            }
            for (k in 1..2 * i - 1) {
                diamond.append(symbol)
            }
            diamond.append("\n")
        }
        for (i in size - 1 downTo 1) {
            for (j in i until size) {
                diamond.append(" ")
            }
            for (k in 1..2 * i - 1) {
                diamond.append(symbol)
            }
            diamond.append("\n")
        }
        return diamond.toString()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(createDiamond(5, "#"))
    }
}
