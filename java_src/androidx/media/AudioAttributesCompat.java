package androidx.media;

import android.util.SparseIntArray;
import i0.a;
/* loaded from: classes.dex */
public class AudioAttributesCompat implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f2600b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2601c;

    /* renamed from: a  reason: collision with root package name */
    AudioAttributesImpl f2602a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2600b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f2601c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        } else if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        } else {
            switch (i11) {
                case 0:
                    return z10 ? Integer.MIN_VALUE : 3;
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z10 ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (z10) {
                        throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
                    }
                    return 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.f2602a;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f2602a;
            return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
        }
        return false;
    }

    public int hashCode() {
        return this.f2602a.hashCode();
    }

    public String toString() {
        return this.f2602a.toString();
    }
}
