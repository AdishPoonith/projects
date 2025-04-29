package v1;

import java.nio.ByteBuffer;
import s1.k1;
/* loaded from: classes.dex */
public class g extends v1.a {

    /* renamed from: k  reason: collision with root package name */
    public final c f19363k;

    /* renamed from: l  reason: collision with root package name */
    public ByteBuffer f19364l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19365m;

    /* renamed from: n  reason: collision with root package name */
    public long f19366n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f19367o;

    /* renamed from: p  reason: collision with root package name */
    private final int f19368p;

    /* renamed from: q  reason: collision with root package name */
    private final int f19369q;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: j  reason: collision with root package name */
        public final int f19370j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19371k;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f19370j = i10;
            this.f19371k = i11;
        }
    }

    static {
        k1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public g(int i10, int i11) {
        this.f19363k = new c();
        this.f19368p = i10;
        this.f19369q = i11;
    }

    public static g A() {
        return new g(0);
    }

    private ByteBuffer w(int i10) {
        int i11 = this.f19368p;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f19364l;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void B(int i10) {
        ByteBuffer byteBuffer = this.f19367o;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f19367o = ByteBuffer.allocate(i10);
        } else {
            this.f19367o.clear();
        }
    }

    @Override // v1.a
    public void l() {
        super.l();
        ByteBuffer byteBuffer = this.f19364l;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f19367o;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f19365m = false;
    }

    public void x(int i10) {
        int i11 = i10 + this.f19369q;
        ByteBuffer byteBuffer = this.f19364l;
        if (byteBuffer == null) {
            this.f19364l = w(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f19364l = byteBuffer;
            return;
        }
        ByteBuffer w10 = w(i12);
        w10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            w10.put(byteBuffer);
        }
        this.f19364l = w10;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.f19364l;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f19367o;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean z() {
        return o(1073741824);
    }
}
