Repeatedly calls `get`, first on `m` and the first element of `ks`,
then on the result of that and the second element of `ks`, and so on
until `ks` is exhausted.  With a `not-found` arg, stops as soon as the
key is not found, and returns `not-found`.  Without a `not-found` arg,
it returns `nil`, but only after iterating through all elements of
`ks`.

Examples:

```clojure
user=> (def str-matrix [["abc" "def" "ghi"]
                        ["jkl" "mno" "pqr"]
                        ["stu" "vwx" "yz"]])
#'user/str-matrix
user=> (get-in str-matrix [2])
["stu" "vwx" "yz"]
user=> (get-in str-matrix [2 0])
"stu"
user=> (get-in str-matrix [2 0 1])
\t
user=> (get-in str-matrix [2 0 1 5])
nil     ; because (get \t 5) returns nil
user=> (get-in str-matrix [2 0 1 5] :not-found)
:not-found

user=> (get-in str-matrix [2 :x])
nil
user=> (get-in str-matrix [2 :x "foo"])
nil
```

The value `m` can have maps, arrays, and vectors nested in arbitrary
ways.

```clojure
user=> (def benchmark-result {:test "bench1", :run-times [5.2 5.7 4.9],
                              :platform {:os "Linux",
                                         :distribution "Ubuntu",
                                         :version-parts [12 4 3]}})
#'user/benchmark-result
user=> (get-in benchmark-result [:run-times 2])
4.9
user=> (get-in benchmark-result [:platform :distribution])
"Ubuntu"
user=> (get-in benchmark-result [:platform :version-parts 2])
3
```

See also: `get`, `find`, `assoc-in`, `update-in`
