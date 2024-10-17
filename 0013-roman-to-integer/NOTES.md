​# Explanation of the Roman to Integer Code

## Problem Overview
The task is to convert a given Roman numeral string into its corresponding integer value. Roman numerals use seven symbols: `I, V, X, L, C, D, M`, and follow specific rules of addition and subtraction. For example:
- `III = 3` (I + I + I)
- `IV = 4` (5 - 1)
- `IX = 9` (10 - 1)
- `LVIII = 58` (50 + 5 + 3)

The goal is to traverse the string and calculate the integer representation of the given Roman numeral based on these rules.

## Approach
We solve this by using a `HashMap` to store the integer values of each Roman numeral. As we iterate through the string, we either add or subtract values depending on the order of the Roman numerals.

## Detailed Explanation

1. **Mapping Roman Numerals to Integers**:
   - We first create a `HashMap` that stores the integer values corresponding to each Roman numeral character:
     ```java
     Map<Character, Integer> romanToInt = new HashMap<>();
     romanToInt.put('I', 1);
     romanToInt.put('V', 5);
     romanToInt.put('X', 10);
     romanToInt.put('L', 50);
     romanToInt.put('C', 100);
     romanToInt.put('D', 500);
     romanToInt.put('M', 1000);
     ```

2. **Traversal Logic**:
   - Initialize `total = 0` to store the final integer result.
   - Iterate through the string from left to right. For each character, check if the current Roman numeral is smaller than the next one:
     - If it is, subtract its value from `total` (e.g., in `IV`, we subtract `I`).
     - Otherwise, add its value to `total` (e.g., in `VI`, we add `V` and `I`).

3. **Reversing Addition and Subtraction**:
   - For each character in the string, we use:
     ```java
     if (i < n - 1 && romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))) {
         total -= romanToInt.get(s.charAt(i));
     } else {
         total += romanToInt.get(s.charAt(i));
     }
     ```
     - If the current numeral is smaller than the next one, we subtract its value.
     - Otherwise, we add its value.

4. **Return Statement**:
   - After iterating through all characters, the total value represents the integer conversion of the Roman numeral string. The function then returns the `total`:
     ```java
     return total;
     ```

## Example Walkthrough

For the input `MCMXCIV`:
- `M = 1000`, `CM = 900`, `XC = 90`, `IV = 4`
- The total is `1000 + 900 + 90 + 4 = 1994`.

### Step-by-step breakdown:
1. Start with `M (1000)` → Total = 1000
2. `C (100)` before `M (1000)` → Subtract `100` → Total = 900
3. `M (1000)` → Add `1000` → Total = 1900
4. `X (10)` before `C (100)` → Subtract `10` → Total = 1890
5. `C (100)` → Add `100` → Total = 1990
6. `I (1)` before `V (5)` → Subtract `1` → Total = 1989
7. `V (5)` → Add `5` → Final Total = 1994

## Complexity Analysis

- **Time Complexity**: `O(n)`
  - The algorithm processes each character in the input string once, making the time complexity linear in relation to the length of the string.

- **Space Complexity**: `O(1)`
  - The space complexity is constant since the only extra space used is the hash map (which always contains the same 7 key-value pairs) and a few integer variables.

## Conclusion
This approach efficiently converts a Roman numeral string into an integer by handling both additive and subtractive cases in Roman numerals. The use of a hash map ensures that we can access each Roman numeral's integer value in constant time, and the algorithm processes the string in linear time.
