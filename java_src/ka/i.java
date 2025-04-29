package ka;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.m implements da.l<String, String> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f12826j = new a();

        a() {
            super(1);
        }

        @Override // da.l
        /* renamed from: a */
        public final String invoke(String line) {
            kotlin.jvm.internal.l.e(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.m implements da.l<String, String> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f12827j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f12827j = str;
        }

        @Override // da.l
        /* renamed from: a */
        public final String invoke(String line) {
            kotlin.jvm.internal.l.e(line, "line");
            return this.f12827j + line;
        }
    }

    private static final da.l<String, String> b(String str) {
        return str.length() == 0 ? a.f12826j : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!ka.b.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String newIndent) {
        String invoke;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(newIndent, "newIndent");
        List<String> N = q.N(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : N) {
            if (!g.m((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t9.n.j(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str2)));
        }
        Integer num = (Integer) t9.n.C(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * N.size());
        da.l<String, String> b10 = b(newIndent);
        int f10 = t9.n.f(N);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : N) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t9.n.i();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == f10) && g.m(str3)) {
                str3 = null;
            } else {
                String q02 = s.q0(str3, intValue);
                if (q02 != null && (invoke = b10.invoke(q02)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb = ((StringBuilder) t9.n.x(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, f.j.N0, null)).toString();
        kotlin.jvm.internal.l.d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return d(str, "");
    }
}
