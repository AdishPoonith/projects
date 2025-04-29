package ha;

import t9.m;
/* loaded from: classes.dex */
public class a implements Iterable<Character>, ea.a {

    /* renamed from: m  reason: collision with root package name */
    public static final C0155a f9544m = new C0155a(null);

    /* renamed from: j  reason: collision with root package name */
    private final char f9545j;

    /* renamed from: k  reason: collision with root package name */
    private final char f9546k;

    /* renamed from: l  reason: collision with root package name */
    private final int f9547l;

    /* renamed from: ha.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0155a {
        private C0155a() {
        }

        public /* synthetic */ C0155a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9545j = c10;
        this.f9546k = (char) y9.c.b(c10, c11, i10);
        this.f9547l = i10;
    }

    public final char b() {
        return this.f9545j;
    }

    public final char e() {
        return this.f9546k;
    }

    @Override // java.lang.Iterable
    /* renamed from: k */
    public m iterator() {
        return new b(this.f9545j, this.f9546k, this.f9547l);
    }
}
