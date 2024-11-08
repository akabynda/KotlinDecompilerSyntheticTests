package syntheticExamples.destructuring.JDGUI.DestructuringDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\006\004\b\005\020\006J\t\020\n\032\0020\003H\003J\t\020\013\032\0020\003H\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003H\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001H\003J\t\020\020\032\0020\003H\001J\t\020\021\032\0020\022H\001R\021\020\002\032\0020\003\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003\006\b\n\000\032\004\b\t\020\b\006\023"}, d2 = {"LsyntheticExamples/destructuring/Point;", "", "x", "", "y", "<init>", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "KotlinDecompiler"})
public final class Point {
    private final int x;

    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    @NotNull
    public final Point copy(int x, int y) {
        return new Point(x, y);
    }

    @NotNull
    public String toString() {
        return "Point(x=" + this.x + ", y=" + this.y + ')';
    }

    public int hashCode() {
        int result = Integer.hashCode(this.x);
        return result * 31 + Integer.hashCode(this.y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Point))
            return false;
        Point point = (Point)other;
        return (this.x != point.x) ? false : (!(this.y != point.y));
    }
}
