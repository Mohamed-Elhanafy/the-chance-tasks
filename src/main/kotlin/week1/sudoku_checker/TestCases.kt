package week1.sudoku_checker
/** ##### Test cases for `isSudokuValid()`
 * ###### valid test cases
 * - Valid complete valid Sudoku
 * - Valid incomplete valid Sudoku
 * ##### invalid testcases
 * - Duplicate in row
 * - Duplicate in column
 * - Duplicate in subgrid
 * - Empty Sudoku
 * - Invalid value (not 1-9 or '-')
 * - Invalid grid (Grid size is not a perfect square)
 * **/

fun main() {
    check(actual = isSudokuValid(), expected = true, name = "when given complete valid sudoku returns true")
    check(actual = isSudokuValid(), expected = true, name = "when given incomplete valid sudoku returns true")
    check(actual = isSudokuValid(), expected = false, name = "when given sudoku with duplicate in row returns false")
    check(actual = isSudokuValid(), expected = false, name = "when given sudoku with duplicate in column returns false")
    check(actual = isSudokuValid(), expected = false, name = "when given empty sudoku returns false")
    check(actual = isSudokuValid(), expected = false, name = "when given sudoku with invalid value returns false")
    check(actual = isSudokuValid(), expected = false, name = "when given sudoku with invalid grid returns false")
}

fun check(actual: Boolean, expected: Boolean, name: String) {
    if (actual == expected) {
        println("✓ - $name")
    } else {
        System.err.println("✗ - $name. Expected $expected, but got $actual")
    }
}

