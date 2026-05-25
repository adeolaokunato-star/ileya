from unittest import TestCase
import task_one
class task_one_test(TestCase):
    def test_that_even_numbers_are_returned(self):
        numbers  = [45, 60, 3, 10, 9, 22]
        actual   = task_one.even_numbers(numbers)
        expected = [60, 10, 22]
        self.assertEqual(actual, expected)
    def test_that_odd_numbers_are_returned(self):
        numbers  = [45, 60, 3, 10, 9, 22]
        actual   = task_one.odd_numbers(numbers)
        expected = [45, 3, 9]
        self.assertEqual(actual, expected)
