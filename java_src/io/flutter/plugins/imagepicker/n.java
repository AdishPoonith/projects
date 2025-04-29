package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10765a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10766b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, a aVar) {
        this.f10765a = context;
        this.f10766b = aVar;
    }

    private int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        r5 = java.lang.Double.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r3 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r13.doubleValue() < r12.doubleValue()) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.core.util.e b(java.lang.Double r12, java.lang.Double r13, java.lang.Double r14, java.lang.Double r15) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            if (r15 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            double r4 = r12.doubleValue()
            if (r2 == 0) goto L1a
            double r6 = r14.doubleValue()
            double r4 = java.lang.Math.min(r4, r6)
        L1a:
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            double r5 = r13.doubleValue()
            if (r3 == 0) goto L2c
            double r7 = r15.doubleValue()
            double r5 = java.lang.Math.min(r5, r7)
        L2c:
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            if (r2 == 0) goto L40
            double r6 = r14.doubleValue()
            double r8 = r12.doubleValue()
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 >= 0) goto L40
            r14 = 1
            goto L41
        L40:
            r14 = 0
        L41:
            if (r3 == 0) goto L51
            double r6 = r15.doubleValue()
            double r8 = r13.doubleValue()
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 >= 0) goto L51
            r15 = 1
            goto L52
        L51:
            r15 = 0
        L52:
            if (r14 != 0) goto L58
            if (r15 == 0) goto L57
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto Lb9
            double r14 = r5.doubleValue()
            double r0 = r13.doubleValue()
            double r14 = r14 / r0
            double r0 = r12.doubleValue()
            double r14 = r14 * r0
            double r0 = r4.doubleValue()
            double r6 = r12.doubleValue()
            double r0 = r0 / r6
            double r6 = r13.doubleValue()
            double r0 = r0 * r6
            double r6 = r4.doubleValue()
            double r8 = r5.doubleValue()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L90
            if (r2 != 0) goto L8b
        L86:
            java.lang.Double r4 = java.lang.Double.valueOf(r14)
            goto Lb9
        L8b:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            goto Lb9
        L90:
            double r6 = r5.doubleValue()
            double r8 = r4.doubleValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L9f
            if (r3 != 0) goto L86
            goto L8b
        L9f:
            double r2 = r12.doubleValue()
            double r6 = r13.doubleValue()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lac
            goto L86
        Lac:
            double r13 = r13.doubleValue()
            double r2 = r12.doubleValue()
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto Lb9
            goto L8b
        Lb9:
            androidx.core.util.e r12 = new androidx.core.util.e
            float r13 = r4.floatValue()
            float r14 = r5.floatValue()
            r12.<init>(r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.n.b(java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double):androidx.core.util.e");
    }

    private void c(String str, String str2) {
        this.f10766b.a(str, str2);
    }

    private File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File e(String str, Bitmap bitmap, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File d10 = d(this.f10765a.getCacheDir(), str);
        FileOutputStream f10 = f(d10);
        f10.write(byteArrayOutputStream.toByteArray());
        f10.close();
        return d10;
    }

    private FileOutputStream f(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap g(Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    private Bitmap h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private androidx.core.util.e i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h(str, options);
        return new androidx.core.util.e(options.outWidth, options.outHeight);
    }

    private File k(Bitmap bitmap, Double d10, Double d11, int i10, String str) {
        Bitmap g10 = g(bitmap, d10.intValue(), d11.intValue(), false);
        return e("/scaled_" + str, g10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j(String str, Double d10, Double d11, int i10) {
        androidx.core.util.e i11 = i(str);
        if (i11.b() == -1.0f || i11.a() == -1.0f) {
            return str;
        }
        if ((d10 == null && d11 == null && i10 >= 100) ? false : true) {
            try {
                String[] split = str.split("/");
                String str2 = split[split.length - 1];
                androidx.core.util.e b10 = b(Double.valueOf(i11.b()), Double.valueOf(i11.a()), d10, d11);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a(options, (int) b10.b(), (int) b10.a());
                Bitmap h10 = h(str, options);
                if (h10 == null) {
                    return str;
                }
                File k10 = k(h10, Double.valueOf(b10.b()), Double.valueOf(b10.a()), i10, str2);
                c(str, k10.getPath());
                return k10.getPath();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return str;
    }
}
