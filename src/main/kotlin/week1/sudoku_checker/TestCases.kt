package week1.sudoku_checker

import week1.common.check

fun main() {
    check(
        actual = isSudokuValid(completeValidSudoku),
        expected = true,
        name = "given complete valid sudoku then returns true"
    )
    check(
        actual = isSudokuValid(incompleteValidSudoku),
        expected = true,
        name = "given incomplete valid sudoku then returns true"
    )
    check(
        actual = isSudokuValid(validNumber16x16Sudoku),
        expected = true,
        name = "given sudoku when number exceeds grid size then returns true"
    )
    check(actual = isSudokuValid(emptySudoku), expected = true, name = "when given empty sudoku returns true")
    check(
        actual = isSudokuValid(duplicateInRowSudoku),
        expected = false,
        name = "given sudoku when duplicate in row then returns true"
    )
    check(
        actual = isSudokuValid(duplicateInColumnSudoku),
        expected = false,
        name = "given sudoku when duplicate in column then returns false"
    )
    check(
        actual = isSudokuValid(invalidCharValueSudoku),
        expected = false,
        name = "given sudoku when invalid value then returns false"
    )
    check(
        actual = isSudokuValid(invalidGridSizeSudoku),
        expected = false,
        name = "given sudoku when invalid grid size then returns false"
    )
    check(
        actual = isSudokuValid(invalidSubgridSizeSudoku),
        expected = false,
        name = "given invalid sudoku subgrid size then returns false"
    )
}
