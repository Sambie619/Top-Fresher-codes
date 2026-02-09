package recursion;

public class PrintAllPermuofString {
    // Print all permutations of a string using recursion
    // TC: O(n! * n)  (n! permutations, each takes O(n) to build/print)
    // SC: O(n) recursion stack + char array
    public static void permute(char[] arr, int idx) {
        // base case: permutation formed
        if (idx == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // swap current index with i
            swap(arr, idx, i);

            // recurse for next index
            permute(arr, idx + 1);

            // backtrack: undo swap
            swap(arr, idx, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABC";
        if (s == null || s.length() == 0) return; // edge case

        permute(s.toCharArray(), 0);
    }
}
/*
🌳 Recursion Tree for "ABC"
Call:
permute([A,B,C], idx=0)
Level 0 (idx = 0)
We loop i = 0..2 and swap with idx=0:
1) i = 0 → swap(0,0)
String: ABC
ABC
└── permute(idx=1)
Level 1 (idx = 1) with ABC
Now loop i = 1..2:
i=1 swap(1,1) → ABC
i=2 swap(1,2) → ACB
So:
ABC
├── ABC  (swap 1,1)
│   └── permute(idx=2)
│       └── ABC ✅
└── ACB  (swap 1,2)
    └── permute(idx=2)
        └── ACB ✅

2) i = 1 → swap(0,1)
String becomes: BAC
BAC
└── permute(idx=1)
Level 1 with BAC
Loop i = 1..2:
i=1 swap(1,1) → BAC
i=2 swap(1,2) → BCA
So:
BAC
├── BAC
│   └── BAC ✅
└── BCA
    └── BCA ✅
3) i = 2 → swap(0,2)
String becomes: CBA
CBA
└── permute(idx=1)
Level 1 with CBA
Loop i = 1..2:
i=1 swap(1,1) → CBA
i=2 swap(1,2) → CAB
So:
CBA
├── CBA
│   └── CBA ✅
└── CAB
    └── CAB ✅
✅ Final Output Order (exactly as your code prints)
ABC
ACB
BAC
BCA
CBA
CAB
*/
