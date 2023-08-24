fun main(args: Array<String>) {
    var userNumber:Int

    println("Enter a number:")
    userNumber = readln()!!.toInt()

    when (userNumber){
        1-> println("1 in German is eine")
        2-> println("2 in German is zwei")
        3-> println("3 in German is drei")
        4-> println("4 in German is vier")
        5-> println("5 in German is fünf")
        6-> println("6 in German is sechs")
        7-> println("7 in German is Sieben")
        8-> println("8 in German is acht")
        9-> println("9 in German is neun")
        10-> println("10 in German is zehn")
        !in 1..10 -> println("Out Of Range")









    }
}