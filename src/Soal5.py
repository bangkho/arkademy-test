def CountChar(n, c):
    count = 0;
    for x in n:
        if x == c:
            count += 1;
    print("Pada " + n + " terdapat: " + str(count) + " karakter \"" + c + "\"")
    # print(count)
    
CountChar("khoirudin", "i")