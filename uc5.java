def validate_move(board, row, col):
    # Boundary checking (row and column must be between 0 and 2)
    if row < 0 or row > 2 or col < 0 or col > 2:
        return False, "Move out of bounds"

    # Defensive programming: check if inputs are integers
    if not isinstance(row, int) or not isinstance(col, int):
        return False, "Invalid input type"

    # Check if the cell is empty
    if board[row][col] != " ":
        return False, "Cell already occupied"

    # If all checks pass
    return True, "Move accepted"