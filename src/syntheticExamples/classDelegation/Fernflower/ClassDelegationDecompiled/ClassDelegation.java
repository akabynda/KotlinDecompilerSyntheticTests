package syntheticExamples.classDelegation.Fernflower.ClassDelegationDecompiled;

import kotlin.Metadata;
import syntheticExamples.classDelegation.Base;
import syntheticExamples.classDelegation.BaseImpl;
import syntheticExamples.classDelegation.Derived;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class ClassDelegation {
    public static void main() {
        syntheticExamples.classDelegation.BaseImpl base = new BaseImpl("Hello from BaseImpl");
        syntheticExamples.classDelegation.Derived derived = new Derived(base);
        derived.printMessage();
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}

