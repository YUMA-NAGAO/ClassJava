def sum(n):
    if n>1:
        n=sum(n-1)+n
        print(n)
    
    else:
        print(n)
    return n

sum(10)