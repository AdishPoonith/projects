package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
