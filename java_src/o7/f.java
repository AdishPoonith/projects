package o7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements g {
    private static void b(char c10, StringBuilder sb) {
        if (c10 >= ' ' && c10 <= '?') {
            sb.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.e(c10);
        } else {
            sb.append((char) (c10 - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i10) {
        int length = charSequence.length() - i10;
        if (length != 0) {
            int charAt = (charSequence.charAt(i10) << 18) + ((length >= 2 ? charSequence.charAt(i10 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i10 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i10 + 3) : (char) 0);
            char c10 = (char) ((charAt >> 8) & 255);
            char c11 = (char) (charAt & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((charAt >> 16) & 255));
            if (length >= 2) {
                sb.append(c10);
            }
            if (length >= 3) {
                sb.append(c11);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                hVar.p();
                int a10 = hVar.g().a() - hVar.a();
                int f10 = hVar.f();
                if (f10 > a10) {
                    hVar.q(hVar.a() + 1);
                    a10 = hVar.g().a() - hVar.a();
                }
                if (f10 <= a10 && a10 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String c10 = c(charSequence, 0);
            if (!(!hVar.i()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                hVar.q(hVar.a() + i10);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + c10.length());
                    z10 = false;
                }
            }
            if (z10) {
                hVar.k();
                hVar.f14703f -= i10;
            } else {
                hVar.s(c10);
            }
        } finally {
            hVar.o(0);
        }
    }

    @Override // o7.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb);
            hVar.f14703f++;
            if (sb.length() >= 4) {
                hVar.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(hVar.d(), hVar.f14703f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(hVar, sb);
    }

    public int d() {
        return 4;
    }
}
