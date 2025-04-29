package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f18594a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f18595e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f18596a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18597b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18598c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18599d;

        public a(int i10, int i11, int i12) {
            this.f18596a = i10;
            this.f18597b = i11;
            this.f18598c = i12;
            this.f18599d = p3.n0.t0(i12) ? p3.n0.d0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f18596a == aVar.f18596a && this.f18597b == aVar.f18597b && this.f18598c == aVar.f18598c;
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(Integer.valueOf(this.f18596a), Integer.valueOf(this.f18597b), Integer.valueOf(this.f18598c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f18596a + ", channelCount=" + this.f18597b + ", encoding=" + this.f18598c + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    boolean a();

    boolean b();

    ByteBuffer c();

    void d();

    void e(ByteBuffer byteBuffer);

    a f(a aVar);

    void flush();

    void reset();
}
