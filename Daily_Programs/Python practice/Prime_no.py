def count_unique_words(s1, s2):
    # Convert sentences into lowercase and split into words
    set1 = set(s1.lower().split())
    set2 = set(s2.lower().split())
    
    # Count total unique words from both sentences combined
    return len(set1.union(set2))

# Read number of test cases
t = int(input())
for _ in range(t):
    sentence1 = input().strip()
    sentence2 = input().strip()
    result = count_unique_words(sentence1, sentence2)
    print(result)
