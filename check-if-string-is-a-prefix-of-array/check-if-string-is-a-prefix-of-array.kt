class Solution {
    fun isPrefixString(s: String, words: Array<String>): Boolean {
        var str = s
        var arr = s
            
            for (i in words.indices){

                str = str.removePrefix(words[i])
                if (str==""){
                    return true
                }
                if (arr == str && str != ""){
                    return false
                }
                arr = arr.removePrefix(words[i])
            }
            if (str != ""){
                return false
            }
            print(str)
            return true
    }
}