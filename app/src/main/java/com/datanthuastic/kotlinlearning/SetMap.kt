package com.datanthuastic.kotlinlearning

fun main() {

    // - Set -

    // Set içinde örnek vermek gerekirse arrayOf'da olduğu gibi aynı sayılar farklı eleman kabul edilmez.
    // arrayOf(1,1,2,3,4) => 5 eleman ------ setOf(1,2,2,3) => 3 eleman [1,2,3]

    val myExampleArray = arrayOf(1,1,2,3,4)
    println("First Element: ${myExampleArray[0]}") // First Element: 1
    println("Second Element: ${myExampleArray[1]}") // Second Element: 1

    val mySet = setOf<Int>(1,2,2,3)
    println("mySet's Size: ${mySet.size}") // mySet's Size: 3

    // setOf içindeki elemanları tek tek yazdırmamızı sağlıyor.
    mySet.forEach { println(it) }


    // HashSet ArrayList'e benzer fakat aynı değeri girdiğimiz zaman aşağıdaki örnekte de
    // gördüğümüz gibi size'ı etkilemez.
    val myStringSet = HashSet<String>()
    myStringSet.add("Gökberk")
    myStringSet.add("Gökberk")

    println("myStringSet's Size: ${myStringSet.size}") // myStringSet's Size: 1


    // - Map - HashMap -
    // Key-Value ilişkisine dayanır. Aşağıdaki yapı her zaman kullanışlı olmayabilir.
    // Bu yüzden hashMapOf yapısı özellikle API kullanırken işimize yarar.

    // Klasik arrayOf yapısı;
    val fruitArray = arrayOf("Apple", "Banana")
    val caloriesArray = arrayOf(100, 150)

    println("${fruitArray[0]}: ${caloriesArray[0]}") // Apple: 100

    // hashMapOf yapısı;
    val fruitCalorieMap = hashMapOf<String, Int>()
    fruitCalorieMap.put("Watermelon", 80)
    fruitCalorieMap.put("Carrot", 40)

    println(fruitCalorieMap["Watermelon"]) // 80
    println(fruitCalorieMap["Carrot"]) // 40

    // Bir diğer hashMap oluşturma şekli 1;
    val myHashMap = HashMap<String, String>()
    myHashMap.put("A","B")

    // Bir diğer hashMap oluşturma şekli 2;
    val myNewMap = hashMapOf<String,Int>("FB" to 1, "BJK" to 2, "GS" to 3)
    println(myNewMap["FB"]) // 1




}