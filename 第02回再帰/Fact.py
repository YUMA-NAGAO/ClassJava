def sum(n):
    if n>1:
        n=sum(n-1)*n
        print(n)
    
    else:
        pass
        # print(n)
    return n

sum(5)