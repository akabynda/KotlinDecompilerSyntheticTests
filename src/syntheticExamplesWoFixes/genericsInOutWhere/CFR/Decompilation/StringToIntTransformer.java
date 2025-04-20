/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package syntheticExamplesWoFixes.genericsInOutWhere.CFR.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"LsyntheticExamplesWoFixes/genericsInOutWhere/StringToIntTransformer;", "LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;", "", "", "()V", "transform", "value", "(Ljava/lang/CharSequence;)Ljava/lang/Integer;", "KotlinDecompiler"})
public final class StringToIntTransformer
        implements Transformer<CharSequence, Integer> {
    @Override
    @NotNull
    public Integer transform(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length();
    }
}
