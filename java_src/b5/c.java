package b5;
/* loaded from: classes.dex */
public abstract class c implements o<Character> {

    /* loaded from: classes.dex */
    static abstract class a extends c {
        a() {
        }

        @Override // b5.o
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        private final char f2943j;

        b(char c10) {
            this.f2943j = c10;
        }

        @Override // b5.c
        public boolean e(char c10) {
            return c10 == this.f2943j;
        }

        public String toString() {
            return "CharMatcher.is('" + c.g(this.f2943j) + "')";
        }
    }

    /* renamed from: b5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static abstract class AbstractC0059c extends a {

        /* renamed from: j  reason: collision with root package name */
        private final String f2944j;

        AbstractC0059c(String str) {
            this.f2944j = (String) n.n(str);
        }

        public final String toString() {
            return this.f2944j;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends AbstractC0059c {

        /* renamed from: k  reason: collision with root package name */
        static final d f2945k = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // b5.c
        public int c(CharSequence charSequence, int i10) {
            n.q(i10, charSequence.length());
            return -1;
        }

        @Override // b5.c
        public boolean e(char c10) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends AbstractC0059c {

        /* renamed from: k  reason: collision with root package name */
        static final int f2946k = Integer.numberOfLeadingZeros(31);

        /* renamed from: l  reason: collision with root package name */
        static final e f2947l = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        @Override // b5.c
        public boolean e(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f2946k) == c10;
        }
    }

    protected c() {
    }

    public static c d(char c10) {
        return new b(c10);
    }

    public static c f() {
        return d.f2945k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static c h() {
        return e.f2947l;
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.q(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
