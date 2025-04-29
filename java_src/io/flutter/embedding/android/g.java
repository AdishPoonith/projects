package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public class g extends View implements p8.c {

    /* renamed from: j  reason: collision with root package name */
    private ImageReader f10166j;

    /* renamed from: k  reason: collision with root package name */
    private Image f10167k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f10168l;

    /* renamed from: m  reason: collision with root package name */
    private p8.a f10169m;

    /* renamed from: n  reason: collision with root package name */
    private b f10170n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10171o;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10172a;

        static {
            int[] iArr = new int[b.values().length];
            f10172a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10172a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public g(Context context, int i10, int i11, b bVar) {
        this(context, g(i10, i11), bVar);
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f10171o = false;
        this.f10166j = imageReader;
        this.f10170n = bVar;
        h();
    }

    private void b() {
        Image image = this.f10167k;
        if (image != null) {
            image.close();
            this.f10167k = null;
        }
    }

    private static ImageReader g(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i12, i13, 1, 3, 768L) : ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        d8.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f10167k.getHardwareBuffer();
            this.f10168l = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f10167k.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f10167k.getHeight();
        Bitmap bitmap = this.f10168l;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f10168l.getHeight() != height) {
            this.f10168l = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f10168l.copyPixelsFromBuffer(buffer);
    }

    public boolean a() {
        if (this.f10171o) {
            Image acquireLatestImage = this.f10166j.acquireLatestImage();
            if (acquireLatestImage != null) {
                b();
                this.f10167k = acquireLatestImage;
                invalidate();
            }
            return acquireLatestImage != null;
        }
        return false;
    }

    public void c() {
        this.f10166j.close();
    }

    @Override // p8.c
    public void d() {
    }

    @Override // p8.c
    public void e() {
        if (this.f10171o) {
            setAlpha(0.0f);
            a();
            this.f10168l = null;
            b();
            invalidate();
            this.f10171o = false;
        }
    }

    @Override // p8.c
    public void f(p8.a aVar) {
        if (a.f10172a[this.f10170n.ordinal()] == 1) {
            aVar.x(this.f10166j.getSurface());
        }
        setAlpha(1.0f);
        this.f10169m = aVar;
        this.f10171o = true;
    }

    @Override // p8.c
    public p8.a getAttachedRenderer() {
        return this.f10169m;
    }

    public ImageReader getImageReader() {
        return this.f10166j;
    }

    public Surface getSurface() {
        return this.f10166j.getSurface();
    }

    public void j(int i10, int i11) {
        if (this.f10169m == null) {
            return;
        }
        if (i10 == this.f10166j.getWidth() && i11 == this.f10166j.getHeight()) {
            return;
        }
        b();
        c();
        this.f10166j = g(i10, i11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10167k != null) {
            k();
        }
        Bitmap bitmap = this.f10168l;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f10166j.getWidth() && i11 == this.f10166j.getHeight()) && this.f10170n == b.background && this.f10171o) {
            j(i10, i11);
            this.f10169m.x(this.f10166j.getSurface());
        }
    }
}
