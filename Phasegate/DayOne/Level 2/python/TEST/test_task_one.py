from unittest import TestCase
import task_one
class task_one_test(TestCase):
    def test_that_zeros_are_moved_to_end(self):
        numbers  = [5, 0, 3, 0, 2, 0]
        actual   = task_one.move_zeros_to_end(numbers)
        expected = [5, 3, 2, 0, 0, 0]
        self.assertEqual(actual, expected)
