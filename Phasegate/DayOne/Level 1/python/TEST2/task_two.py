def replace_non_perfect_squares(numbers):    
    result = [0] * len(numbers)
    for count in range(len(numbers)):     
        square_root = 0
        for index in range(1, numbers[count] + 1):
            if index * index <= numbers[count]:
                square_root = index       
        if square_root * square_root == numbers[count]:
            result[count] = numbers[count]
        else:
            result[count] = -1                
    return result
