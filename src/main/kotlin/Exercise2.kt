fun main(args: Array<String>) {
    print("Enter your marks")

    var marks:Int = readLine()!!.toInt()

    if (marks <= 10) {
        print("You scored an E")
    }

        else if (marks <= 29 ){
            print("You have scored a E")
        }


    else if (marks <= 39 ){
        print("You have scored a D")
    }


    else if (marks <= 59 ){
        print("You have scored a B")
    }


    else if (marks <= 70 ){
        print("You have scored a B+")
    }

    else if (marks <= 100 ){
        print("You have scored a A")
    }

    else if (marks > 100 ){
        print("INVALID MARKS ")
    }




}
