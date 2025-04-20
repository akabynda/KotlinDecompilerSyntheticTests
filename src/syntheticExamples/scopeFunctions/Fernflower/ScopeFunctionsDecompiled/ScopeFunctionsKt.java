package syntheticExamples.scopeFunctions.Fernflower.ScopeFunctionsDecompiled;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class ScopeFunctionsKt {
    public static void main() {
        Person person = new Person("Unknown", 0, null);
        Person $this$main_u24lambda_u240 = person;
        boolean var4 = false;
        $this$main_u24lambda_u240.setName("Alice");
        $this$main_u24lambda_u240.setAge(30);
        Person updatedPerson = person;
        Person it = updatedPerson;
        boolean var5 = false;
        String var6 = "Person's name is " + it.getName();
        System.out.println(var6);
        int nameLength = it.getName().length();
        String var8 = "Name length: " + nameLength;
        System.out.println(var8);
        Person $this$main_u24lambda_u245 = updatedPerson;
        boolean var13 = false;
        String var7 = "Checking if " + $this$main_u24lambda_u245.getName() + " is adult.";
        System.out.println(var7);
        boolean isAdult = $this$main_u24lambda_u245.getAge() >= 18;
        String contactInfo = "Is adult: " + isAdult;
        System.out.println(contactInfo);
        $this$main_u24lambda_u245 = updatedPerson;
        var13 = false;
        var7 = "Sending email to " + $this$main_u24lambda_u245.getEmail();
        System.out.println(var7);
        $this$main_u24lambda_u245 = updatedPerson;
        var13 = false;
        $this$main_u24lambda_u245.setEmail("alice@example.com");
        $this$main_u24lambda_u245 = updatedPerson;
        var13 = false;
        contactInfo = $this$main_u24lambda_u245.getName() + " can be contacted at " + $this$main_u24lambda_u245.getEmail();
        System.out.println(contactInfo);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
