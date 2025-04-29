package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    private static u f10270c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f10271a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Long> f10272b = new PriorityQueue<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicLong f10273b = new AtomicLong(0);

        /* renamed from: a  reason: collision with root package name */
        private final long f10274a;

        private a(long j10) {
            this.f10274a = j10;
        }

        public static a b() {
            return c(f10273b.incrementAndGet());
        }

        public static a c(long j10) {
            return new a(j10);
        }

        public long d() {
            return this.f10274a;
        }
    }

    private u() {
    }

    public static u a() {
        if (f10270c == null) {
            f10270c = new u();
        }
        return f10270c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f10272b.isEmpty() && this.f10272b.peek().longValue() < aVar.f10274a) {
            this.f10271a.remove(this.f10272b.poll().longValue());
        }
        if (!this.f10272b.isEmpty() && this.f10272b.peek().longValue() == aVar.f10274a) {
            this.f10272b.poll();
        }
        MotionEvent motionEvent = this.f10271a.get(aVar.f10274a);
        this.f10271a.remove(aVar.f10274a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b10 = a.b();
        this.f10271a.put(b10.f10274a, MotionEvent.obtain(motionEvent));
        this.f10272b.add(Long.valueOf(b10.f10274a));
        return b10;
    }
}
