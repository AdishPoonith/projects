.class final Lcom/google/android/recaptcha/internal/zzac;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/l;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzac;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzac;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzac;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzac;->zza:Lcom/google/android/recaptcha/internal/zzac;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzae;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzae;->zza()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
