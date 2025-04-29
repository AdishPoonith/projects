package v1;

import p3.n0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f19351a;

    /* renamed from: b  reason: collision with root package name */
    public int f19352b;

    /* renamed from: c  reason: collision with root package name */
    public int f19353c;

    /* renamed from: d  reason: collision with root package name */
    public int f19354d;

    /* renamed from: e  reason: collision with root package name */
    public int f19355e;

    /* renamed from: f  reason: collision with root package name */
    public int f19356f;

    /* renamed from: g  reason: collision with root package name */
    public int f19357g;

    /* renamed from: h  reason: collision with root package name */
    public int f19358h;

    /* renamed from: i  reason: collision with root package name */
    public int f19359i;

    /* renamed from: j  reason: collision with root package name */
    public int f19360j;

    /* renamed from: k  reason: collision with root package name */
    public long f19361k;

    /* renamed from: l  reason: collision with root package name */
    public int f19362l;

    private void b(long j10, int i10) {
        this.f19361k += j10;
        this.f19362l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return n0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f19351a), Integer.valueOf(this.f19352b), Integer.valueOf(this.f19353c), Integer.valueOf(this.f19354d), Integer.valueOf(this.f19355e), Integer.valueOf(this.f19356f), Integer.valueOf(this.f19357g), Integer.valueOf(this.f19358h), Integer.valueOf(this.f19359i), Integer.valueOf(this.f19360j), Long.valueOf(this.f19361k), Integer.valueOf(this.f19362l));
    }
}
