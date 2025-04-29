package z0;

import kotlin.jvm.internal.l;
import t9.k;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0292a f20631d = new C0292a(null);

    /* renamed from: a  reason: collision with root package name */
    private int[] f20632a;

    /* renamed from: b  reason: collision with root package name */
    private int f20633b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f20634c;

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0292a {
        private C0292a() {
        }

        public /* synthetic */ C0292a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            int o10;
            int i10 = 1;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i11 = iArr[0];
            o10 = k.o(iArr);
            if (1 <= o10) {
                while (true) {
                    i11 *= iArr[i10];
                    if (i10 == o10) {
                        break;
                    }
                    i10++;
                }
            }
            return i11;
        }
    }

    public a(int[] shape) {
        l.e(shape, "shape");
        this.f20632a = shape;
        int b10 = f20631d.b(shape);
        this.f20633b = b10;
        this.f20634c = new float[b10];
    }

    public final float[] a() {
        return this.f20634c;
    }

    public final int b(int i10) {
        return this.f20632a[i10];
    }

    public final int c() {
        return this.f20632a.length;
    }

    public final void d(int[] shape) {
        l.e(shape, "shape");
        this.f20632a = shape;
        int b10 = f20631d.b(shape);
        float[] fArr = new float[b10];
        System.arraycopy(this.f20634c, 0, fArr, 0, Math.min(this.f20633b, b10));
        this.f20634c = fArr;
        this.f20633b = b10;
    }
}
