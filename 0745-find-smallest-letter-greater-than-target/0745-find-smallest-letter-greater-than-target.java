class Solution {
  char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (letters[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    // If start is out of bounds, wrap around to the first element
    return start < letters.length ? letters[start] : letters[0];
  }
}