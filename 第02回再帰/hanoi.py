def hanoi(n,start,goal,task):
    if n>1:
        hanoi(n-1,start,task,goal)
        print(str(n)+":"+start+"->"+goal)
        hanoi(n-1,task,goal,start)
    
    else:
        print(str(n)+":"+start+"->"+goal)
n=3
hanoi(n,"A","B","C")
# A≡開始棒、B≡目的棒、C≡作業棒とする