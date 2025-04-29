package o7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends c {
    @Override // o7.c, o7.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f14703f++;
            c(c10, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f14703f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // o7.c
    int c(char c10, StringBuilder sb) {
        char c11;
        int i10;
        if (c10 == '\r') {
            c11 = 0;
        } else if (c10 != ' ') {
            if (c10 == '*') {
                sb.append((char) 1);
            } else if (c10 != '>') {
                if (c10 >= '0' && c10 <= '9') {
                    i10 = (c10 - '0') + 4;
                } else if (c10 < 'A' || c10 > 'Z') {
                    j.e(c10);
                } else {
                    i10 = (c10 - 'A') + 14;
                }
                c11 = (char) i10;
            } else {
                c11 = 2;
            }
            return 1;
        } else {
            c11 = 3;
        }
        sb.append(c11);
        return 1;
    }

    @Override // o7.c
    public int e() {
        return 3;
    }

    @Override // o7.c
    void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a10 = hVar.g().a() - hVar.a();
        hVar.f14703f -= sb.length();
        if (hVar.f() > 1 || a10 > 1 || hVar.f() != a10) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
