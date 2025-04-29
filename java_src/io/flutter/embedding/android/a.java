package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Matrix f10132e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private final p8.a f10133a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10135c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, float[]> f10136d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final u f10134b = u.a();

    public a(p8.a aVar, boolean z10) {
        this.f10133a = aVar;
        this.f10135c = z10;
    }

    private void a(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer) {
        long j10;
        long j11;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        InputDevice.MotionRange motionRange;
        if (i11 == -1) {
            return;
        }
        long d15 = this.f10135c ? this.f10134b.c(motionEvent).d() : 0L;
        int d16 = d(motionEvent.getToolType(i10));
        float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
        matrix.mapPoints(fArr);
        if (d16 == 1) {
            j10 = motionEvent.getButtonState() & 31;
            if (j10 == 0 && motionEvent.getSource() == 8194 && i11 == 4) {
                this.f10136d.put(Integer.valueOf(motionEvent.getPointerId(i10)), fArr);
            }
        } else {
            j10 = d16 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f10136d.containsKey(Integer.valueOf(motionEvent.getPointerId(i10)));
        int i13 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        byteBuffer.putLong(d15);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            byteBuffer.putLong(c(i11));
            j11 = 4;
        } else {
            byteBuffer.putLong(i11);
            j11 = d16;
        }
        byteBuffer.putLong(j11);
        byteBuffer.putLong(i13);
        byteBuffer.putLong(motionEvent.getPointerId(i10));
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.f10136d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j10);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i10));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d10 = 1.0d;
            d11 = 0.0d;
        } else {
            d11 = motionRange.getMin();
            d10 = motionRange.getMax();
        }
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d10);
        if (d16 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i10));
            d12 = 0.0d;
        } else {
            d12 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(motionEvent.getSize(i10));
        byteBuffer.putDouble(motionEvent.getToolMajor(i10));
        byteBuffer.putDouble(motionEvent.getToolMinor(i10));
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i10));
        if (d16 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(d12);
        }
        byteBuffer.putLong(i12);
        if (i13 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            d13 = -motionEvent.getAxisValue(9);
        } else {
            d13 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d13);
        if (containsKey) {
            float[] fArr3 = this.f10136d.get(Integer.valueOf(motionEvent.getPointerId(i10)));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d14 = 0.0d;
        } else {
            d14 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d14);
        byteBuffer.putDouble(d14);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d14);
        byteBuffer.putLong(0L);
        if (containsKey && c(i11) == 9) {
            this.f10136d.remove(Integer.valueOf(motionEvent.getPointerId(i10)));
        }
    }

    private int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 7) {
            return 3;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 == 8 ? 3 : -1;
    }

    private int c(int i10) {
        if (i10 == 4) {
            return 7;
        }
        if (i10 == 5) {
            return 8;
        }
        if (i10 == 6 || i10 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? 5 : 3;
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z10 = motionEvent.isFromSource(2);
        boolean z11 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (z10 && z11) {
            int b10 = b(motionEvent.getActionMasked());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 36 * 8);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            a(motionEvent, motionEvent.getActionIndex(), b10, 0, f10132e, allocateDirect);
            if (allocateDirect.position() % 288 == 0) {
                this.f10133a.j(allocateDirect, allocateDirect.position());
                return true;
            }
            throw new AssertionError("Packet position is not on field boundary.");
        }
        return false;
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f10132e);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 36
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L27
            r4 = 5
            if (r2 != r4) goto L25
            goto L27
        L25:
            r4 = 0
            goto L28
        L27:
            r4 = 1
        L28:
            if (r4 != 0) goto L31
            if (r2 == r10) goto L2f
            r5 = 6
            if (r2 != r5) goto L31
        L2f:
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            if (r4 == 0) goto L42
        L34:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L6f
        L42:
            r11 = 0
            if (r2 == 0) goto L60
        L45:
            if (r11 >= r0) goto L34
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L5d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L5d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L5d:
            int r11 = r11 + 1
            goto L45
        L60:
            if (r11 >= r0) goto L6f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L60
        L6f:
            int r13 = r1.position()
            int r13 = r13 % 288
            if (r13 != 0) goto L81
            p8.a r13 = r12.f10133a
            int r14 = r1.position()
            r13.j(r1, r14)
            return r10
        L81:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.a.g(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
