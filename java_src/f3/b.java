package f3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import d3.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.n0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f8780h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f8781i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f8782j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f8783a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f8784b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f8785c;

    /* renamed from: d  reason: collision with root package name */
    private final C0143b f8786d;

    /* renamed from: e  reason: collision with root package name */
    private final a f8787e;

    /* renamed from: f  reason: collision with root package name */
    private final h f8788f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f8789g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8790a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f8791b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f8792c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f8793d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8790a = i10;
            this.f8791b = iArr;
            this.f8792c = iArr2;
            this.f8793d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0143b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8794a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8795b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8796c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8797d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8798e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8799f;

        public C0143b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8794a = i10;
            this.f8795b = i11;
            this.f8796c = i12;
            this.f8797d = i13;
            this.f8798e = i14;
            this.f8799f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8800a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8801b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f8802c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f8803d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f8800a = i10;
            this.f8801b = z10;
            this.f8802c = bArr;
            this.f8803d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f8804a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8805b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8806c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f8807d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f8804a = i10;
            this.f8805b = i11;
            this.f8806c = i12;
            this.f8807d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f8808a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8809b;

        public e(int i10, int i11) {
            this.f8808a = i10;
            this.f8809b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f8810a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8811b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8812c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8813d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8814e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8815f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8816g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8817h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8818i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8819j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f8820k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f8810a = i10;
            this.f8811b = z10;
            this.f8812c = i11;
            this.f8813d = i12;
            this.f8814e = i13;
            this.f8815f = i14;
            this.f8816g = i15;
            this.f8817h = i16;
            this.f8818i = i17;
            this.f8819j = i18;
            this.f8820k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f8820k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f8820k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f8821a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8822b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8823c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8824d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8825e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8826f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8821a = i10;
            this.f8822b = i11;
            this.f8823c = i12;
            this.f8824d = i13;
            this.f8825e = i14;
            this.f8826f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f8827a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8828b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f8829c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f8830d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f8831e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f8832f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f8833g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0143b f8834h;

        /* renamed from: i  reason: collision with root package name */
        public d f8835i;

        public h(int i10, int i11) {
            this.f8827a = i10;
            this.f8828b = i11;
        }

        public void a() {
            this.f8829c.clear();
            this.f8830d.clear();
            this.f8831e.clear();
            this.f8832f.clear();
            this.f8833g.clear();
            this.f8834h = null;
            this.f8835i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f8783a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f8784b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8785c = new Canvas();
        this.f8786d = new C0143b(719, 575, 0, 719, 0, 575);
        this.f8787e = new a(0, c(), d(), e());
        this.f8788f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[LOOP:0: B:3:0x0009->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(p3.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L59
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L20:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L59
        L28:
            boolean r4 = r13.g()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L56
            if (r4 == r5) goto L52
            if (r4 == r3) goto L4a
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L59
        L41:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L20
        L4a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L20
        L52:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L59
        L56:
            r4 = 0
            r11 = 1
            goto L3f
        L59:
            if (r12 == 0) goto L77
            if (r8 == 0) goto L77
            if (r15 == 0) goto L61
            r4 = r15[r4]
        L61:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L77:
            int r10 = r10 + r12
            if (r11 == 0) goto L7b
            return r10
        L7b:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b.g(p3.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:3:0x0009->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int h(p3.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L13:
            r12 = 1
            goto L65
        L15:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L2b
            int r3 = r13.h(r7)
            if (r3 == 0) goto L28
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L65
        L28:
            r4 = 0
            r11 = 1
            goto L4c
        L2b:
            boolean r4 = r13.g()
            if (r4 != 0) goto L3e
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L37:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L65
        L3e:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L62
            if (r4 == r6) goto L5e
            if (r4 == r5) goto L57
            if (r4 == r7) goto L4e
            r11 = r2
            r4 = 0
        L4c:
            r12 = 0
            goto L65
        L4e:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L37
        L57:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L37
        L5e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L65
        L62:
            r11 = r2
            r4 = 0
            goto L13
        L65:
            if (r12 == 0) goto L81
            if (r8 == 0) goto L81
            if (r15 == 0) goto L6d
            r4 = r15[r4]
        L6d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L81:
            int r10 = r10 + r12
            if (r11 == 0) goto L85
            return r10
        L85:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b.h(p3.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int i(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = zVar.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (zVar.g()) {
                z10 = z11;
                h10 = zVar.h(7);
                h11 = zVar.h(8);
            } else {
                int h12 = zVar.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    h11 = 0;
                    z10 = true;
                    h10 = 0;
                }
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i12, i11, i12 + h10, i11 + 1, paint);
            }
            i12 += h10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        z zVar = new z(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zVar.b() != 0) {
            int h10 = zVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                                zVar.c();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f8780h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f8781i : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                        zVar.c();
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f8782j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(zVar, iArr, bArr4, i13, i14, paint, canvas);
                        zVar.c();
                        break;
                    case 18:
                        i13 = i(zVar, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case 32:
                                bArr7 = a(4, 4, zVar);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, zVar);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, zVar);
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f8793d : i10 == 2 ? aVar.f8792c : aVar.f8791b;
        j(cVar.f8802c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f8803d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(z zVar, int i10) {
        int h10;
        int i11;
        int h11;
        int h12;
        int i12;
        int i13 = 8;
        int h13 = zVar.h(8);
        zVar.r(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i15 > 0) {
            int h14 = zVar.h(i13);
            int h15 = zVar.h(i13);
            int i16 = i15 - 2;
            int[] iArr = (h15 & 128) != 0 ? c10 : (h15 & 64) != 0 ? d10 : e10;
            if ((h15 & 1) != 0) {
                h12 = zVar.h(i13);
                i12 = zVar.h(i13);
                h10 = zVar.h(i13);
                h11 = zVar.h(i13);
                i11 = i16 - 4;
            } else {
                int h16 = zVar.h(4) << 4;
                h10 = zVar.h(4) << 4;
                i11 = i16 - 2;
                h11 = zVar.h(i14) << 6;
                h12 = zVar.h(6) << i14;
                i12 = h16;
            }
            if (h12 == 0) {
                i12 = 0;
                h10 = 0;
                h11 = 255;
            }
            double d11 = h12;
            double d12 = i12 - 128;
            double d13 = h10 - 128;
            iArr[h14] = f((byte) (255 - (h11 & 255)), n0.q((int) (d11 + (1.402d * d12)), 0, 255), n0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), n0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i11;
            h13 = h13;
            i13 = 8;
            i14 = 2;
        }
        return new a(h13, c10, d10, e10);
    }

    private static C0143b m(z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int h10 = zVar.h(16);
        int h11 = zVar.h(16);
        if (g10) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            int h14 = zVar.h(16);
            i11 = zVar.h(16);
            i10 = h13;
            i13 = h14;
            i12 = h12;
        } else {
            i10 = h10;
            i11 = h11;
            i12 = 0;
            i13 = 0;
        }
        return new C0143b(h10, h11, i12, i10, i13, i11);
    }

    private static c n(z zVar) {
        byte[] bArr;
        int h10 = zVar.h(16);
        zVar.r(4);
        int h11 = zVar.h(2);
        boolean g10 = zVar.g();
        zVar.r(1);
        byte[] bArr2 = n0.f15402f;
        if (h11 == 1) {
            zVar.r(zVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                zVar.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                zVar.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(z zVar, int i10) {
        int h10 = zVar.h(8);
        int h11 = zVar.h(4);
        int h12 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(z zVar, int i10) {
        int h10;
        int h11;
        int h12 = zVar.h(8);
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int i11 = 16;
        int h13 = zVar.h(16);
        int h14 = zVar.h(16);
        int h15 = zVar.h(3);
        int h16 = zVar.h(3);
        int i12 = 2;
        zVar.r(2);
        int h17 = zVar.h(8);
        int h18 = zVar.h(8);
        int h19 = zVar.h(4);
        int h20 = zVar.h(2);
        zVar.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h21 = zVar.h(i11);
            int h22 = zVar.h(i12);
            int h23 = zVar.h(i12);
            int h24 = zVar.h(12);
            int i14 = h20;
            zVar.r(4);
            int h25 = zVar.h(12);
            i13 -= 6;
            if (h22 == 1 || h22 == 2) {
                i13 -= 2;
                h10 = zVar.h(8);
                h11 = zVar.h(8);
            } else {
                h10 = 0;
                h11 = 0;
            }
            sparseArray.put(h21, new g(h22, h23, h24, h25, h10, h11));
            h20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(h12, g10, h13, h14, h15, h16, h17, h18, h19, h20, sparseArray);
    }

    private static void q(z zVar, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        a aVar2;
        c cVar;
        int h10 = zVar.h(8);
        int h11 = zVar.h(16);
        int h12 = zVar.h(16);
        int d10 = zVar.d() + h12;
        if (h12 * 8 > zVar.b()) {
            r.i("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f8827a) {
                    d dVar = hVar.f8835i;
                    d o10 = o(zVar, h12);
                    if (o10.f8806c == 0) {
                        if (dVar != null && dVar.f8805b != o10.f8805b) {
                            hVar.f8835i = o10;
                            break;
                        }
                    } else {
                        hVar.f8835i = o10;
                        hVar.f8829c.clear();
                        hVar.f8830d.clear();
                        hVar.f8831e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f8835i;
                if (h11 == hVar.f8827a && dVar2 != null) {
                    f p10 = p(zVar, h12);
                    if (dVar2.f8806c == 0 && (fVar = hVar.f8829c.get(p10.f8810a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f8829c.put(p10.f8810a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 == hVar.f8827a) {
                    a l10 = l(zVar, h12);
                    sparseArray = hVar.f8830d;
                    aVar = l10;
                } else if (h11 == hVar.f8828b) {
                    a l11 = l(zVar, h12);
                    sparseArray = hVar.f8832f;
                    aVar = l11;
                }
                i10 = aVar.f8790a;
                aVar2 = aVar;
                sparseArray.put(i10, aVar2);
                break;
            case 19:
                if (h11 == hVar.f8827a) {
                    c n10 = n(zVar);
                    sparseArray = hVar.f8831e;
                    cVar = n10;
                } else if (h11 == hVar.f8828b) {
                    c n11 = n(zVar);
                    sparseArray = hVar.f8833g;
                    cVar = n11;
                }
                i10 = cVar.f8800a;
                aVar2 = cVar;
                sparseArray.put(i10, aVar2);
                break;
            case 20:
                if (h11 == hVar.f8827a) {
                    hVar.f8834h = m(zVar);
                    break;
                }
                break;
        }
        zVar.s(d10 - zVar.d());
    }

    public List<d3.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        z zVar = new z(bArr, i10);
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            q(zVar, this.f8788f);
        }
        h hVar = this.f8788f;
        d dVar = hVar.f8835i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0143b c0143b = hVar.f8834h;
        if (c0143b == null) {
            c0143b = this.f8786d;
        }
        Bitmap bitmap = this.f8789g;
        if (bitmap == null || c0143b.f8794a + 1 != bitmap.getWidth() || c0143b.f8795b + 1 != this.f8789g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0143b.f8794a + 1, c0143b.f8795b + 1, Bitmap.Config.ARGB_8888);
            this.f8789g = createBitmap;
            this.f8785c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f8807d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f8785c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f8788f.f8829c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f8808a + c0143b.f8796c;
            int i14 = valueAt.f8809b + c0143b.f8798e;
            this.f8785c.clipRect(i13, i14, Math.min(fVar.f8812c + i13, c0143b.f8797d), Math.min(fVar.f8813d + i14, c0143b.f8799f));
            a aVar = this.f8788f.f8830d.get(fVar.f8816g);
            if (aVar == null && (aVar = this.f8788f.f8832f.get(fVar.f8816g)) == null) {
                aVar = this.f8787e;
            }
            SparseArray<g> sparseArray3 = fVar.f8820k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f8788f.f8831e.get(keyAt);
                c cVar2 = cVar == null ? this.f8788f.f8833g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f8815f, valueAt2.f8823c + i13, i14 + valueAt2.f8824d, cVar2.f8801b ? null : this.f8783a, this.f8785c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f8811b) {
                int i16 = fVar.f8815f;
                this.f8784b.setColor(i16 == 3 ? aVar.f8793d[fVar.f8817h] : i16 == 2 ? aVar.f8792c[fVar.f8818i] : aVar.f8791b[fVar.f8819j]);
                this.f8785c.drawRect(i13, i14, fVar.f8812c + i13, fVar.f8813d + i14, this.f8784b);
            }
            arrayList.add(new b.C0115b().f(Bitmap.createBitmap(this.f8789g, i13, i14, fVar.f8812c, fVar.f8813d)).k(i13 / c0143b.f8794a).l(0).h(i14 / c0143b.f8795b, 0).i(0).n(fVar.f8812c / c0143b.f8794a).g(fVar.f8813d / c0143b.f8795b).a());
            this.f8785c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f8785c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f8788f.a();
    }
}
