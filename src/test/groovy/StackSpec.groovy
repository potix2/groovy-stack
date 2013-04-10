import Stack
class StackSpec extends spock.lang.Specification {
    def "isEmpty should be true when stack is created" () {
        setup:
            def stack = new Stack()

        expect:
            stack.isEmpty() == true
    }

    def "size should return 0 when stask is empty" () {
        setup:
            def stack = new Stack()

        expect:
            stack.size() == 0
    }

    def "isEmpty should be false and size should be 1 when push 1" () {
        setup:
            def stack = new Stack()

        when:
            stack.push(1)

        then:
            stack.isEmpty() == false
            stack.size() == 1
    }

}
