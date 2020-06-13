def hanoi(n,fis,las,tas):
    if n>1:
        hanoi(n-1,fis,tas,las)
        print(str(n)+":"+fis+" -> "+las)
        hanoi(n-1,tas,las,fis)
    
    else:
        print(str(n)+":"+fis+" -> "+las)
        
    
n=4

hanoi(n, "A", "B", "C")

# A≡開始棒、B≡目的棒、C≡作業棒とする