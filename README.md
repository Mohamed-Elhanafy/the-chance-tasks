udoku Validator

Validates whether a Sudoku puzzle follows the standard rules:

- Board must be a perfect square
- Subgrid must be a perfect square
- No duplicates in rows, columns, or subgrids
- All values must be valid (1 to n where n is board size)

### Time Complexity

- **O(n²)** where n is the width of the board
- Uses hash sets for constant-time lookups
### flowchart
![screenshot](res/_Sudoku_checker_light_drawio.png)
---
