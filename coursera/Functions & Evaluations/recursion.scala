
def factorial(x: Int) = {

    def loop(acc: Int, n: Int): Int = 
        if (n == 0) acc else loop(acc * n, n - 1)

    loop(1, x)

}

def gcd(x: Int, y: Int): Int = 
    if (y == 0) x
    else gcd(y, x % y)


println(gcd(14, 21))

println(factorial(5))
