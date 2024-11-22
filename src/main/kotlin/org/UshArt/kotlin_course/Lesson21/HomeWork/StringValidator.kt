package org.UshArt.kotlin_course.Lesson21.HomeWork

class StringValidator : Validator<String?> {
    override fun validate(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}