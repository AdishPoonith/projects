package x6;

import android.util.Log;
import java.io.InputStream;
/* loaded from: classes.dex */
public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final Runtime f20239f = Runtime.getRuntime();

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f20240a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f20241b;

    /* renamed from: c  reason: collision with root package name */
    private int f20242c = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20244e = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20243d = false;

    public b(InputStream inputStream, int i10) {
        this.f20240a = inputStream;
        this.f20241b = new byte[i10];
    }

    private int g(int i10) {
        int max = Math.max(this.f20241b.length * 2, i10);
        Runtime runtime = f20239f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f20244e || max >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f20241b, 0, bArr, 0, this.f20242c);
                this.f20241b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f20244e = false;
            }
        }
        return this.f20241b.length;
    }

    public int a(int i10) {
        int i11 = this.f20242c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f20242c = i13;
            byte[] bArr = this.f20241b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f20242c = 0;
        while (i12 < i10) {
            int skip = (int) this.f20240a.skip(i10 - i12);
            if (skip > 0) {
                i12 += skip;
            } else if (skip != 0) {
                continue;
            } else if (this.f20240a.read() == -1) {
                break;
            } else {
                i12++;
            }
        }
        return i12;
    }

    public int b() {
        return this.f20242c;
    }

    public void c() {
        this.f20240a.close();
    }

    public int d(int i10) {
        if (i10 > this.f20241b.length) {
            i10 = Math.min(i10, g(i10));
        }
        while (true) {
            int i11 = this.f20242c;
            if (i11 >= i10) {
                break;
            }
            int read = this.f20240a.read(this.f20241b, i11, i10 - i11);
            if (read == -1) {
                this.f20243d = true;
                break;
            }
            this.f20242c += read;
        }
        return this.f20242c;
    }

    public byte[] e() {
        return this.f20241b;
    }

    public boolean f() {
        return this.f20243d;
    }
}
