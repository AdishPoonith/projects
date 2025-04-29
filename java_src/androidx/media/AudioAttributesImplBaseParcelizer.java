package androidx.media;

import androidx.versionedparcelable.a;
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2605a = aVar.p(audioAttributesImplBase.f2605a, 1);
        audioAttributesImplBase.f2606b = aVar.p(audioAttributesImplBase.f2606b, 2);
        audioAttributesImplBase.f2607c = aVar.p(audioAttributesImplBase.f2607c, 3);
        audioAttributesImplBase.f2608d = aVar.p(audioAttributesImplBase.f2608d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2605a, 1);
        aVar.F(audioAttributesImplBase.f2606b, 2);
        aVar.F(audioAttributesImplBase.f2607c, 3);
        aVar.F(audioAttributesImplBase.f2608d, 4);
    }
}
