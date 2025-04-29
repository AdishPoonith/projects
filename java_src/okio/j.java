package okio;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f14770a;

    /* renamed from: b  reason: collision with root package name */
    int f14771b;

    /* renamed from: c  reason: collision with root package name */
    int f14772c;

    /* renamed from: d  reason: collision with root package name */
    boolean f14773d;

    /* renamed from: e  reason: collision with root package name */
    boolean f14774e;

    /* renamed from: f  reason: collision with root package name */
    j f14775f;

    /* renamed from: g  reason: collision with root package name */
    j f14776g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f14770a = new byte[8192];
        this.f14774e = true;
        this.f14773d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f14770a = bArr;
        this.f14771b = i10;
        this.f14772c = i11;
        this.f14773d = z10;
        this.f14774e = z11;
    }

    public final void a() {
        j jVar = this.f14776g;
        if (jVar == this) {
            throw new IllegalStateException();
        }
        if (jVar.f14774e) {
            int i10 = this.f14772c - this.f14771b;
            if (i10 > (8192 - jVar.f14772c) + (jVar.f14773d ? 0 : jVar.f14771b)) {
                return;
            }
            f(jVar, i10);
            b();
            k.a(this);
        }
    }

    public final j b() {
        j jVar = this.f14775f;
        j jVar2 = jVar != this ? jVar : null;
        j jVar3 = this.f14776g;
        jVar3.f14775f = jVar;
        this.f14775f.f14776g = jVar3;
        this.f14775f = null;
        this.f14776g = null;
        return jVar2;
    }

    public final j c(j jVar) {
        jVar.f14776g = this;
        jVar.f14775f = this.f14775f;
        this.f14775f.f14776g = jVar;
        this.f14775f = jVar;
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j d() {
        this.f14773d = true;
        return new j(this.f14770a, this.f14771b, this.f14772c, true, false);
    }

    public final j e(int i10) {
        j b10;
        if (i10 <= 0 || i10 > this.f14772c - this.f14771b) {
            throw new IllegalArgumentException();
        }
        if (i10 >= 1024) {
            b10 = d();
        } else {
            b10 = k.b();
            System.arraycopy(this.f14770a, this.f14771b, b10.f14770a, 0, i10);
        }
        b10.f14772c = b10.f14771b + i10;
        this.f14771b += i10;
        this.f14776g.c(b10);
        return b10;
    }

    public final void f(j jVar, int i10) {
        if (!jVar.f14774e) {
            throw new IllegalArgumentException();
        }
        int i11 = jVar.f14772c;
        if (i11 + i10 > 8192) {
            if (jVar.f14773d) {
                throw new IllegalArgumentException();
            }
            int i12 = jVar.f14771b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = jVar.f14770a;
            System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
            jVar.f14772c -= jVar.f14771b;
            jVar.f14771b = 0;
        }
        System.arraycopy(this.f14770a, this.f14771b, jVar.f14770a, jVar.f14772c, i10);
        jVar.f14772c += i10;
        this.f14771b += i10;
    }
}
