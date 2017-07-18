implicit class StringImprovements(s: String) {
      def increment = s.map(c => (c+1).toChar)
      }
      
scala> val result = "HAL".increment
result: String = IBM
