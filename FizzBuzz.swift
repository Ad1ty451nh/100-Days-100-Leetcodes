func FizzBuzz(_ n: Int){
    var result: [String] = []

    for i in 1...n {

        if i % 3 == 0 && i % 5 == 0 {
            print("FizzBuzz")
        } else if i % 3 == 0{
            print("Fizz")
        } else if i % 5 == 0 {
            print("Buzz")
        }else {
            print(i)
        }
    }
}

var n = 30
FizzBuzz(n)
