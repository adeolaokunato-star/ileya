from unittest import TestCase
import task_three
class task_three_test(TestCase):
    def test_that_perfect_squares_are_returned(self):
        numbers  = [4, 7, 9, 10, 16, 18]
        actual   = task_three.perfect_squares(numbers)
        expected = [4, 9, 16]
        self.assertEqual(actual, expected)
