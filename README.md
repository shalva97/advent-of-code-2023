# advent-of-code-2023

Welcome to the Advent of Code[^aoc] Kotlin project created by [shalva97][github] using the [Advent of Code Kotlin Template][template] delivered by JetBrains.

In this repository, shalva97 is about to provide solutions for the puzzles using [Kotlin][kotlin] language.

If you're stuck with Kotlin-specific questions or anything related to this template, check out the following resources:

- [Kotlin docs][docs]
- [Kotlin Slack][slack]
- Template [issue tracker][issues]

# Solutions
## Day 1
```kotlin
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
```
[^aoc]:
    [Advent of Code][aoc] – An annual event of Christmas-oriented programming challenges started December 2015.
    Every year since then, beginning on the first day of December, a programming puzzle is published every day for twenty-five days.
    You can solve the puzzle and provide an answer using the language of your choice.

[aoc]: https://adventofcode.com
[docs]: https://kotlinlang.org/docs/home.html
[github]: https://github.com/shalva97
[issues]: https://github.com/kotlin-hands-on/advent-of-code-kotlin-template/issues
[kotlin]: https://kotlinlang.org
[slack]: https://surveys.jetbrains.com/s3/kotlin-slack-sign-up
[template]: https://github.com/kotlin-hands-on/advent-of-code-kotlin-template
