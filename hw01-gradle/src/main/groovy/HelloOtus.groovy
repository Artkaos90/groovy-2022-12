import com.google.common.base.Splitter // импорт нужного класса из Guava

class HelloOtus{
  static void main(String[] args) {
    def input = "apple,banana,pear"
    def splitter = Splitter.on(",")
    def result = splitter.splitToList(input)
    println result // вывод результата на консоль
  }
}