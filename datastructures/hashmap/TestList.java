package hashmap; 

class TestList {
    private String value; 
    private TestList next; 

    TestList(String input) {
        this.value = input; 
        next = null; 
    }

    TestList(String value, TestList next) {
        this.value = value;
        this.next = next;
    }

    TestList() {
        this.value = null;
        this.next = null;
    }

}
