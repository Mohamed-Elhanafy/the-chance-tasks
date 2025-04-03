package week1.sudoku_checker

import kotlin.math.sqrt

fun main() {}

fun isSudokuValid(board: Array<String>): Boolean {
    val size = sqrt(board.size.toDouble()).toInt()
    if (size * size != board.size) return false

    val subGridSize = sqrt(size.toDouble()).toInt()
    if (subGridSize * subGridSize != size) return false

    val rows = Array(size) { HashSet<String>() }
    val cols = Array(size) { HashSet<String>() }
    val boxes = Array(size) { HashSet<String>() }

    for (i in 0 until size) {
        for (j in 0 until size) {
            val num = board[i * size + j]
            if (num == "-") continue

            val numericValue = num.toIntOrNull() ?: return false
            if (numericValue < 1 || numericValue > size) return false

            val boxIndex = (i / subGridSize) * subGridSize + (j / subGridSize)

            if (!rows[i].add(num) || !cols[j].add(num) || !boxes[boxIndex].add(num)) {
                return false
            }
        }
    }
    return true
}