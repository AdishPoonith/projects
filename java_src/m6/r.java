package m6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class r extends e<r> {

    /* renamed from: k  reason: collision with root package name */
    public static final r f13822k = w("__name__");

    /* renamed from: l  reason: collision with root package name */
    public static final r f13823l = new r(Collections.emptyList());

    private r(List<String> list) {
        super(list);
    }

    public static r u(List<String> list) {
        return list.isEmpty() ? f13823l : new r(list);
    }

    public static r v(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                i10++;
                if (i10 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                charAt = str.charAt(i10);
            } else if (charAt == '.') {
                if (!z10) {
                    String sb2 = sb.toString();
                    if (sb2.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    arrayList.add(sb2);
                    sb = sb3;
                    i10++;
                }
            } else if (charAt == '`') {
                z10 = !z10;
                i10++;
            }
            sb.append(charAt);
            i10++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static r w(String str) {
        return new r(Collections.singletonList(str));
    }

    private static boolean y(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == '_' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt2 = str.charAt(i10);
                if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // m6.e
    public String h() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < this.f13798j.size(); i10++) {
            if (i10 > 0) {
                sb.append(".");
            }
            String replace = this.f13798j.get(i10).replace("\\", "\\\\").replace("`", "\\`");
            if (!y(replace)) {
                replace = '`' + replace + '`';
            }
            sb.append(replace);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // m6.e
    /* renamed from: t */
    public r k(List<String> list) {
        return new r(list);
    }

    public boolean x() {
        return equals(f13822k);
    }
}
