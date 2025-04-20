/*
package syntheticExamplesWoFixes.scopeFunctions.JDGUI.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001¨\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class ScopeFunctionsKt {
    public static void main() {
        Person person = new Person("Unknown", 0, null);
        Person person1 = person, $this$main_u24lambda_u240 = person1;
        int $i$a$ -apply - ScopeFunctionsKt$main$updatedPerson$1 = 0;
        $this$main_u24lambda_u240.setName("Alice");
        $this$main_u24lambda_u240.setAge(30);
        Person updatedPerson = person1;
        Person it = updatedPerson;
        int $i$a$ -let - ScopeFunctionsKt$main$nameLength$1 = 0;
        System.out.println("Person's name is " + it.getName());
        int nameLength = it.getName().length();
        System.out.println("Name length: " + nameLength);
        Person $this$main_u24lambda_u242 = updatedPerson;
        int $i$a$ -run - ScopeFunctionsKt$main$isAdult$1 = 0;
        System.out.println("Checking if " + $this$main_u24lambda_u242.getName() + " is adult.");
        boolean isAdult = ($this$main_u24lambda_u242.getAge() >= 18);
        System.out.println("Is adult: " + isAdult);
        Person person2 = it = updatedPerson;
        int $i$a$ -also - ScopeFunctionsKt$main$1 = 0;
        System.out.println("Sending email to " + person2.getEmail());
        it = it;
        Person $this$main_u24lambda_u244 = it;
        int $i$a$ -apply - ScopeFunctionsKt$main$2 = 0;
        $this$main_u24lambda_u244.setEmail("alice@example.com");
        Person $this$main_u24lambda_u245 = updatedPerson;
        int $i$a$ -with - ScopeFunctionsKt$main$contactInfo$1 = 0;
        String contactInfo =
                $this$main_u24lambda_u245.getName() + " can be contacted at " + $this$main_u24lambda_u245.getEmail();
        System.out.println(contactInfo);
    }
}

 */