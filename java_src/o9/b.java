package o9;

import b5.n;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.j;
import com.google.protobuf.q;
import com.google.protobuf.v0;
import i9.j1;
import i9.q0;
import i9.z0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile q f14728a = q.b();

    /* loaded from: classes.dex */
    private static final class a<T extends v0> implements z0.c {

        /* renamed from: c  reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f14729c = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final f1<T> f14730a;

        /* renamed from: b  reason: collision with root package name */
        private final T f14731b;

        a(T t10) {
            this.f14731b = t10;
            this.f14730a = (f1<T>) t10.i();
        }

        private T d(j jVar) {
            T b10 = this.f14730a.b(jVar, b.f14728a);
            try {
                jVar.a(0);
                return b10;
            } catch (e0 e10) {
                e10.k(b10);
                throw e10;
            }
        }

        @Override // i9.z0.c
        /* renamed from: c */
        public T b(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof o9.a) && ((o9.a) inputStream).e() == this.f14730a) {
                try {
                    return (T) ((o9.a) inputStream).b();
                } catch (IllegalStateException unused) {
                }
            }
            j jVar = null;
            try {
                if (inputStream instanceof q0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f14729c;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i10 = available;
                        while (i10 > 0) {
                            int read = inputStream.read(bArr, available - i10, i10);
                            if (read == -1) {
                                break;
                            }
                            i10 -= read;
                        }
                        if (i10 != 0) {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i10));
                        }
                        jVar = j.k(bArr, 0, available);
                    } else if (available == 0) {
                        return this.f14731b;
                    }
                }
                if (jVar == null) {
                    jVar = j.f(inputStream);
                }
                jVar.G(Integer.MAX_VALUE);
                try {
                    return d(jVar);
                } catch (e0 e10) {
                    throw j1.f9937t.q("Invalid protobuf byte sequence").p(e10).d();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // i9.z0.c
        /* renamed from: e */
        public InputStream a(T t10) {
            return new o9.a(t10, this.f14730a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(InputStream inputStream, OutputStream outputStream) {
        n.o(inputStream, "inputStream cannot be null!");
        n.o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public static <T extends v0> z0.c<T> b(T t10) {
        return new a(t10);
    }
}
