package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f2603a;

    /* renamed from: b  reason: collision with root package name */
    int f2604b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2603a.equals(((AudioAttributesImplApi21) obj).f2603a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2603a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2603a;
    }
}
