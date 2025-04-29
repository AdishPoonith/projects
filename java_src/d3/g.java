package d3;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class g extends v1.j<l, m, j> implements i {

    /* renamed from: n  reason: collision with root package name */
    private final String f7720n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {
        a() {
        }

        @Override // v1.h
        public void w() {
            g.this.s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(String str) {
        super(new l[2], new m[2]);
        this.f7720n = str;
        v(1024);
    }

    protected abstract h A(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.j
    /* renamed from: B */
    public final j k(l lVar, m mVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(lVar.f19364l);
            mVar.x(lVar.f19366n, A(byteBuffer.array(), byteBuffer.limit(), z10), lVar.f7723r);
            mVar.n(Integer.MIN_VALUE);
            return null;
        } catch (j e10) {
            return e10;
        }
    }

    @Override // d3.i
    public void b(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.j
    /* renamed from: x */
    public final l h() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.j
    /* renamed from: y */
    public final m i() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.j
    /* renamed from: z */
    public final j j(Throwable th) {
        return new j("Unexpected decode error", th);
    }
}
