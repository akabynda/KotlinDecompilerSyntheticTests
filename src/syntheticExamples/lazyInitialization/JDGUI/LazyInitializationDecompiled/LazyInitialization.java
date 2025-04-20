package syntheticExamples.lazyInitialization.JDGUI.LazyInitializationDecompiled;

//'kotlin. Function' cannot be inherited as a raw type and with generic type arguments 'java. lang. String'

/*
@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\005\030\0002\0020\001B\007\006\004\b\002\020\003R\033\020\004\032\0020\0058FX\002\006\f\n\004\b\b\020\t\032\004\b\006\020\007\006\n"}, d2 = {"LsyntheticExamples/lazyInitialization/LazyInitialization;", "", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "value$delegate", "Lkotlin/Lazy;", "KotlinDecompiler"})
public final class LazyInitialization {
    @NotNull
    private final Lazy value$delegate = LazyKt.lazy(LazyInitialization$value$2.INSTANCE);

    @NotNull
    public final String getValue() {
        Lazy lazy = this.value$delegate;
        return (String)lazy.getValue();
    }

    @Metadata(mv = {2, 0, 0}, k = 3, xi = 82, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
    static final class LazyInitialization$value$2 extends Lambda implements Function0<String> {
        public static final LazyInitialization$value$2 INSTANCE = new LazyInitialization$value$2();

        @NotNull
        public final String invoke() {
            System.out.println("Initializing");
            return "Initialized";
        }

        LazyInitialization$value$2() {
            super(0);
        }
    }
}
 */