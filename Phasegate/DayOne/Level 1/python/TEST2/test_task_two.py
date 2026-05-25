from unittest import TestCase
import task_two
class task_two_test(TestCase):
    def test_that_non_perfect_squares_are_replaced(self):
        numbers  = [4, 7, 9, 10, 16, 18]
        actual   = task_two.replace_non_perfect_squares(numbers)
        expected = [4, -1, 9, -1, 16, -1]
        self.assertEqual(actual, expected)
