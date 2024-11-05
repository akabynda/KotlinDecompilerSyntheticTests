package syntheticExamples.scopeFunctions.CFR.ScopeFunctionsDecompiled;

import kotlin.Metadata;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "KotlinDecompiler"})
public final class ScopeFunctionsKt {
    public static final void main() {
        Person updatedPerson;
        Person person;
        Person person2;
        Person $this$main_u24lambda_u240 = person2 = (person = new Person("Unknown", 0, null));
        boolean bl = false;
        $this$main_u24lambda_u240.setName("Alice");
        $this$main_u24lambda_u240.setAge(30);
        Person it = updatedPerson = person2;
        boolean bl2 = false;
        System.out.println((Object)("Person's name is " + it.getName()));
        int nameLength = it.getName().length();
        System.out.println((Object)("Name length: " + nameLength));
        Person $this$main_u24lambda_u242 = updatedPerson;
        boolean bl3 = false;
        System.out.println((Object)("Checking if " + $this$main_u24lambda_u242.getName() + " is adult."));
        boolean isAdult = $this$main_u24lambda_u242.getAge() >= 18;
        System.out.println((Object)("Is adult: " + isAdult));
        Person it2 = it = updatedPerson;
        boolean bl4 = false;
        System.out.println((Object)("Sending email to " + it2.getEmail()));
        Person $this$main_u24lambda_u244 = it;
        boolean bl5 = false;
        $this$main_u24lambda_u244.setEmail("alice@example.com");
        Person $this$main_u24lambda_u245 = updatedPerson;
        boolean bl6 = false;
        String contactInfo = $this$main_u24lambda_u245.getName() + " can be contacted at " + $this$main_u24lambda_u245.getEmail();
        System.out.println((Object)contactInfo);
    }

    public static /* synthetic */ void main(String[] args) {
        ScopeFunctionsKt.main();
    }
}