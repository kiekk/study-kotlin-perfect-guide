fun main() {
    // 무공변 상태 (invariance)
//    var node: TreeNode<Any> = TreeNode<String>("Hello") // error: type mismatch
    // TreeNode<String> 은 TreeNode<Any> 의 하위 타입이 아니다.

    // 공변 상태 (covariant)
    val stringProducer: () -> String = { "hello" }
    val anyProducer: () -> Any = stringProducer
    println(anyProducer())
}