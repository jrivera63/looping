fun main() {
    var userAns = 0
    var loopsRan = 0

    do {
        if(loopsRan > 0){
            println("Invalid choice. Please choose a number from the menu")
        }
        println("Pick and ice cream flavor:")
        println("1. Vanilla")
        println("2. Chocolate")
        println("3. Strawberry")
        println("4. Chocolate and peanut butter")
        println("5. Exit")
        print("Enter your choice: ")
        userAns = readLine()!!.toInt()
        loopsRan++

    } while (userAns != 1 && userAns != 2 && userAns != 3 && userAns != 4 && userAns != 5)

    print("You chose $userAns")
}