package o7;

import java.nio.charset.StandardCharsets;
/* loaded from: classes.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f14698a;

    /* renamed from: b  reason: collision with root package name */
    private l f14699b;

    /* renamed from: c  reason: collision with root package name */
    private i7.b f14700c;

    /* renamed from: d  reason: collision with root package name */
    private i7.b f14701d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f14702e;

    /* renamed from: f  reason: collision with root package name */
    int f14703f;

    /* renamed from: g  reason: collision with root package name */
    private int f14704g;

    /* renamed from: h  reason: collision with root package name */
    private k f14705h;

    /* renamed from: i  reason: collision with root package name */
    private int f14706i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c10);
        }
        this.f14698a = sb.toString();
        this.f14699b = l.FORCE_NONE;
        this.f14702e = new StringBuilder(str.length());
        this.f14704g = -1;
    }

    private int h() {
        return this.f14698a.length() - this.f14706i;
    }

    public int a() {
        return this.f14702e.length();
    }

    public StringBuilder b() {
        return this.f14702e;
    }

    public char c() {
        return this.f14698a.charAt(this.f14703f);
    }

    public String d() {
        return this.f14698a;
    }

    public int e() {
        return this.f14704g;
    }

    public int f() {
        return h() - this.f14703f;
    }

    public k g() {
        return this.f14705h;
    }

    public boolean i() {
        return this.f14703f < h();
    }

    public void j() {
        this.f14704g = -1;
    }

    public void k() {
        this.f14705h = null;
    }

    public void l(i7.b bVar, i7.b bVar2) {
        this.f14700c = bVar;
        this.f14701d = bVar2;
    }

    public void m(int i10) {
        this.f14706i = i10;
    }

    public void n(l lVar) {
        this.f14699b = lVar;
    }

    public void o(int i10) {
        this.f14704g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f14705h;
        if (kVar == null || i10 > kVar.a()) {
            this.f14705h = k.l(i10, this.f14699b, this.f14700c, this.f14701d, true);
        }
    }

    public void r(char c10) {
        this.f14702e.append(c10);
    }

    public void s(String str) {
        this.f14702e.append(str);
    }
}
