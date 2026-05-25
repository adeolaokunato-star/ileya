def move_zeros_to_end(numbers):
    result = []
    for index in range(len(numbers)):
        if numbers[index] != 0:
            result.append(numbers[index])
    for index in range(len(numbers)):
        if numbers[index] == 0:
            result.append(0)
    return result
