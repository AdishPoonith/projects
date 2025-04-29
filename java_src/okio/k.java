package okio;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    static j f14777a;

    /* renamed from: b  reason: collision with root package name */
    static long f14778b;

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(j jVar) {
        if (jVar.f14775f != null || jVar.f14776g != null) {
            throw new IllegalArgumentException();
        }
        if (jVar.f14773d) {
            return;
        }
        synchronized (k.class) {
            long j10 = f14778b;
            if (j10 + 8192 > 65536) {
                return;
            }
            f14778b = j10 + 8192;
            jVar.f14775f = f14777a;
            jVar.f14772c = 0;
            jVar.f14771b = 0;
            f14777a = jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j b() {
        synchronized (k.class) {
            j jVar = f14777a;
            if (jVar != null) {
                f14777a = jVar.f14775f;
                jVar.f14775f = null;
                f14778b -= 8192;
                return jVar;
            }
            return new j();
        }
    }
}
