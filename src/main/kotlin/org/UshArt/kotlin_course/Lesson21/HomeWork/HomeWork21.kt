package org.UshArt.kotlin_course.Lesson21.HomeWork

/*
Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из списков ключей
и значений. Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.
 */

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val size = minOf(keys.size, values.size)
    val result = mutableMapOf<K, V>()
    for (i in 0 until size) {
        result[keys[i]] = values[i]
    }
    return result
}
/*
Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка,
если он существует.
 */

fun <T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty())
        list[list.size / 2] else null
}