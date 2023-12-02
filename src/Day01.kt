fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { line ->
            "${line.first { it.isDigit() }}${line.last { it.isDigit() }}".toInt()
        }
    }

    fun part2(input: List<String>): Int {
        return input.map {
            it
                .replace("eightwo", "82")
                .replace("oneight", "18")
                .replace("twone", "21")
                .replace("threeight", "38")
                .replace("fiveight", "58")
                .replace("sevenine", "79")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
        }.run(::part1)
    }

    val testInput = readInput("Day01_test")
    part1(testInput).println()
    part2(testInput).println()
}
