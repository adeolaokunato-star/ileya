def even_numbers(numbers):
    even = []
    for num in numbers:
        if num % 2 == 0:
            even.append(num) 
    return even
def odd_numbers(numbers):  
    odd = []   
    for num in numbers:               
        if num % 2 != 0:
            odd.append(num) 
    return odd
