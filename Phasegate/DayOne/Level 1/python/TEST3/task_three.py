def perfect_squares(numbers):
    result = []
    for num in numbers:
        square_root = 0
        for count in range(1, num + 1):
            if count * count <= num:
                square_root = count
        if square_root * square_root == num:
            result.append(num)
    return result
