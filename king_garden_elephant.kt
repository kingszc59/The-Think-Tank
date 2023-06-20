package com.companyname.ThinkTank

import java.util.Scanner

fun main(args: Array<String>) {

// 1
    val reader = Scanner(System.`in`) 
    print("Enter a number: ") 
    var num1 = reader.nextInt()
    print("Enter another number: ") 
    var num2 = reader.nextInt()

// 2
    val sum = num1 + num2 
    print("The sum is: $sum") 

// 3
    val difference = num1 - num2 
    print("The difference is: $difference") 

// 4
    val product = num1 * num2 
    print("The product is: $product") 

// 5
    println("The quotient of the two numbers is: ${num1.toDouble() / num2.toDouble()}")

// 6
    var loop = 0
    while (loop <= 10) { 
        println("Loop: $loop") 
        loop++ 
    }

// 7
    for (i in 1..10) { 
        println(i) 
    }

// 8
    val x = 10
    when (x) {
        0 -> println("x == 0") 
        5 -> println("x == 5") 
        else -> println("x is neither 0 nor 5") 
    }

// 9
    val myList = listOf("Apple", "Banana", "Cherry") 
    for (item in myList) { 
        println(item) 
    }

// 10
    fun greetUser(name: String) { 
        println("Hello, $name") 
    }

// 11
    val message = "Welcome to The Think Tank!" 
    println(message) 

// 12
    fun squareNumber(n: Int): Int { 
        return n * n 
    }

// 13
    var y = 20 
    println("y is equal to $y") 

// 14
    y %= 4 
    println("y is now equal to $y") 

// 15
    val array = arrayOf(1,2,3,4,5) 
    println("The array is ${Arrays.toString(array)}") 

// 16
    val sentence = "The Think Tank is amazing!" 
    println("The sentence is: \"$sentence\"") 

// 17
    fun getGreeting(): String { 
        return "Welcome to The Think Tank!" 
    }

// 18
    for (i in 0..4) { 
        println(array[i]) 
    }

// 19
    if (x < 0) { 
        println("x is a negative number") 
    } else { 
        println("x is a positive number") 
    }

// 20
    var z = 0 
    do { 
        println("z is equal to $z") 
        z++ 
    } while (z < 10) 

// 21
    val a: Int? = null 
    val b = a ?: 0 
    println(b) 

// 22
    val intArray = intArrayOf(1,2,3,4,5) 
    val doubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)

// 23
    fun checkNumber(x: Int): Boolean { 
        return x > 0 
    }

// 24
    val map = mapOf("key1" to "value1", "key2" to "value2") 
    println(map["key1"])

// 25
    fun addNumbers(a: Int, b: Int): Int { 
        return a + b 
    }

// 26
    val list = listOf("Apple", "Banana", "Cherry", "Date", "Elderberry") 
    println(list.get(3))

// 27
    for (x in 0 until 10) { 
        println(x) 
    }

// 28
    var count = 0
    while (count < 10) { 
        println(count)
        count++ 
    }

// 29
    if (x > 0) { 
        println("x is a positive number") 
    } else if (x < 0) { 
        println("x is a negative number") 
    } else { 
        println("x is zero") 
    }

// 30
    val intArray2 = intArrayOf(1,2,3,4,5) 
    for (i in 0 until intArray2.size) { 
        println(intArray2[i]) 
    }

// 31
    var i = 0
    while (i <= 10) { 
        println("i equals $i") 
        i += 2 
    }

// 32
    when { 
        x < 0 -> println("x is a negative number") 
        x > 0 -> println("x is a positive number") 
        else -> println("x is zero") 
    }

// 33
    val set = setOf("A","B","C","D","E") 
    println(set.contains("C"))

// 34
    fun subtractNumbers(a: Int, b: Int): Int { 
        return a - b 
    }

// 35
    for (item in myList) {
        println(item)
    }

// 36
    fun powNumber(x: Int, y: Int): Int { 
        return Math.pow(x.toDouble(), y.toDouble()).toInt() 
    }

// 37
    for (i in 0 until list.size) { 
        println(list[i]) 
    }

// 38
    println("The size of the array is ${intArray2.size}") 

// 39
    println("The set is $set") 

// 40
    if (a == null) { 
        println("a is null") 
    } else { 
        println("a is not null") 
    }

// 41
    val mutableList = mutableListOf("Apple", "Banana", "Cherry") 
    mutableList.add("Date") 
    println(mutableList)

// 42
    val map2 = mutableMapOf("key1" to "value1", "key2" to "value2")  
    map2["key3"] = "value3" 
    println(map2)

// 43
    println("The size of the set is ${set.size}") 

// 44
    fun divideNumbers(a: Int, b: Int): Int { 
        return a / b 
    }

// 45
    var j = 0 
    do { 
        println("j is equal to $j") 
        j += 2 
    } while (j <= 10)

// 46
    val stringArray = arrayOf("John", "Jane", "Jill", "Jack") 
    println("The third element of the array is ${stringArray[2]}")

// 47
    fun modNumber(x: Int, y: Int): Int { 
        return x % y 
    }

// 48
    for (item in set) { 
        println(item) 
    }

// 49
    println("The size of the list is ${list.size}") 

// 50
    println("The values of the map are ${map.values}")

// 51
    val intList = listOf(10, 20, 30, 40, 50) 
    println("The third element of the list is ${intList[2]}")

// 52
    println("map[key2] is ${map["key2"]}")

// 53
    println("The last element of the array is ${stringArray[stringArray.size - 1]}")

// 54
    for (i in 0 until map.size) { 
        println("map[key$i] = ${map["key$i"]}") 
    }

// 55
    fun findMax(nums: IntArray): Int { 
        var max = nums[0] 
        for (num in nums) { 
            if (num > max) 
                max = num 
        } 
        return max 
    }

// 56
    println("The first element of the intList is ${intList[0]}")

// 57
    fun findMin(nums: IntArray): Int { 
        var min = nums[0] 
        for (num in nums) { 
            if (num < min) 
                min = num 
        } 
        return min 
    }

// 58
    println("The values of the map2 are ${map2.values}")

// 59
    println("My list contains ${myList.contains("Apple")}")

// 60
    fun calculateAverage(nums: IntArray): Double { 
        var sum = 0.0 
        for (num in nums) 
            sum += num 
        return sum / nums.size 
    }

// 61
    val myMutableList = mutableListOf(1,2,3,4,5) 
    myMutableList.removeAt(2) 
    println(myMutableList)

// 62
    fun checkString(str: String): Boolean { 
        return str.length > 5 
    }

// 63
    println("The size of the intArray is ${intArray2.size}")

// 64
    val intSet = setOf(1,2,3,4,5) 
    println("intSet contains 3? ${intSet.contains(3)}")

// 65
    println("The last element of the intList is ${intList[intList.size - 1]}")

// 66
    for (i in 5 downTo 1) { 
        println(i)
    }

// 67
    println("The size of the doubleArray is ${doubleArray.size}")

// 68
    println("The 3rd element of the myList is ${myList[2]}")

// 69
    val myMutableSet = mutableSetOf("A","B","C","D","E") 
    myMutableSet.add("F") 
    println(myMutableSet)

// 70
    for (x in 0..10 step 2) { 
        println(x) 
    }

// 71
    fun calculateSum(nums: IntArray): Int { 
        var sum = 0 
        for (num in nums) 
            sum += num 
        return sum 
    }

// 72
    println("doubleArray contains 5.0? ${doubleArray.contains(5.0)}")

// 73
    for (i in 4 downTo 1) { 
        println(array[i]) 
    }

// 74
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e') 
    println("The 4th element of the charArray is ${charArray[3]}")

// 75
    val sentence2 = "Welcome to The Think Tank!" 
    println("The length of the sentence is ${sentence2.length}")

// 76
    var k = 5
    while (k >= 0) { 
        println(k) 
        k-- 
    }

// 77
    fun checkNumberPositive(x: Int): Boolean { 
        return x > 0 
    }

// 78
    for (item in charArray) { 
        println(item) 
    }

// 79
    println("intSet contains 6? ${intSet.contains(6)}")

// 80
    val numsArray = intArrayOf(1,2,3,4,5) 
    println("The sum of the array is ${calculateSum(numsArray)}")

// 81
    for (i in 0 until myMutableList.size) { 
        println(myMutableList[i]) 
    }

// 82
    val stringList = listOf("John", "Jane", "Jill", "Jack", "Joe") 
    println("The 5th element of the stringList is ${stringList[4]}")

// 83
    fun checkStringEmpty(str: String): Boolean { 
        return str.isEmpty() 
    }

// 84
    println("The average of the array is ${calculateAverage(numsArray)}")

// 85
    println("The size of the charArray is ${charArray.size}")

// 86
    val floatArray = floatArrayOf(1.0f,2.0f,3.0f,4.0f,5.0f) 
    println("The third element of the floatArray is ${floatArray[2]}")

// 87
    fun checkStringNull(str: String): Boolean { 
        return str == null 
    }

// 88
    for (i in 4 downTo 0 steps 2) { 
        println(doubleArray[i]) 
    }

// 89
    println("The size of the myMutableList is ${myMutableList.size}")

// 90
    println("stringList contains John? ${stringList.contains("John")}")

// 91
    println("The last element of the floatArray is ${floatArray[floatArray.size - 1]}")

// 92
    val myMutableMap = mutableMapOf("key1" to "value1", "key2" to "value2") 
    myMutableMap["key3"] = "value3" 
    println(myMutableMap)

// 93
    println("myMutableSet contains F? ${myMutableSet.contains("F")}")

// 94
    for (i in 0 until stringList.size) { 
        println(stringList[i]) 
    }

// 95
    fun multiplyNumbers(a: Int, b: Int): Int { 
        return a * b 
    }

// 96
    println("myMutableMap[key1] is ${myMutableMap["key1"]}")

// 97
    println("The size of the floatArray is ${floatArray.size}")

// 98
    println("The 3rd element of the intList is ${intList[2]}")

// 99
    println("The 4th element of the intArray is ${intArray2[3]}")

// 100
    println("The size of the myMutableSet is ${myMutableSet.size}")