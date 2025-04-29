package t0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
/* loaded from: classes.dex */
public final class m implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17966b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private b f17967a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            this.f17967a = bVar;
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(sensor, "sensor");
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(event, "event");
            b bVar = this.f17967a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                bVar.a();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
