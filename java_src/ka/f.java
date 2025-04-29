package ka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12821k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final Pattern f12822j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements Serializable {

        /* renamed from: l  reason: collision with root package name */
        public static final a f12823l = new a(null);

        /* renamed from: j  reason: collision with root package name */
        private final String f12824j;

        /* renamed from: k  reason: collision with root package name */
        private final int f12825k;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String pattern, int i10) {
            kotlin.jvm.internal.l.e(pattern, "pattern");
            this.f12824j = pattern;
            this.f12825k = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f12824j, this.f12825k);
            kotlin.jvm.internal.l.d(compile, "compile(pattern, flags)");
            return new f(compile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.l.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.l.d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.f.<init>(java.lang.String):void");
    }

    public f(Pattern nativePattern) {
        kotlin.jvm.internal.l.e(nativePattern, "nativePattern");
        this.f12822j = nativePattern;
    }

    private final Object writeReplace() {
        String pattern = this.f12822j.pattern();
        kotlin.jvm.internal.l.d(pattern, "nativePattern.pattern()");
        return new b(pattern, this.f12822j.flags());
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.l.e(input, "input");
        return this.f12822j.matcher(input).matches();
    }

    public final String b(CharSequence input, String replacement) {
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(replacement, "replacement");
        String replaceAll = this.f12822j.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.l.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence input, int i10) {
        List<String> b10;
        kotlin.jvm.internal.l.e(input, "input");
        q.W(i10);
        Matcher matcher = this.f12822j.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            b10 = t9.o.b(input.toString());
            return b10;
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? ha.i.c(i10, 10) : 10);
        int i11 = 0;
        int i12 = i10 - 1;
        do {
            arrayList.add(input.subSequence(i11, matcher.start()).toString());
            i11 = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i11, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f12822j.toString();
        kotlin.jvm.internal.l.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
